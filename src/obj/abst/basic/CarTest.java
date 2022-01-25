package obj.abst.basic;

public class CarTest {

	public static void main(String[] args) {
		AICar aic = new AICar();
		ManualCar mc = new ManualCar();
		
		aic.run();
		mc.run();
	}

}
