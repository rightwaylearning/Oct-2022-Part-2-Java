package crud.operations;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import create.session.factroy.GetSessionFactroy;
import employee.model.Employee;

public class DoOperation {

	public static void main(String[] args) {
		
		// read operation
		
//		SessionFactory factroy =  GetSessionFactroy.getSessionFactroty();
//		Session session =factroy.openSession();
//		
//		Employee e = session.get(Employee.class, 3);
//		System.out.println(e);
//		
//		session.close();
		
		
		//-------------------------------------------------------------------------
		// write operation// insert operation // save operation
		
		SessionFactory factroy =  GetSessionFactroy.getSessionFactroty();
		Session session =factroy.openSession();
		
		Transaction tx = session.beginTransaction();
		
		Employee e1= new Employee(12, "Krishna" ,"Manager", 270865.00);
		session.save(e1);
		tx.commit();
		
		session.close();
		
	}
}
