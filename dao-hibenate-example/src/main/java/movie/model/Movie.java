package movie.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "movie")
public class Movie {
	
	@Id
	@Column(name ="movie_id")
	@GeneratedValue(strategy = GenerationType.AUTO )
	private Integer movieId;
	
	@Column(name ="movie_name")
	private String movieName;
	
	@Column(name ="movie_production")
	private String movieProduction;
	
	@Column(name ="movie_director")
	private String movieDirector;
	
	@Column(name ="casting")
	private String movieCasting;
	
	@Column(name="bx_collection")
	Double income;
	
	@Column(name = "release_date")
	private String date;
	public Movie() {
	}

	public Movie(Integer movieId, String movieName, String movieProduction, String movieDirector, String movieCasting,Double income,String date) {
		super();
		this.movieId = movieId;
		this.movieName = movieName;
		this.movieProduction = movieProduction;
		this.movieDirector = movieDirector;
		this.movieCasting = movieCasting;
		this.income = income;
		this.date= date;
	}

	public Integer getMovieId() {
		return movieId;
	}

	public void setMovieId(Integer movieId) {
		this.movieId = movieId;
	}

	public String getMovieName() {
		return movieName;
	}

	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}

	public String getMovieProduction() {
		return movieProduction;
	}

	public void setMovieProduction(String movieProduction) {
		this.movieProduction = movieProduction;
	}

	public String getMovieDirector() {
		return movieDirector;
	}

	public void setMovieDirector(String movieDirector) {
		this.movieDirector = movieDirector;
	}

	public String getMovieCasting() {
		return movieCasting;
	}

	public void setMovieCasting(String movieCasting) {
		this.movieCasting = movieCasting;
	}

	public Double getIncome() {
		return income;
	}

	public void setIncome(Double income) {
		this.income = income;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	@Override
	public String toString() {
		return "Movie [movieId=" + movieId + ", movieName=" + movieName + ", movieProduction=" + movieProduction
				+ ", movieDirector=" + movieDirector + ", movieCasting=" + movieCasting + ", income=" + income
				+ ", date=" + date + "]";
	}

}
