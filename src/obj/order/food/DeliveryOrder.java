package obj.order.food;

import java.util.ArrayList;

public class DeliveryOrder {
	static String newLine = System.lineSeparator();
	private String orderTime;
	private String orderDate;
	private String orderNumber;
	private double totalPrice;
	private ArrayList<String> menuNumbers;
	private Customer customer;
	
	public DeliveryOrder(Customer customer, String orderTime, String orderDate, String orderNumber) {
		super();
		this.orderNumber = orderNumber;
		this.totalPrice = 0.0;
		this.menuNumbers = new ArrayList<String>();
		this.customer = customer;
		this.orderTime = orderTime;
		this.orderDate = orderDate;
	}
	
	public void addMenu(String menuNumber, double price) {
		menuNumbers.add(menuNumber);
		this.totalPrice += price;
	}
	
	public void printReceipt() {
		StringBuilder sb = new StringBuilder();
		sb.append(orderNumber);
		sb.append(newLine);
		sb.append(customer.getPhone());
		sb.append(newLine);
		sb.append(customer.getAddress());
		sb.append(newLine);
		sb.append(orderDate);
		sb.append(newLine);
		sb.append(orderTime);
		sb.append(newLine);
		sb.append(totalPrice);
		for(String menuNumber : menuNumbers) {
			sb.append(newLine);
			sb.append(menuNumber);
		}
		System.out.println(sb.toString());
	}

}
