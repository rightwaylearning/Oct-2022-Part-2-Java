package delete.object;

import org.hibernate.Session;
import org.hibernate.Transaction;

import movie.model.Movie;
import utility.functionality.GetSessionFactroy;

public class DeleteObjectFromDB {

	public static void main(String[] args) throws Exception {

		// 1st way

//		Movie m = new Movie();
//		m.setMovieId(1008);
//		Session session= GetSessionFactroy.getSessionfactroy().openSession();
//		Transaction tx = session.beginTransaction();
//		session.delete(m);
//		// OR  session.delete("movie.model.Movie",m)
//		tx.commit();
//		session.close();

		// ------------------------------------
		// 2nd way

//		Session session = GetSessionFactroy.getSessionfactroy().openSession();
//		Movie m = session.get(Movie.class, 109);
//		if (m != null) {
//			Transaction tx = session.beginTransaction();
//			session.delete(m);
//			// OR session.delete("movie.model.Movie",m)
//			tx.commit();
//		}
//		session.close();

		// save object methods

//		Movie m = new Movie(111, "MI", "abc", "lmn", "abc", 1234.56, "12/12/2012");
//
//		Session session = GetSessionFactroy.getSessionfactroy().openSession();
//		Transaction tx = session.beginTransaction();
//		Integer id = (Integer)session.save(m);
//		System.out.println(id);
//		tx.commit();
//		session.close();
		
		// persist
		Movie m = new Movie(112, "MI", "abc", "lmn", "abc", 1234.56, "12/12/2012");

		Session session = GetSessionFactroy.getSessionfactroy().openSession();
		Transaction tx = session.beginTransaction();
		session.persist(m);
		tx.commit();
		session.close();

	}

}
