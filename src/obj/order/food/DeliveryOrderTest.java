package obj.order.food;

public class DeliveryOrderTest {

	public static void main(String[] args) {
		Customer thomas = new Customer("Thomas", 37, 180, 78, "01023450001", "Gangnam Gu, Seoul"); 
		DeliveryOrder order = new DeliveryOrder(thomas, "130258", "20201102", "202011020003");
		order.addMenu("0003", 35000);
		order.printReceipt();
	}

}
