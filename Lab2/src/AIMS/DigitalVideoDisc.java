package AIMS;

public class DigitalVideoDisc {
    private String title;
	private String category;
	private String director;
	private int length;
	private float cost;

	// Constructor by title
	public DigitalVideoDisc(String title) {
		this.title = title;
	}

	// Constructor by title, category and cost 
	public DigitalVideoDisc(String title, String category, float cost) {
		this.title = title;
		this.category = category;
		this.cost = cost;
	}

	// Constructor by title, category, director and cost 
	public DigitalVideoDisc(String title, String category, String director, float cost) {
		this.title = title;
		this.category = category;
		this.director = director;
		this.cost = cost;
	}

	// Constructor by by all attributes: title, category, director, length and cost
	public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
		this.title = title;
		this.category = category;
		this.director = director;
		this.length = length;
		this.cost = cost;
	}

	public String getTitle() {
		return title;
	}
	
	public String getCategory() {
		return category;
	}
	public String getDirector() {
		return director;
	}
	public int getLength() {
		return length;
	}
	public float getCost() {
		return cost;
	}
	
	
}