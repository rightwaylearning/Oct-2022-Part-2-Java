package client.app;

import org.hibernate.Session;
import org.hibernate.Transaction;

import movie.model.Movie;
import utility_functionatily.GetsessionFactory;

public class Update_object_indatabase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// update object without loading from fdatabase
//		
//		Session session = GetsessionFactory.getsessionfactory().openSession();
//		
//		Movie m = new Movie();
//		m.setMovieId(1001);
//		m.setMovieName("A");
//		m.setMovieProduction("B");
//		m.setMovieDirector("C");
//		m.setMovieCasting("D");
//		
//		Transaction tx = session.beginTransaction();
//		session.update(m);
//		tx.commit();
//		session.close();
		
		
		
		
		// update object with loading from fdatabase
		
				Session session = GetsessionFactory.getsessionfactory().openSession();
				
				Movie m=session.get(Movie.class, 101);
				if (m !=null) {
					m.setMovieName("Pandu");
					Transaction tx = session.beginTransaction();
					
					session.update(m);
					tx.commit();
				}
				
				session.close();

	}

}
