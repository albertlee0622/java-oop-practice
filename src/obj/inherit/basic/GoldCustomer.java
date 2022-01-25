package obj.inherit.basic;

public class GoldCustomer extends Customer {
	private double discountRate;
	
	public GoldCustomer(String customerName) {
		super(customerName);
		this.customerGrade = "Gold";
		this.bonusRate = 0.02;
		this.discountRate = 0.1;
	}

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
