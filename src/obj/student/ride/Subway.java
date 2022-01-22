package obj.student.ride;

public class Subway extends Transportation {
	public Subway(int labelNumber) {
		super(labelNumber);
		this.fare = 700;
	}
	
	@Override
	public void showInfo() {
		System.out.println(labelNumber + " subway|" + passengerCount + " passengers|" + revenue + " of revenue");
	}
}
