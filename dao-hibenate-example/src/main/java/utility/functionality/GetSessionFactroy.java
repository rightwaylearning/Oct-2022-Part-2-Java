package utility.functionality;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;
import org.hibernate.service.ServiceRegistry;

import many_to_one.DoctorNew;
import many_to_one.PatientNew;
import one_to_many_rel.Doctor;
import one_to_many_rel.Patient;

public class GetSessionFactroy {

	public static SessionFactory getSessionfactroy() throws Exception{
		
		 SessionFactory sessionFactory = null;
		
         Configuration 	 configuration = new Configuration();
         
         // connection property
         configuration.setProperty(Environment.DRIVER, "com.mysql.cj.jdbc.Driver");
         configuration.setProperty(Environment.URL,"jdbc:mysql://localhost:3306/mapping");
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
		 
//		 configuration.addAnnotatedClass(Movie.class);
//		 configuration.addAnnotatedClass(Payment.class);
//		 configuration.addAnnotatedClass(Card.class);
//		 configuration.addAnnotatedClass(Cheque.class);
//		 
//		 configuration.addAnnotatedClass(Payment1.class);
//		 configuration.addAnnotatedClass(Card1.class);
//		 configuration.addAnnotatedClass(Cheque1.class);
//		 
//		 configuration.addAnnotatedClass(Payment11.class);
//		 configuration.addAnnotatedClass(Card11.class);
//		 configuration.addAnnotatedClass(Cheque11.class);
//		 configuration.addAnnotatedClass(Employee.class);
//		 
//		 configuration.addAnnotatedClass(Doctor.class);
//
//		 configuration.addAnnotatedClass(Patient.class);
//		 
//		 configuration.addAnnotatedClass(Doctor.class);
//		 configuration.addAnnotatedClass(Patient.class);
		
		configuration.addAnnotatedClass(Doctor.class);
		configuration.addAnnotatedClass(Patient.class);
		
		configuration.addAnnotatedClass(DoctorNew.class);
		configuration.addAnnotatedClass(PatientNew.class);
		
		
		
		 
		 
		 StandardServiceRegistryBuilder ssrg = new StandardServiceRegistryBuilder().applySettings(configuration.getProperties());
		 
		 ServiceRegistry serviceRegistry = ssrg.build();
		
		
		 sessionFactory = configuration.buildSessionFactory(serviceRegistry);
		 
		 
		
		return sessionFactory;
		
	}
}
