package native_sql.queries;

import java.util.List;

import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.Transaction;

import create.session.factroy.GetSessionFactroy;
import customer.servicescustomer.portal.models.Employee;

public class SelectOperation {

	public static void main(String[] args) {
		
//		Session session = GetSessionFactroy.getSessionFactroty().openSession();
//		SQLQuery<Employee> query = session.createSQLQuery("SELECT * FROM employee e");
//		query.addEntity(Employee.class);
//		List<Employee> list = query.list();
//		
//		list.stream().forEach(System.out::println);
		
		//---------------------------------------
		
//		Session session = GetSessionFactroy.getSessionFactroty().openSession();
//		SQLQuery query = session.createSQLQuery("SELECT * FROM employee e");
//		//query.addEntity(Employee.class);
//		List<Object[]> list = query.list();
//		
//		list.stream().forEach(obj ->{
//			System.out.println(obj[0]+" "+obj[1]+" "+obj[2]+" "+obj[3]);
//		});
		
		
//		Session session = GetSessionFactroy.getSessionFactroty().openSession();
//		SQLQuery query = session.createSQLQuery("SELECT * FROM employee e where e.salary > ?");
//	    query.setParameter(1, 200000.0);
//		List<Object[]> list = query.list();
//		
//		list.stream().forEach(obj ->{
//			System.out.println(obj[0]+" "+obj[1]+" "+obj[2]+" "+obj[3]);
//		});
		
		
//		Session session = GetSessionFactroy.getSessionFactroty().openSession();
//		SQLQuery query = session.createSQLQuery("insert into employee values(?,?,?,?)");
//	    query.setParameter(1, 9898);
//	    query.setParameter(2, "Madhu");
//	    query.setParameter(3, "testing");
//	    query.setParameter(4, 34567.90);
//	     Transaction tx = session.beginTransaction();
//	    int i = query.executeUpdate();
//	    tx.commit();
//	    session.close();
		
		Session session = GetSessionFactroy.getSessionFactroty().openSession();
		SQLQuery query = session.createSQLQuery("update employee set salary = ? where eid = ? ");
		query.setParameter(1, 51345.89);
		query.setParameter(2, 9898);

		Transaction tx = session.beginTransaction();
		int i = query.executeUpdate();
		tx.commit();
		session.close();
		
		
	}
}
