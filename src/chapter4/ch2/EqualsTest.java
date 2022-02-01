package chapter4.ch2;

public class EqualsTest {
	
	public static void main(String[] args) {
		
		Student a = new Student(1, "albert");
		
		try {
			Object b = a.clone();
			a.setStudentName("jessie");
//			System.out.println(a);
//			System.out.println(b);
//			
//			System.out.println(a == b);
//			System.out.println(a.equals(b));
//			
//			System.out.println(System.identityHashCode(a));
//			System.out.println(System.identityHashCode(b));
			
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		
		String aStr = "a";
		String bStr = "a";
		
		System.out.println(System.identityHashCode(aStr));
		System.out.println(System.identityHashCode(bStr));
		
//		System.out.println(a.getClass() == b.getClass());
		

	}
}
