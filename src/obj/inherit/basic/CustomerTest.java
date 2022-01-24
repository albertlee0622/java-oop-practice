package obj.inherit.basic;

public class CustomerTest {

	public static void main(String[] args) {
		Customer customerLee = new Customer("Lee");
		customerLee.setBonusPoint(1000);
		System.out.println(customerLee.showCustomerInfo());
		
		VIPCustomer customerKim = new VIPCustomer("Kim");
		customerKim.setBonusPoint(2000);
		System.out.println(customerKim.showCustomerInfo());
		
		double price = 1000d;
		System.out.println(customerLee.calulateFinalprice(price));
		System.out.println(customerKim.calulateFinalprice(price));
	}
}
