package hql.bulk.opt;

import javax.persistence.Entity;
import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import create.session.factroy.GetSessionFactroy;
import customer.servicescustomer.portal.models.Customer;
import customer.servicescustomer.portal.models.Employee;

public class NonSelectOperation {

	public static void main(String[] args) {
		
		
		// update
		
//		Session session = GetSessionFactroy.getSessionFactroty().openSession();
//		Query<Employee> query = session.createQuery("update Employee e set e.salary = (e.salary + e.salary/10 ) where e.salary <= 100000.00");
//		Transaction tx = session.beginTransaction();
//		int rows  =  query.executeUpdate();
//		tx.commit();
//		session.close();
// 
//		 delete
		
//		Session session = GetSessionFactroy.getSessionFactroty().openSession();
//		Query<Employee> query = session.createQuery("delete from Employee e where e.department='maths'");
//		Transaction tx = session.beginTransaction();
//		int rows  =  query.executeUpdate();
//		tx.commit();
//		session.close();


		// insert multiple objects into db using HQL query
		
		Session session = GetSessionFactroy.getSessionFactroty().openSession();
		Query<Employee> query = session.createQuery("insert into Employee(employeeId,employeeName,department,salary) select id,name,dname,salary from Test");
		Transaction tx = session.beginTransaction();
		 System.out.println(tx);
		 System.out.println();
		int rows  =  query.executeUpdate();
		tx.commit();
		session.close();
		
		
		
	}
}
