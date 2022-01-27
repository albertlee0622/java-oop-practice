package obj.abst.basic;

public class CalculatorTest {

	public static void main(String[] args) {
		Calc c = new CompleteCalculator();
		
		int a = 4, b = 2;
		
		System.out.println(c.add(a, b));
		System.out.println(c.substract(a, b));
		System.out.println(c.multiply(a, b));
		System.out.println(c.divide(a, b));
		
		c.description();
		
		int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		System.out.println(Calc.sum(numbers));
	}

}
