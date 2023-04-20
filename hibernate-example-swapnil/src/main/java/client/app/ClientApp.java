package client.app;

import movie.dao.Movie_Operationdao;
import movie.dao.Movieoperationdaoimpl;
import movie.model.Movie;

public class ClientApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Movie_Operationdao movie_Operationdao = new Movieoperationdaoimpl();

		// save object

//		Movie m = new Movie(101, "Singham", "dharma production", "Ajay Devgan", "ajay devgan, dipika");
//		Integer id = movie_Operationdao.save(m);
//		System.out.println(id);
		
		
		//save 
		Movie m1 = new Movie(104, "pushpa", "alluarjun", "allu arjun", "allu");
		Integer id1 = movie_Operationdao.save(m1);
		System.out.println(id1);

	}

}
