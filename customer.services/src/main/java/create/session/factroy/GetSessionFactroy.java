package create.session.factroy;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;
import org.hibernate.service.ServiceRegistry;

import customer.servicescustomer.portal.models.Customer;
import customer.servicescustomer.portal.models.Employee;
import customer.servicescustomer.portal.models.Test;


public class GetSessionFactroy {

	public static SessionFactory getSessionFactroty() {
		
		// one seesion object means one connection object
		// SessionFactroy contain pool of session objects
		SessionFactory sessionFactory = null;
		
		Configuration config = new Configuration();
	
		// here we configured connection properties
		config.setProperty(Environment.DRIVER, "com.mysql.cj.jdbc.Driver");
		config.setProperty(Environment.URL,"jdbc:mysql://localhost:3306/hibenate_db");
		config.setProperty(Environment.USER, "root");
		config.setProperty(Environment.PASS, "root");
		
		// here we configured hibernate properties
		config.setProperty(Environment.DIALECT, "org.hibernate.dialect.MySQL5Dialect");
		config.setProperty(Environment.SHOW_SQL,"true");
		
		//here we configured mapping classes
		config.addAnnotatedClass(Customer.class);
		config.addAnnotatedClass(Employee.class);
		config.addAnnotatedClass(Test.class);
		
	
		
		ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder().applySettings(config.getProperties()).build();
		
		
		sessionFactory = config.buildSessionFactory(serviceRegistry);
		
		
		return sessionFactory;
	}
}
