package utility.functionality;

import java.io.FileReader;
import java.util.Properties;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;
import org.hibernate.service.ServiceRegistry;

import movie.model.Movie;

public class CreateSessionFactroyInstance {

	
	 public static SessionFactory getSessionFactroy() throws Exception{
		 SessionFactory sessionFactory = null;
		 
		 FileReader reader = new FileReader("D:\\ALL_ Repositories\\Oct-2022-Part-2-Java\\dao-hibenate-example\\src\\main\\resources\\hibernate_configutaion.properties");
		 Properties p= new Properties();
		 p.load(reader);
		 
		 Configuration configuration = new Configuration();
		 // connection property
		 configuration.setProperty(Environment.DRIVER, p.getProperty("driver"));
		 configuration.setProperty(Environment.URL, p.getProperty("db_url"));
		 configuration.setProperty(Environment.USER, p.getProperty("db_user_name"));
		 configuration.setProperty(Environment.PASS, p.getProperty("db_password"));
		 
		 // hibernate property
		 configuration.setProperty(Environment.DIALECT, p.getProperty("hibernate_dilect_class"));
		 configuration.setProperty(Environment.SHOW_SQL, p.getProperty("show_sql_status"));
		 
		 // this is default value of hbm2ddl that is validate
		// configuration.setProperty(Environment.HBM2DDL_AUTO, "validate");
		 // this is create value of hbm2ddl 
		// configuration.setProperty(Environment.HBM2DDL_AUTO, "create");
		// configuration.setProperty(Environment.HBM2DDL_AUTO, "update");
		 configuration.setProperty("hibernate.hbm2ddl.auto", "create");
		                              
		 
		 
		 // add entity class
		 configuration.addAnnotatedClass(Movie.class);
		
		 ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder().applySettings(configuration.getProperties()).build();
		 
		 sessionFactory = configuration.buildSessionFactory(serviceRegistry);
		 
		 
		 return sessionFactory;
	 }
	
}
