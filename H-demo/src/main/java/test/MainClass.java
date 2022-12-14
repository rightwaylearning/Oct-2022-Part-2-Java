package test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class MainClass {

	public static void main(String[] args) {
		
		Configuration con = new Configuration();
		con.configure();
		
		SessionFactory f = con.buildSessionFactory();
		
		Session s = f.openSession();
		
		New_User u =(New_User) s.get(New_User.class, 1);
		s.close();
		f.close();
	}
}
