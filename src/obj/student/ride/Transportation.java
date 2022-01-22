package obj.student.ride;

public abstract class Transportation {
	int labelNumber;
	int fare;
	int passengerCount;
	int revenue;
	
	public Transportation(int labelNumber) {
		super();
		this.labelNumber = labelNumber;
	}
	
	public void takePassenger() {
		revenue += fare;
		passengerCount += 1;
	}
	
	abstract void showInfo();

	public int getFare() {
		return fare;
	}

	public void setFare(int fare) {
		this.fare = fare;
	}
	
	

}
