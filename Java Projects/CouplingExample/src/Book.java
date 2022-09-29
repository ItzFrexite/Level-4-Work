public class Book implements Item{

	private String title;
	private String author;
	private int numOfPages;
	
	public Book(String title, String author, int numOfPages) {
		super();
		this.title = title;
		this.author = author;
		this.numOfPages = numOfPages;
	}
	
	public String getTitle() {
		return title;
	}

	
}
