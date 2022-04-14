package creational.builder;

public class Movie {

	private String title;
	private String director;
	private String discription;

	private int score;

	private boolean isAward;

	@Override
	public String toString() {
		return "Movie [title=" + title + ", director=" + director + ", discription=" + discription + ", score=" + score
				+ ", isAward=" + isAward + "]";
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	public void setDiscription(String discription) {
		this.discription = discription;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public void setAward(boolean isAward) {
		this.isAward = isAward;
	}

}
