package update.object;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import movie.model.Movie;
import utility.functionality.GetSessionFactroy;

public class UpdateMethod {

	public static void main(String[] args) throws Exception {

		// first Way , create object set all values & also update value which we want to
		// update
		
		// 1] first option :-create object set all properties and also change into that object what you want

		Movie m = new Movie();
		m.setMovieId(1008);
		m.setMovieCasting("Allu-Arjun,Rashmika,");
		m.setMovieDirector("alu arjun");
		m.setMovieName("pushpa");
		m.setMovieProduction("pushpa south india production");
		m.setIncome(1345.56);
		m.setDate("06/06/2022");

		SessionFactory factroy = GetSessionFactroy.getSessionfactroy();
		Session session = factroy.openSession();

		Transaction tx = session.beginTransaction();

		session.update(m);
		// OR
		// session.update("movie.model.Movie", m);

		tx.commit();

		session.close();
		
		
		
		// 2] first load object  then check really this object is exist 

//		Session session= GetSessionFactroy.getSessionfactroy().openSession();
//		
//		Movie m = session.get(Movie.class, 108);
//		if(m != null) {
//			m.setMovieCasting("PushpaRaj");
//			Transaction tx = session.beginTransaction();
//			session.update(m);
//			tx.commit();
//		}
//		session.close();
	}
}
