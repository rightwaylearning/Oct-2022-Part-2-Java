package level1.cache;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import movie.model.Movie;
import utility.functionality.GetSessionFactroy;

public class EvictAndClearMethods {

	public static void main(String[] args) throws Exception{
		
		SessionFactory factroy = GetSessionFactroy.getSessionfactroy();
		
		Session s1= factroy.openSession();
		
		Movie m1 = s1.get(Movie.class, 108);
		Movie m2 = s1.get(Movie.class, 109);
		Movie m3 = s1.get(Movie.class, 108);
		//------
		//s1.evict(m1);
		s1.clear();
		//-----
		Movie m4 = s1.get(Movie.class, 109);
		Movie m5 = s1.get(Movie.class, 108);
		
	}
}
