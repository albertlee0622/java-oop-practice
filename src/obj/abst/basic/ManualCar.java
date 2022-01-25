package obj.abst.basic;

public class ManualCar extends Car {

	@Override
	public void drive() {
		System.out.println("Human drives");
	}

	@Override
	public void stop() {
		System.out.println("Human stops a car");
	}

	@Override
	public void washCar() {
		System.out.println("Human washes a car");
	}
	
	
	
}
