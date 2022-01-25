package obj.inherit.basic;

public class VIPCustomer extends Customer {
	private double discountRate;
	
	public VIPCustomer(String customerName) {
		super(customerName);
		this.setBonusRate(0.05);
		this.discountRate = 0.10;
		this.customerGrade = "VIP";
	}
	
//	@Override
//	public String showCustomerInfo() {
//		String newLine = System.lineSeparator();
//		StringBuilder sb = new StringBuilder();
//		sb.append("ID: " + getCustomerId());
//		sb.append(newLine);
//		sb.append("Name: " + getCustomerName());
//		sb.append(newLine);
//		sb.append("Grade: " + getCustomerGrade());
//		sb.append(newLine);
//		sb.append("Bonus points: " + getBonusPoint());
//		sb.append(newLine);
//		sb.append("Discount rates: " + String.format("%.2f%%", getDiscountRate()));
//		sb.append(newLine);
//		sb.append("*************************");	
//		return sb.toString();
//	}
	
	@Override
	public double calulateFinalprice(double price) {
		bonusPoint += price * bonusRate;
		return price * (1 - discountRate);
	}

	public double getDiscountRate() {
		return discountRate;
	}

	public void setDiscountRate(double discountRate) {
		this.discountRate = discountRate;
	}
	
}
