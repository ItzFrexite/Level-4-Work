import java.util.ArrayList;

public class Library {

	private ArrayList<Item> items;
	
	public Library() {
		this.items = new ArrayList();
	}
	
	public void addItem(Item item) {
		items.add(item);
	}
	
	public void removeItem(Item item) {
		this.items.remove(item);
	}
	
	public void removeItem(int index) {
		this.items.remove(index);
	}

	public Item getItem(int index) {
		return items.get(index);
	}
	
	public void printAllTitles()
	{
		for(Item item : items) {
			System.out.println(item.getTitle());
		}
		
	}

}
