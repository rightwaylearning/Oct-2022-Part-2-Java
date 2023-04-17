package update.vs.merge;

import org.hibernate.Session;
import org.hibernate.Transaction;

import movie.model.Movie;
import utility.functionality.GetSessionFactroy;

public class Example {

	public static void main(String[] args) throws Exception{
		
		Movie duplicate = new Movie(108, "pushpa", "pushpa south india production", "Allu Arjun", "Alu Arjun,Rashmika", 1345.56, "06/06/2022");
		
		//--------------------
		Session s1= GetSessionFactroy.getSessionfactroy().openSession();
		Movie m = s1.get(Movie.class, 108);
		Transaction tx = s1.beginTransaction();
         s1.merge(duplicate);      		
		tx.commit();
		s1.close();
	}
}
