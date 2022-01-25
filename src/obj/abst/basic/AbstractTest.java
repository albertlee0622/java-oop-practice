package obj.abst.basic;

public class AbstractTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Computer c = new Computer(); //abstract class
		Desktop d = new Desktop();
//		Notebook n = new Notebook(); //abstract class
		MyNotebook mn = new MyNotebook();
		
		d.turnOn();
		d.typing();
		d.display();
		d.turnOff();
		
		mn.turnOn();
		mn.typing();
		mn.display();
		mn.turnOff();
	}

}
