package obj.library;

public class BookShelfTest {

	public static void main(String[] args) {
		
		Queue bookQueue = new BookShelf();
		bookQueue.enQueue("Operating System");
		bookQueue.enQueue("Computer Architecture");
		bookQueue.enQueue("Algorithm");
		
		System.out.println(bookQueue.deQueue());
		System.out.println(bookQueue.deQueue());
		System.out.println(bookQueue.deQueue());
//		System.out.println(bookQueue.deQueue());
	}

}
