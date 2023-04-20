package client.app;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import movie.model.Movie;
import utility_functionatily.GetsessionFactory;

public class InsertObject {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		
		// this code represent how to insert object into database
//		Movie m = new Movie(1001, "suryavansham", "bacchan family", "abhishek", "karan johar");
//		
//		Movie m1 = new Movie(1002, "sairat", "nagraj family", "parsha", "archi-parsha");
//
//		Movie m2 = new Movie(1003, "welcome", "dharma", "akshaykumar", "akshay-katrina");
//		
//		Session session = GetsessionFactory.getsessionfactory().openSession();
//		Transaction tx = session.beginTransaction();
//		session.save(m);
//		session.save(m1);
//		session.save(m2);
//		tx.commit();
//		session.close();
		
		
		
		//how to read object from database by get method & load method
		
//		Session session2= GetsessionFactory.getsessionfactory().openSession();
//		Movie r = session2.get(Movie.class, 1001);
//		//Movie r1 = (Movie) session2.get("movie.model.Movie", 1001);
//		System.out.println(r.toString());
//		
//		session2.close();
		
		
		//read by using load method
		Session session3= GetsessionFactory.getsessionfactory().openSession();
		//Movie r2 = session3.load(Movie.class, 11001);
		Movie r1 = (Movie) session3.load("movie.model.Movie", 01);
		System.out.println(r1.toString());
		
		session3.close();
	}

}
