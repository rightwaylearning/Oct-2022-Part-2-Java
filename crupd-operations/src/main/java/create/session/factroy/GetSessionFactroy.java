package create.session.factroy;

import java.util.Properties;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;
import org.hibernate.dialect.MySQL5Dialect;

import com.mysql.cj.jdbc.Driver;

public class GetSessionFactroy {

	public static SessionFactory getSessionFactroty() {
		
		SessionFactory sessionFactory = null;
	
		// hibernate propeties
//		Properties p = new Properties();
//		p.put(Environment.DRIVER, "com.mysql.cj.jdbc.Driver");
//		p.put(Environment.URL,"jdbc:mysql://localhost:3306/hibenate_db");
//		p.put(Environment.USER, "root");
//		p.put(Environment.PASS, "root");
//		p.put(Environment.DIALECT, "org.hibernate.dialect.MySQL5Dialect");
//	    p.put(Environment.SHOW_SQL,"true");
//	    
//	    
//	    Configuration config = new Configuration();
//	    config.setProperties(p);
		
		Configuration config = new Configuration();
		config.setProperty(Environment.DRIVER, "com.mysql.cj.jdbc.Driver");
		config.setProperty(Environment.URL,"jdbc:mysql://localhost:3306/hibenate_db");
		config.setProperty(Environment.USER, "root");
		config.setProperty(Environment.PASS, "root");
		config.setProperty(Environment.DIALECT, "org.hibernate.dialect.MySQL5Dialect");
		config.setProperty(Environment.SHOW_SQL,"true");
		
		
		
		
		
		return sessionFactory;
	}
}
