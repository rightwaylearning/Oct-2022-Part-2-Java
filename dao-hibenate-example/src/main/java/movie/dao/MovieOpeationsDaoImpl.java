package movie.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import movie.model.Movie;
import utility.functionality.GetSessionFactroy;

public class MovieOpeationsDaoImpl implements MovieOpeationsDao {
	
	private SessionFactory  sessionFactory = null;
	
	public MovieOpeationsDaoImpl() {
		this.sessionFactory = GetSessionFactroy.getSessionfactroy();
	}

	public Integer save(Movie movie) {
		Session session = this.sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		Integer id = (Integer) session.save(movie);
		tx.commit();
		session.close();
		return id;
	}

	public Movie read(Integer movieId) {
		Session session = this.sessionFactory.openSession();
		Movie movie = session.get(Movie.class,movieId);
		session.close();
		return movie;
	}

	public void update(Movie movie) {
		Session session = this.sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		session.update(movie);
		tx.commit();
		session.close();
	}

	public void delete(Movie movie) {
		Session session = this.sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		session.delete(movie);
		tx.commit();
		session.close();
	}

}
