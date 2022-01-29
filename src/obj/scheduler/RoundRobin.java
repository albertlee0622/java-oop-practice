package obj.scheduler;

public class RoundRobin implements Scheduler {

	@Override
	public void getNextCall() {
		System.out.println("Distribute calls equally");
	}
}
