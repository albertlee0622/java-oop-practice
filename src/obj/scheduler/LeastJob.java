package obj.scheduler;

public class LeastJob implements Scheduler {

	@Override
	public void getNextCall() {
		System.out.println("Distribute calls to first available operators");
	}
}
