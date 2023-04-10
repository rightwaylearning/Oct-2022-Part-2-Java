package utility.functionality;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Properties;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;
import org.hibernate.service.ServiceRegistry;

import movie.model.Movie;

public class GetSessionFactroy {

	public static SessionFactory getSessionfactroy() throws Exception{
		
		 SessionFactory sessionFactory = null;
		
         Configuration 	 configuration = new Configuration();
         
         // connection property
         configuration.setProperty(Environment.DRIVER, "com.mysql.cj.jdbc.Driver");
         configuration.setProperty(Environment.URL,"jdbc:mysql://localhost:3306/hibenate_db");
         configuration.setProperty(Environment.USER,"root");
         configuration.setProperty(Environment.PASS,"root");
         
         // hibernate properties
         configuration.setProperty(Environment.DIALECT, "org.hibernate.dialect.MySQL5Dialect");
		 configuration.setProperty(Environment.SHOW_SQL, "true");
		 
		 // validate 
		// configuration.setProperty(Environment.HBM2DDL_AUTO, "validate");
		 
		 // create
		//  configuration.setProperty(Environment.HBM2DDL_AUTO, "create");
		 
		 // create-drop
		// configuration.setProperty(Environment.HBM2DDL_AUTO, "create-drop");
		 
		// update
		configuration.setProperty(Environment.HBM2DDL_AUTO, "update");
		 
		 
		 // Entity class need to load
		 
		 configuration.addAnnotatedClass(Movie.class);
		 
		 
		 StandardServiceRegistryBuilder ssrg = new StandardServiceRegistryBuilder().applySettings(configuration.getProperties());
		 
		 ServiceRegistry serviceRegistry = ssrg.build();
		
		
		 sessionFactory = configuration.buildSessionFactory(serviceRegistry);
		 
		 
		
		return sessionFactory;
		
	}
}
