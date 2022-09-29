
public class testDrive {

	public static void main(String[] args) {


		Book book1 = new Book("Book 1", "hjhkjh", 290);
		Book matilda = new Book("Matilda", "hjhkjh", 300);
		Book bfg = new Book("BFG", "hjhkjh", 280);
		
		VideoGames game1 = new VideoGames("game1", "publisher1", 12);
		VideoGames game2 = new VideoGames("game2", "publisher2", 15);
		VideoGames game3 = new VideoGames("game3", "publisher3", 18);
		
		Library lib = new Library();
		lib.addItem(game1);
		lib.addItem(book1);
		lib.addItem(matilda);
		
		lib.printAllTitles();

	}

}
