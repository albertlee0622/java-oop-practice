package obj.abst.basic;

public class CompleteCalculator extends Calculator{

	@Override
	public int multiply(int a, int b) {
		return a * b;
	}

	@Override
	public int divide(int a, int b) {
		return (b == 0) ? ERROR : a / b; 
	}
	
}
