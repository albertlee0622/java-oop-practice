package obj.inherit.basic;

public class VIPCustomer extends Customer {
	public VIPCustomer(String customerName) {
		super(customerName);
		this.discountRate = 0.10;
		this.customerGrade = "VIP";
	}
	
	@Override
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
		sb.append("Discount rates: " + String.format("%.2f%%", getDiscountRate()));
		sb.append(newLine);
		sb.append("*************************");	
		return sb.toString();
	}

	public double getDiscountRate() {
		return discountRate;
	}

	public void setDiscountRate(double discountRate) {
		this.discountRate = discountRate;
	}
	
}
