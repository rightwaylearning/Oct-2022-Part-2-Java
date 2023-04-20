package client.app;

import org.hibernate.Session;
import org.hibernate.Transaction;

import movie.model.Movie;
import utility_functionatily.GetsessionFactory;

public class Remove_The_Object {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//to remove single object
		
		Session session = GetsessionFactory.getsessionfactory().openSession();
		Movie m= session.get(Movie.class, 1001);
		session.evict(m);
		
		Movie m1= session.get(Movie.class, 1001);
		Transaction tx = session.beginTransaction();
		
		//session.evict(m);
		tx.commit();
		session.close();

	}

}
