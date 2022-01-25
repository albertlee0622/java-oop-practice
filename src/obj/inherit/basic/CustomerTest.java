package obj.inherit.basic;

import java.util.ArrayList;

public class CustomerTest {

	public static void main(String[] args) {
		Customer customerLee = new Customer("Lee");
		customerLee.setBonusPoint(1000);
		
		Customer customerKim = new VIPCustomer("Kim");
		customerKim.setBonusPoint(1000);
		
		Customer customerKoh = new GoldCustomer("Koh");
		customerKoh.setBonusPoint(1000);
		
		ArrayList<Customer> customerList = new ArrayList<Customer>();
		customerList.add(customerLee);
		customerList.add(customerKim);
		customerList.add(customerKoh);
			
		double price = 1000d;
		for(Customer customer : customerList) {
			System.out.println(customer.calulateFinalprice(price));
			System.out.println(customer.showCustomerInfo());
		}
	}
}
