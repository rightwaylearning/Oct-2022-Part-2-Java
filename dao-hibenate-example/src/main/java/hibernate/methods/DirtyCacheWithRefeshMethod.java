package hibernate.methods;

import org.hibernate.Session;

import movie.model.Movie;
import utility.functionality.GetSessionFactroy;

public class DirtyCacheWithRefeshMethod {

	public static void main(String[] args) throws Exception{
		
		Session session= GetSessionFactroy.getSessionfactroy().openSession();
		
		Movie m1 = session.get(Movie.class, 188);
		System.out.println("get return  " + m1.getMovieCasting());
		
		System.out.println("I am going to sleep");
		Thread.sleep(20000);
		System.out.println("I am going to weakup");
		session.refresh(m1);
		
		Movie m2 = session.get(Movie.class, 188);
		System.out.println(m2.getMovieCasting());
		
		Movie m3 = session.get(Movie.class, 188);
		System.out.println(m3.getMovieCasting());
		
		session.close();
	}
}
