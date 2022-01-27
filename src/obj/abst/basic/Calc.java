package obj.abst.basic;

public interface Calc {
	int ERROR = Integer.MAX_VALUE;
	
	int add(int a, int b);
	int substract(int a, int b);
	int multiply(int a, int b);
	int divide(int a, int b);
	
	default void description() {
		System.out.println("arithmetic operations are performed.");
	}
	
	static int sum(int[] arr) {
		int total = 0;
		for(int num : arr) {
			total += num;
		}
		return total;
	}
}
