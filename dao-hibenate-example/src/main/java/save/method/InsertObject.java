package save.method;

import org.hibernate.Session;
import org.hibernate.Transaction;

import movie.model.Movie;
import utility.functionality.GetSessionFactroy;

public class InsertObject {

	public static void main(String[] args)  throws Exception{
		
		Movie m = new Movie();
		m.setMovieName("RRRRRRR");
		m.setMovieCasting("Ramcharan, Ramarao, Rajmolu");
		m.setMovieProduction("Raja moli");
		m.setMovieDirector("raja moli");
		
		Session session = GetSessionFactroy.getSessionfactroy().openSession();
		Transaction tx = session.beginTransaction();
		session.save(m);
		tx.commit();
		session.close();
		
	}
}
