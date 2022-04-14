package creational.builder;

public class Main {

	public static void main(String args[]) {
		
		Movie movie1=MovieBuilder.startBuilder("The Movie 1", "Jane Doe").build();
		Movie movie2=MovieBuilder.startBuilder("the Movie 2", "john Doe").setAward(true).setScore(98).build();
		
		System.out.println("Movie 1 : "+movie1);
		System.out.println("Movie 2 : "+movie2);
		
	}

}
