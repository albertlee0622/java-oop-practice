package obj.design.singleton;

public class CarFactoryTest {

	public static void main(String[] args) {
		CarFactory factory = CarFactory.getInstance();
		Car mySonata = factory.createCar();
		Car yourSonata = factory.createCar();
		char a = 'A';
		
		System.out.println(mySonata.getCarNum());     //10001
		System.out.println(yourSonata.getCarNum());   //10002
	}
}
