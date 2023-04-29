package create.session.factory;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;
import org.hibernate.service.ServiceRegistry;

import customer_info_modelclass.Customer;
import customer_info_modelclass.Employee;




public class GetSession_Factory {
	public static SessionFactory getsessionfactory() {
		SessionFactory sessionFactory = null;

		Configuration configuration = new Configuration();

		// connection property
		                                               //hibernate.connection.driver_class 
		configuration.setProperty(Environment.DRIVER, "com.mysql.cj.jdbc.Driver");
		configuration.setProperty(Environment.URL, "jdbc:mysql://localhost:3306/hibernate_db");
		configuration.setProperty(Environment.USER, "root");
		configuration.setProperty(Environment.PASS, "root");

		// hibernate property
		configuration.setProperty(Environment.DIALECT, "org.hibernate.dialect.MySQL5Dialect");
		configuration.setProperty(Environment.SHOW_SQL, "true");

		// entity class need to load
		configuration.addAnnotatedClass(Customer.class);
		configuration.addAnnotatedClass(Employee.class);
		

		StandardServiceRegistryBuilder ssrg = new StandardServiceRegistryBuilder()
				.applySettings(configuration.getProperties());
		ServiceRegistry serviceRegistry = ssrg.build();

		sessionFactory = configuration.buildSessionFactory(serviceRegistry);

		return sessionFactory;

	}

}
