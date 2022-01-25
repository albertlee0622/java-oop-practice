package obj.inherit.basic;

public class Customer {
	private static int id = 1000;
	private int customerId;
	private String customerName;
	protected String customerGrade;
	protected double bonusPoint;
	protected double bonusRate;
	
	public Customer(String customerName) {
//		System.out.println("Customer(String)");
		Customer.id++;
		this.customerId = Customer.id;
		this.customerName = customerName;
		this.customerGrade = "Silver";
		this.bonusPoint = 0.0;
		this.bonusRate = 0.01;
	}
	
	public double calulateFinalprice(double price) {
		bonusPoint += price * bonusRate;
		return price;
	}
	
	public String showCustomerInfo() {
		String newLine = System.lineSeparator();
		StringBuilder sb = new StringBuilder();
		sb.append("ID: " + getCustomerId());
		sb.append(newLine);
		sb.append("Name: " + getCustomerName());
		sb.append(newLine);
		sb.append("Grade: " + getCustomerGrade());
		sb.append(newLine);
		sb.append("Bonus points: " + getBonusPoint());
		sb.append(newLine);
		sb.append("*************************");
		return sb.toString();
	}

	public int getCustomerId() {
		return customerId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomerGrade() {
		return customerGrade;
	}

	public double getBonusPoint() {
		return bonusPoint;
	}

	public void setBonusPoint(double bonusPoint) {
		this.bonusPoint = bonusPoint;
	}

	public double getBonusRate() {
		return bonusRate;
	}

	public void setBonusRate(double bonusRate) {
		this.bonusRate = bonusRate;
	}
	
	
	
}
