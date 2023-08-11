package one_to_many_rel;

import java.util.List;

import javax.print.Doc;

import org.hibernate.Session;
import org.hibernate.query.Query;

import utility.functionality.GetSessionFactroy;

public class N_plus_one_problem {

	public static void main(String[] args) throws Exception{
		
		
		Session session = GetSessionFactroy.getSessionfactroy().openSession();
		
		Query<Doctor> query = session.createQuery("from Doctor");
		List<Doctor> list = query.list();
		
		session.close();
		
		System.out.println(list.size());
		
		
	}
}
