package client.app;

import org.hibernate.Session;

import movie.model.Movie;
import utility_functionatily.Createsessionfactory;
import utility_functionatily.GetsessionFactory;

public class Hibernatemethods {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		Session session = GetsessionFactory.getsessionfactory().openSession();
		
		Movie m= session.get(Movie.class, 101);
		System.out.println(m);
	}

}
