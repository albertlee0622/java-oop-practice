package obj.design.singleton;

public class Company {
	private static Company instance = new Company();
	private String ceo;
	
	public static Company getInstance() {
		if (instance == null) {
			instance = new Company();
		}
		return Company.instance;
	}
	
	private Company() {
		this.ceo = "Elon";
	}
	
	public void printCeo() {
		System.out.println(this.ceo);
	}
}
