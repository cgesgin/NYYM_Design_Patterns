package creational.builder;

public class MovieBuilder {

	private String title;
	private String director;
	private String discription;

	private int score;

	private boolean isAward;
	
	public static MovieBuilder startBuilder(String title,String director) {
		
		MovieBuilder builder=new MovieBuilder();
		
		builder.title=title;
		builder.director=director;
		
		return builder;
		
	}
	
	public Movie build() {
		
		Movie movie =new Movie();
		
		movie.setTitle(title);
		movie.setDirector(director);
		movie.setDiscription(discription);
		movie.setScore(score);
		movie.setAward(isAward);
		
		return movie;
	}

	public MovieBuilder setDiscription(String discription) {
		this.discription = discription;
		return this;
	}

	public MovieBuilder setScore(int score) {
		this.score = score;
		return this;
	}

	public MovieBuilder setAward(boolean isAward) {
		this.isAward = isAward;
		return this;
	}
}
