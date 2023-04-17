package hibernate.object.states;

import org.hibernate.Session;
import org.hibernate.Transaction;

import movie.model.Movie;
import utility.functionality.GetSessionFactroy;

public class Example {

	public static void main(String[] args) throws Exception{
		
		 Session session = GetSessionFactroy.getSessionfactroy().openSession();
		 Transaction tx = session.beginTransaction();
		 
		 Movie m = session.get(Movie.class, 111);
		 m.setMovieName("DDLJ");
		 
		 tx.commit();
		 session.close();
		 
	}
}
