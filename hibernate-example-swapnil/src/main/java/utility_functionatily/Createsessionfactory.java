package utility_functionatily;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Properties;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;
import org.hibernate.service.ServiceRegistry;

import movie.model.Movie;

public class Createsessionfactory {

	public static SessionFactory getsessionfactory() throws Exception {
		// TODO Auto-generated method stub
		
		FileReader fileReader = new FileReader("E:\\FULL STACK DEVELOPMENT JAN\\BACKEND DEVELOPMENT\\Oct-2022-Part-2-Java\\hibernate-example-swapnil\\src\\main\\resources\\hibernate_configuration");
        Properties p = new Properties();
        p.load(fileReader);
        
        Configuration configuration = new Configuration();
        
        //configuration property
        configuration.setProperty(Environment.DRIVER, p.getProperty("driver"));
        configuration.setProperty(Environment.URL, p.getProperty("db_url"));
	    configuration.setProperty(Environment.USER, p.getProperty("db_user_name"));
	    configuration.setProperty(Environment.PASS, p.getProperty("db_password"));
	
	    //hibernate property
	    
	    configuration.setProperty(Environment.DIALECT, p.getProperty("hibernate_dilect_class"));
	    configuration.setProperty(Environment.SHOW_SQL, p.getProperty("show_sql_status"));
	
	    // this is default value of hbm2ddl that is validate
	 	// configuration.setProperty(Environment.HBM2DDL_AUTO, "validate");
	    // this is create value of hbm2ddl 
	 	// configuration.setProperty(Environment.HBM2DDL_AUTO, "create");
	 	// configuration.setProperty(Environment.HBM2DDL_AUTO, "update");
	 	   configuration.setProperty("hibernate.hbm2ddl.auto", "update");
	
	 
	 	   //add entity class
	 	   configuration.addAnnotatedClass(Movie.class);
	 	   
	 	   ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder().applySettings(configuration.getProperties()).build();
	 	 SessionFactory  sessionFactory = configuration.buildSessionFactory(serviceRegistry);
	 	
	 	   return sessionFactory;
	}

}
