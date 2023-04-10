package hibernate.methods;

import org.hibernate.Session;

import movie.model.Movie;
import utility.functionality.GetSessionFactroy;

public class GetAndLoad {

	public static void main(String[] args) throws Exception{
		
		Session session = GetSessionFactroy.getSessionfactroy().openSession();
		
		// if there is get/read/select operation not required transection  manegment
		
		// 1] 
		
//		 Movie m1 = session.get(Movie.class, 108);
//		 System.out.println(m1);
		
		
		// 2]
		
//		   Movie m2 = (Movie) session.get("movie.model.Movie", 108);
//		   
//		   System.out.println(m2);
		
		// 3] here we are passing id which is not in DB
		
//		 Movie m1 = session.get(Movie.class, 18);
//		 System.out.println(m1);
		 
		 // out put is here null
		//--------------------------------------------------------
		
//		 Movie m = session.load(Movie.class, 108);
//		 System.out.println(m);
//		 
//		 Movie m1 =(Movie) session.load("movie.model.Movie", 109);
//		 System.out.println(m1);
		
		
		
		// early loading
		
//
//	   Movie m1 = session.get(Movie.class, 108);
//	  
//	   
//	   System.out.println("-------------------------");
//	   
//	   // lazy loading
//	   
//	   Movie m2 = session.load(Movie.class, 109);
//	   System.out.println(m2.getMovieId());	
//	   System.out.println(">>>>>>>>>>>>>>");
//	   System.out.println(m2.getMovieName());
		
		// get return null & load return Exception if object is not in DB
		
		
		Movie m1 = session.get(Movie.class, 188);
		System.out.println("get return  " + m1);
		
		Movie m2 = session.load(Movie.class, 1898);
		//System.out.println("load return  " + m2);
		System.out.println(m2.getMovieId());
		
		
		
	}
	
}
