package obj.student.ride;

public class Bus extends Transportation {
	public Bus(int labelNumber) {
		super(labelNumber);
		this.fare = 500;
	}
	
	@Override
	public void showInfo() {
		System.out.println(labelNumber + " bus|" + passengerCount + " passengers|" + revenue + " of revenue");
	}
	
}
