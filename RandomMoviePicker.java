import java.util.*;
public class RandomMoviePicker {
	//list of movies to watch
	public static String movies[] = {"Lawrence of Arabia", "12 Angry Men", "2001: A Space Oddysey", 
			"Shane", "Rashomon", "Yojimbo", "The Graduate","Sweeney Todd"};
	
	public static void main(String[] args) {		
		userInput();
		}
	//picks random number to call movie from movies array
	public static int randomNumberGenerator() {
	    Random rand = new Random();
		int randomNumber = rand.nextInt(movies.length);
		return randomNumber;
	}
	public static void fullList() {
		for(int i = 0; i < movies.length;i++) {
			System.out.println(movies[i]);
		}
	}
	public static void userInput(){
	    Scanner myObj = new Scanner(System.in);  // Create a Scanner object
	    System.out.println("What would you like to do?(Enter 'list' for full list or 'random' for a random movie)");
	    String input = myObj.nextLine();  // Read user input
		if(input.contains("random")) {
			int randomNumber = randomNumberGenerator();
			System.out.println(movies[randomNumber]);
		}
		else if (input.contains("list") ) {
			fullList();
		}else {
			System.out.println("Please enter a valid response.");
			userInput();
		}
		System.exit(0);
	}
}