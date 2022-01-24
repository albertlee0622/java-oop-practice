package obj.array.basic;

public class ObjectCopyTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book library[] = new Book[5]; //assign the beginning addresses of 5 words
		Book libraryCopy[] = new Book[5]; //copy the addresses
		
		for(int i = 0; i < library.length; i++) {
			library[i] = new Book(String.valueOf(i), "Albert");
		}
		
		//shallow copy
		System.arraycopy(library, 0, libraryCopy, 0, 5);
//		libraryCopy[4].setTitle("You got this.");
		System.out.println("*********** Shallow Copy ***********");
		for(int i = 0; i < library.length; i++) {
			System.out.print(library[i] + " | ");
			library[i].showInfo();
			System.out.print(libraryCopy[i] + " | ");
			libraryCopy[i].showInfo();
		}
		
		//deep copy
		for(int i = 0; i < library.length; i++) {
			libraryCopy[i] = new Book(String.valueOf(i), "Albert");
			libraryCopy[i].setAuthor(library[i].getAuthor());
			libraryCopy[i].setTitle(library[i].getTitle());
		}
		System.out.println("*********** Deep Copy ***********");
		for(int i = 0; i < library.length; i++) {
			System.out.print(library[i] + " | ");
			library[i].showInfo();
			System.out.print(libraryCopy[i] + " | ");
			libraryCopy[i].showInfo();
		}
	}

}
