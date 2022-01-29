package obj.scheduler;

public interface Scheduler {
	void getNextCall();
	default void sendCallToAgent() {
		System.out.println("Assigning a call to the next operator...");
	};
}
