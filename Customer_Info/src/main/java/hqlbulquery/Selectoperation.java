package hqlbulquery;


import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import create.session.factory.GetSession_Factory;
import customer_info_modelclass.Employee;

public class Selectoperation {
	
	public static void main(String[] args) {
		
		// example 1 here we read all object from table with all property
		
//		Session session = GetSession_Factory.getsessionfactory().openSession();
//		Query<Employee> query = session.createQuery("from Employee");
//		List<Employee> list = query.list();
//		session.close();
//		list.stream().forEach(System.out::println);
		
		//example 2 add filter using where clause
		
//		Session session = GetSession_Factory.getsessionfactory().openSession();
//		Query<Employee> query = session.createQuery("from Employee e where e.salary like '35%'");
//		List<Employee> list = query.list();
//		session.close();
//		list.stream().forEach(System.out::println);
		
		
		
		// selection of partial object
		
//		Session session = GetSession_Factory.getsessionfactory().openSession();
//		Query<Object[]> query = session.createQuery("select employeeId, employeeName from Employee");
//		List<Object[]> list = query.list();
//		session.close();
//		for(Object[]arr:list) {
//			System.out.println(arr[0] +" "+ arr[1]);
//		}
		
		
		
		// select single object from object
		
		Session session = GetSession_Factory.getsessionfactory().openSession();
		Query<String> query = session.createQuery("select employeeName from Employee");
		List<String> list = query.list();
		session.close();
		System.out.println(list);
		
	}

}
