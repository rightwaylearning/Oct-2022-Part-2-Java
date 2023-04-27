package hql.bulk.opt;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.query.Query;

import create.session.factroy.GetSessionFactroy;
import customer.servicescustomer.portal.models.Customer;

public class SelectQueries {

	public static void main(String[] args) {
//		// example 1
//		Session session = GetSessionFactroy.getSessionFactroty().openSession();
//		Query<Customer> query = session.createQuery("from Customer");
//		List<Customer> list = query.list();
//		session.close();
//		list.stream().forEach(System.out::println);
		
		// example 2 add filter using where clause
		
		
//		Session session = GetSessionFactroy.getSessionFactroty().openSession();
//		Query<Customer> query = session.createQuery("from Customer c where c.cellNumber like '89%'");
//		List<Customer> list = query.list();
//		session.close();
//		list.stream().forEach(System.out::println);
		
		
//		Session session = GetSessionFactroy.getSessionFactroty().openSession();
//		Query<Customer> query = session.createQuery("from Customer c where c.customerFirstName =:n");
//		query.setParameter("n", "Rohit");
//		List<Customer> list = query.list();
//		session.close();
//		list.stream().forEach(System.out::println);
		
		// ------------------  select with full object
		
//		
//		Session session = GetSessionFactroy.getSessionFactroty().openSession();
//		Query<Customer> query = session.createQuery("from Customer");
//		List<Customer> list = query.list();
//		session.close();
		
		//print
		// 1] print list >> iterator
		// 2] for each
		// 3] for loop
		// 4] stream api
		
	//	list.stream().forEach(System.out::println);
		
		//----------------------------- select partial object 
		
//		
//		Session session = GetSessionFactroy.getSessionFactroty().openSession();
//		Query<Object[]> query = session.createQuery("select customerFirstName,mailId  from Customer");
//		List<Object[]> list= query.list();
//		session.close();
//		for(Object[] arr:list) {
//			System.out.println(arr[0] +"  "+arr[1]);
//		}
//		
		
//		Session session = GetSessionFactroy.getSessionFactroty().openSession();
//		Query<String> query = session.createQuery("select customerFirstName  from Customer");
//		List<String> list= query.list();
//		session.close();
//		
//		System.out.println(list);
		
		
		// select e.e_dept, sum(e.salary), count(*) from employee e group by e.e_dept;
		
		
		
		
		Session session = GetSessionFactroy.getSessionFactroty().openSession();
		Query<Object[]> query = session.createQuery("select e.department, sum(e.salary), count(e.employeeId) from Employee e group by e.department");
        List<Object[]> arr = query.list();
		session.close();
		
		arr.stream().forEach(obj->{
			System.out.println(obj[0] +"   "+obj[1]+"   "+obj[2]);
		});
		
	}
}
