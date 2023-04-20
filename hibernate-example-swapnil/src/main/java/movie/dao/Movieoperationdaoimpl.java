package movie.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import movie.model.Movie;
import utility_functionatily.GetsessionFactory;

public class Movieoperationdaoimpl implements Movie_Operationdao {

	private SessionFactory sessionFactory = null;

	public Movieoperationdaoimpl() {
		this.sessionFactory = GetsessionFactory.getsessionfactory();
	}

	@Override
	public Integer save(Movie movie) {
		// TODO Auto-generated method stub

		Session session = this.sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		Integer id = (Integer) session.save(movie);
		tx.commit();
		session.close();
		return id;
	}

	@Override
	public Movie read(Integer movieId) {
		// TODO Auto-generated method stub

		Session session = this.sessionFactory.openSession();
		Movie movie = session.get(Movie.class, movieId);
		session.close();
		return movie;
	}

	@Override
	public void update(Movie movie) {
		// TODO Auto-generated method stub
		Session session = this.sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		session.update(movie);
		tx.commit();
		session.close();

	}

	@Override
	public void delete(Movie movie) {
		// TODO Auto-generated method stub
		Session session = this.sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		session.delete(movie);
		tx.commit();
		session.close();

	}

}
