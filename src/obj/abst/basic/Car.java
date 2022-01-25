package obj.abst.basic;

public abstract class Car {
	
	public abstract void drive();
	public abstract void stop();
	
	public void startCar() {
		System.out.println("Engine is on");
	}
	
	public void turnOff() {
		System.out.println("Engine is off");
	}
	
	public void washCar() {};
	
	final public void run() {
		startCar();
		drive();
		stop();
		turnOff();
		washCar();
	}
}
