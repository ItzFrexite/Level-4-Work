public class VideoGames implements Item{

	private String title;
	private String publisher;
	private int agerating;
	
	public VideoGames(String title, String publisher, int agerating) {
		super();
		this.title = title;
		this.publisher = publisher;
		this.agerating = agerating;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public int getAgerating() {
		return agerating;
	}

	public void setAgerating(int agerating) {
		this.agerating = agerating;
	}


	
	
	
}
