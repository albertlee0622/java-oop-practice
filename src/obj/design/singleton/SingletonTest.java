package obj.design.singleton;

public class SingletonTest {
	
	public static void main(String[] args) {
		Company c1 = Company.getInstance();
		Company c2 = Company.getInstance();
		c1.printCeo();
		c2.printCeo();
		System.out.println(c1);
		System.out.println(c2);
	}

}
