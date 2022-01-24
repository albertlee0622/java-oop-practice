package obj.array.basic;

public class CharArrayTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book library[] = new Book[5];
		
		for(int i = 0; i < library.length; i++) {
			library[i] = new Book(String.valueOf(i), "Albert");
		}
		
		for(Book book : library) {
			System.out.print(book + " | ");
			book.showInfo();
		}
	}

}
