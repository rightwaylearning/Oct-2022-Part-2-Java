package movie.dao;

import movie.model.Movie;

public interface Movie_Operationdao {
	
	public Integer save(Movie movie);
	public Movie read(Integer movieId);
	public void update(Movie movie);
	public void delete(Movie movie);
	

}
