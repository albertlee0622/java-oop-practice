package obj.student.ride;

public class Taxi extends Transportation {
	public Taxi(int labelNumber) {
		super(labelNumber);
		this.fare = 10000;
	}
	
	@Override
	public void showInfo() {
		System.out.println(labelNumber + " taxi|" + passengerCount + " passengers|" + revenue + " of revenue");
	}
}
