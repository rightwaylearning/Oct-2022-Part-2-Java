package employeedao;

import org.hibernate.Transaction;

import com.mysql.cj.Session;

import employeemodel.Employee;
import utility_functionatily.GetsessionFactory;

public class Operation {

	public static void main(String[] args) throws Exception {
		
	
		// insert object into database
//		Employee e = new Employee(103, "shital", "Vyavahare", 2000D);
//		org.hibernate.Session session =  GetsessionFactory.getsessionfactory().openSession();
//		session.save(e);
//		Transaction tx = session.beginTransaction();
//		tx.commit();
//		session.close();
		
		//read / get object from database
		
//		org.hibernate.Session session2 = GetsessionFactory.getsessionfactory().openSession();
//		Employee employee = session2.get(Employee.class, 101);
//		Employee employee2= session2.get(Employee.class, 102);
//		Employee employee3= session2.get(Employee.class, 103);
//		Employee employee4= session2.get(Employee.class, 104);
//		Employee employee5= session2.get(Employee.class, 101);
//		Employee employee6= session2.get(Employee.class, 102);
//		Employee employee7= session2.get(Employee.class, 103);		
//		Employee employee8= session2.get(Employee.class, 104);
//		
//		session2.clear();
//		
//		System.out.println(employee);
//		System.out.println(employee2);
//		System.out.println(employee3);
//		
//		session2.close();
		
		
		// update the object in database without loading from database
		
		//Employee e = new Employee(100, "SWAPNIL", "VYAVAHARE", 35000D);
//		Employee e  = new Employee();
//		e.setEmployeeId(100);
//		e.setFirstname("swapnil");
//		e.setLastname("vyavahare");
//		e.setSalary(35000D);
//		
//		org.hibernate.Session session = GetsessionFactory.getsessionfactory().openSession();
//		Transaction tx = session.beginTransaction();
//		session.update(e);
//		tx.commit();
//		session.close();
		
		
		// update the object in database by loading from database
		
//		Employee e  = new Employee();
//		e.setEmployeeId(102);
//		e.setFirstname("SATYAVAN");
//		e.setLastname("VYAVAHARE");
//		e.setSalary(5500D);
//		
//		org.hibernate.Session session = GetsessionFactory.getsessionfactory().openSession();
//		Transaction tx = session.beginTransaction();
//		session.load(Employee.class, 102);
//		session.update(e);
//		tx.commit();
//		session.close();
		
		
		//delete object fromdatabase
		
		Employee e = new Employee();
		e.setEmployeeId(103);
		
		org.hibernate.Session session = GetsessionFactory.getsessionfactory().openSession();
		Transaction tx = session.beginTransaction();
		session.delete(e);
		tx.commit();
		session.close();
		
		
		
		
		
	}
}
