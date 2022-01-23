package obj.design.singleton;

public class CarFactory {
	private static CarFactory instance = null;
	public static CarFactory getInstance() {
		if (instance == null) {
			CarFactory.instance = new CarFactory();
		}
		return CarFactory.instance;
	}
	
	private int carNum;
	private CarFactory() { this.carNum = 10000; }
	
	public Car createCar() {
		return new Car(++carNum);
	}
}
