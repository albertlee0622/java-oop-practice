package obj.abst.basic;

final public class AICar extends Car {

	@Override
	public void drive() {
		System.out.println("AI system drives");
	}

	@Override
	public void stop() {
		System.out.println("AI system stops");
	}
}
