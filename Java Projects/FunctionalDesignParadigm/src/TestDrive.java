
public class TestDrive {

	public static void main(String[] args) {
		
		//Testing version 1 of the game
		GamesV1 nmg = new GamesV1();
		nmg.submitGuess("crabby"); //6 letters but not valid isogram
		nmg.submitGuess("planets"); //valid isogram but too many letters
		nmg.submitGuess("cranes"); //6 letter isogram but incorrect
		nmg.submitGuess("planes"); //6 letter isogram but incorrect
		nmg.submitGuess("plates"); //6 letter isogram but incorrect
		nmg.submitGuess("planet"); //6 letter isogram but incorrect
		
		//Add code here to test your version (version 2) of the game
		
	}

}
