package obj.inherit.basic;

public class Customer {
	private static int id = 1000;
	private int customerId;
	private String customerName;
	protected String customerGrade;
	protected int bonusPoint;
	protected double discountRate;
	
	public Customer(String customerName) {
		super();
		Customer.id++;
		this.customerId = Customer.id;
		this.customerName = customerName;
		this.customerGrade = "Silver";
		this.bonusPoint = 0;
		this.discountRate = 0.0;
	}
	
	public double calulateFinalprice(double price) {
		return price * (1 - discountRate);
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

	public int getBonusPoint() {
		return bonusPoint;
	}

	public void setBonusPoint(int bonusPoint) {
		this.bonusPoint = bonusPoint;
	}
	
}
