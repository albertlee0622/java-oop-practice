package obj.student.ride;

public class TakeTransTest {

	public static void main(String[] args) {
		Student studentJ = new Student("James", 5000);
		Student studentT = new Student("Tomas", 10000);
		
		Bus bus100 = new Bus(100);
		Subway subwayGreen = new Subway(2);
		
		studentJ.takeTransportation(bus100);
		studentT.takeTransportation(subwayGreen);
		
		studentJ.showInfo();
		studentT.showInfo();
		
		bus100.showInfo();
		subwayGreen.showInfo();
		
		Student edward = new Student("Edward", 20000);
		Taxi taxi40 = new Taxi(40);
		edward.takeTransportation(taxi40);
		
		edward.showInfo();
		taxi40.showInfo();
	}

}
