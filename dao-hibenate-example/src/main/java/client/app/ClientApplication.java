package client.app;

import movie.dao.MovieOpeationsDao;
import movie.dao.MovieOpeationsDaoImpl;
import movie.model.Movie;

public class ClientApplication {

	public static void main(String[] args) {

		MovieOpeationsDao movieOpeationsDao = new MovieOpeationsDaoImpl();

		// save object
		// Movie m= new Movie(101, "two state", "Dharma production", "karan Johar",
		// "Arjun kapur,aliya bhatt");
		// Integer id = movieOpeationsDao.save(m);
		// System.out.println(id);

//		Movie m = new Movie(102, "Pathan", "red chilli production", "srk", "srk, dipika");
//		Integer id = movieOpeationsDao.save(m);
//		System.out.println(id);
		
		
		// read
		
//		Movie m =  movieOpeationsDao.read(101);
//		System.out.println(m);

		
		// update >> best way first read that object from DB then update property then call update method
		
//		Movie m =  movieOpeationsDao.read(101);
//		if(m != null) {
//		 String casting = 	m.getMovieCasting();
//		 casting = casting +","+"Ronit roy,amruta singh";
//		 m.setMovieCasting(casting);
//		 movieOpeationsDao.update(m);
//		}
		
		// delete :- first check that object is exit in db if yes then delete it
		Movie m =  movieOpeationsDao.read(102);
		if(m!=null) {
			movieOpeationsDao.delete(m);
		}
		
		
	}
}
