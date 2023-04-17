package hibernate.object.states;

import org.hibernate.Session;
import org.hibernate.Transaction;

import movie.model.Movie;
import utility.functionality.GetSessionFactroy;

public class Test {

	public static void main(String[] args) throws Exception {
		
		// Q 1] when we run this code then in database movie name is changed from Lawarish to bagban ??
		
		Movie m= new Movie();
		m.setMovieId(1100);
		m.setMovieName("Lawarish"); 
		m.setDate("12/12/1990");
		m.setMovieCasting("Big B");
		m.setIncome(345.67);
		m.setMovieDirector("big B");
		m.setMovieProduction("KBC");
		
		Session session = GetSessionFactroy.getSessionfactroy().openSession();
		Session session1 = GetSessionFactroy.getSessionfactroy().openSession();
		Transaction tx = session.beginTransaction();
		session.save(m);
		tx.commit();
		Movie m1 = session1.get(Movie.class, 1100);
		System.out.println(m1);
		session.close();
		session1.close();
		
		// NO ,
		
	}
}
