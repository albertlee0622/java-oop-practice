package obj.student.ride;

public class Student {
	String studentName;
	int money;
	
	public Student(String studentName, int money) {
		super();
		this.studentName = studentName;
		this.money = money;
	}
	
	public void takeTransportation(Transportation transport) {
		this.money -= transport.getFare();
		transport.takePassenger();
	}
	
	public void showInfo() {
		System.out.println(studentName + "|" + money + " remaining");
	}
	
}
