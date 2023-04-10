package level1.cache;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import movie.model.Movie;
import utility.functionality.GetSessionFactroy;

public class LevelCache {

	public static void main(String[] args) throws Exception {
		
		SessionFactory factroy = GetSessionFactroy.getSessionfactroy();
		
		//-------------------------------------------------
		  Session session = factroy.openSession();
		  
		  Movie m1= session.get(Movie.class, 108);
		  System.out.println(m1.getMovieName());
		  System.out.println("---------------------");
		  Movie m2= session.get(Movie.class, 108);
		  System.out.println(m2.getMovieName());
		  System.out.println("---------------------");
		  Movie m3= session.load(Movie.class, 108);
		  System.out.println(m3.getMovieName());
		  
		  System.out.println("-----------------------------------------");
		  Session session1 = factroy.openSession();
		  
		  Movie m4= session1.get(Movie.class, 108);
		  System.out.println(m4.getMovieName());
		  
	}
}
