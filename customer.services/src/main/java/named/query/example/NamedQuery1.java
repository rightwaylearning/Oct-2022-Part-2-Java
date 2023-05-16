package named.query.example;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.query.Query;

import create.session.factroy.GetSessionFactroy;

public class NamedQuery1 {

	public static void main(String[] args) {
		
		Session session= GetSessionFactroy.getSessionFactroty().openSession();
		Query<Object[]> query = session.createNamedQuery("customer_name");
	    query.setParameter("id", "C - rohit.sharma8976");
	    List<Object[]> list = query.list();
	    session.close();
	    list.stream().forEach(x->{
	    	System.out.println(x[0] +" "+x[1]);
	    });
	}
}
