package criteria.api.example;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Projection;
import org.hibernate.criterion.ProjectionList;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;

import create.session.factroy.GetSessionFactroy;
import customer.servicescustomer.portal.models.Customer;
import customer.servicescustomer.portal.models.Employee;

public class SelectQueries {

	public static void main(String[] args) {

		// case1 ] select whole object (full row)

//	  Session session= GetSessionFactroy.getSessionFactroty().openSession();
//	  Criteria ctr = session.createCriteria(Customer.class);
//	  List<Customer> list = ctr.list() ;
//	  session.close();
//	  list.stream().forEach(System.out::println);

		// case 2] select partials properties /columns

//		  Session session= GetSessionFactroy.getSessionFactroty().openSession();
//		  Criteria ctr = session.createCriteria(Customer.class);
//		  
//		  Projection p1= Projections.property("customerFirstName");
//		  Projection p2= Projections.property("customerLastName");
//		  ProjectionList plist = Projections.projectionList();
//		  plist.add(p1);
//		  plist.add(p2);
//		  ctr.setProjection(plist);
//		  
//		  List<Object[]> list = ctr.list() ;
//		  session.close();
//		  list.stream().forEach(x->{
//			  System.out.println(x[0]+"  "+x[1]);
//		  });

		// case 3] read only single property

//		  Session session= GetSessionFactroy.getSessionFactroty().openSession();
//		  Criteria ctr = session.createCriteria(Customer.class);
//		  
//		  Projection p1= Projections.property("customerFirstName");
//		  ctr.setProjection(p1);
//		  
//		  List<String> list = ctr.list() ;
//		  session.close();
//		  list.stream().forEach(System.out::println);

		// now lets add filter (where condition)
//		  Session session= GetSessionFactroy.getSessionFactroty().openSession();
//		  Criteria ctr = session.createCriteria(Customer.class);
//		  // projection (mean's add column names)
//		  Projection p1= Projections.property("customerFirstName");
//		  Projection p2= Projections.property("customerLastName");
//		  ProjectionList plist = Projections.projectionList();
//		  plist.add(p1);
//		  plist.add(p2);
//		  ctr.setProjection(plist);
//		  
//		  Criterion c1 = Restrictions.eq("customerLastName", "dhoni");
//		  Criterion c2 = Restrictions.eq("customerLastName", "dhoni");
//		  Criterion c3 = Restrictions.or(c1,c2);
//		  ctr.add(c3);
//		  
//		  List<Object[]> list = ctr.list() ;
//		  session.close();
//		  list.stream().forEach(x->{
//			  System.out.println(x[0]+"  "+x[1]);
//		  });

		// aggregate function min, max, avg, sum , count

//		Session session = GetSessionFactroy.getSessionFactroty().openSession();
//		Criteria ctr = session.createCriteria(Employee.class);
//
//		Projection p1 = Projections.sum("salary");
//		Projection p2 = Projections.max("salary");
//		Projection p3 = Projections.min("salary");
//		ProjectionList plist = Projections.projectionList();
//		plist.add(p1);
//		plist.add(p2);
//		plist.add(p3);
//		ctr.setProjection(plist);
//
//		List<Object[]> list = ctr.list();
//		list.stream().forEach(x -> {
//			System.out.println( "sum  = "+x[0] + "  max salary" + x[1] +" min salary"+x[2]);
//		});
//		session.close();
		
		// group by 
		
      
//		Session session = GetSessionFactroy.getSessionFactroty().openSession();
//		Criteria ctr = session.createCriteria(Employee.class);
//
//		Projection p1 = Projections.groupProperty("department");
//		Projection p2 = Projections.sum("salary");
//		
//		ProjectionList plist = Projections.projectionList();
//		plist.add(p1); plist.add(p2);
//		ctr.setProjection(plist);
//		
//		List<Object[]> list = ctr.list();
//		 list.stream().forEach(x->{
//		  System.out.println(x[0]+"  "+x[1]);
//	  });
		
		
		  Session session= GetSessionFactroy.getSessionFactroty().openSession();
		  Criteria ctr = session.createCriteria(Employee.class);
		  int page = 1; // 0 mean's first page >> from record 1
		  ctr.setFirstResult(page*10);
		  ctr.setMaxResults(10);
		  List<Employee> list = ctr.list() ;
		  session.close();
		  list.stream().forEach(System.out::println);
		
	}
}
