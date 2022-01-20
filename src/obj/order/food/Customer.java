package obj.order.food;

public class Customer {
	private String name;
	private int age;
	private double height;
	private double weight;
	private String phone;
	private String address;
	
	public Customer(String name, String phone, String address) {
		super();
		this.name = name;
		this.phone = phone;
		this.age = 0;
		this.height = 0;
		this.weight = 0.0;
		this.address = address;
	}
	
	public Customer(String name, int age, double height, double weight, String phone, String address) {
		super();
		this.name = name;
		this.age = age;
		this.height = height;
		this.weight = weight;
		this.phone = phone;
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	
}
