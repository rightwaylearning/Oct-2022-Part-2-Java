package movie.dao;

import movie.model.Movie;

public interface MovieOpeationsDao {

	public Integer save(Movie movie);
	public Movie read(Integer movieId);
	public void update(Movie movie);
	public void delete(Movie movie);
}
