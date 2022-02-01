package chapter4.ch1;

public class Book {
	
	private String title;
	private String author;
	public Book(String title, String author) {
		super();
		this.title = title;
		this.author = author;
	}
	
	
	
	@Override
	public String toString() {
		return title + " by " + author;
	}



	public static void main(String[] args) {
		
		Book book = new Book("Albert's day", "Albert");
		System.out.println(book);
	}
}
