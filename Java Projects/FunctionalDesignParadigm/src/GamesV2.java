import java.util.HashMap;

public class GamesV2 {
	
	private String answer;
	private boolean gameOver;
	private int attempts = 3;
	
	public GamesV2() {
		answer = "planet";
	}
	
	public void submitGuess(String guess) {
		if(gameOver) {
			System.out.println("The game has ended, you cannot submit any more guesses.");
			return;
		}
	}
	
	public void checkGuessLength(String guess) {
		if(guess.length() != 6) {
			System.out.println("Your guess must be 6 letters only.");
			return;
		}
	}
	
}
