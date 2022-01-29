package obj.scheduler;

public class PriorityAllocation implements Scheduler {

	@Override
	public void getNextCall() {
		System.out.println("Distribute important calls to experienced operators");	
	}
		
}
