package create.session.factroy;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;
import org.hibernate.service.ServiceRegistry;

import employee.model.Employee;

public class GetSessionFactroy {

	public static SessionFactory getSessionFactroty() {
		
		// one seesion object means one connection object
		// SessionFactroy contain pool of session objects
		SessionFactory sessionFactory = null;
		
		Configuration config = new Configuration();
		// connection properties
		config.setProperty(Environment.DRIVER, "com.mysql.cj.jdbc.Driver");
		config.setProperty(Environment.URL,"jdbc:mysql://localhost:3306/hibenate_db");
		config.setProperty(Environment.USER, "root");
		config.setProperty(Environment.PASS, "root");
		
		// hibernate properties
		config.setProperty(Environment.DIALECT, "org.hibernate.dialect.MySQL5Dialect");
		config.setProperty(Environment.SHOW_SQL,"true");
		
		// mapping classes
		config.addAnnotatedClass(Employee.class);
		
		//-----------------------------------------------------
		
		
		
//		StandardServiceRegistryBuilder builder= new StandardServiceRegistryBuilder();
//		
//		StandardServiceRegistryBuilder builder1 = builder.applySettings(config.getProperties());
//		
//		ServiceRegistry serviceRegistry = builder1.build();
		
		
		
		ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder().applySettings(config.getProperties()).build();
		
		
		sessionFactory = config.buildSessionFactory(serviceRegistry);
		
		
		return sessionFactory;
	}
}
