import java.util.HashMap;

public class GamesV1 {

	private String answer;
	private boolean gameOver;
	private int attempts = 3;
	
	public GamesV1() {
		answer = "planet";
	}
	
	public void submitGuess(String guess) {
		
		if(gameOver) {
			System.out.println("The game has ended, you cannot submit any more guesses.");
			return;
		}
		
		//Check if guess is the same length as the answer
		if(guess.length() != 6) {
			System.out.println("Your guess must be 6 letters only.");
			return;
		}
		
		//Check if the guess is a valid isogram
		char[] wordAsCharArray = guess.toCharArray(); 
		HashMap<Character, Boolean> map = new HashMap<>();	

		for(Character character : wordAsCharArray) { 
				
			if(map.containsKey(character)) {
				System.out.println("Your guess must be a valid 6 letter isogram.");
				return;
			}else {
				map.put(character, true);
			}
				
		}
		
		//Check if guess is all lowercase
		boolean isLowerCase = guess.equals(guess.toLowerCase());
		if(!isLowerCase) {
			System.out.println("Please enter your guess in all lowercase.");
			return;
		}
		
		//Check if correct
		if(guess.equals(answer)) {
			System.out.println("Correct!");
		}else {
			attempts--;
			System.out.println("Incorrect! You have " + attempts + " attempt(s) left.");
			
			if(attempts == 0) {
				System.out.println("Game Over!");
				gameOver = true;
			}
		
		}

		
	}
	
}
