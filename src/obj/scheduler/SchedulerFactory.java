package obj.scheduler;

import java.io.IOException;

public class SchedulerFactory {
	public static Scheduler getInstance(char ch) throws IOException {
		
		Scheduler instance = null;
		if ( ch == 'R') {
			instance = new RoundRobin();
		}
		else if ( ch == 'L') {
			instance = new LeastJob();
		}
		else if (ch == 'P') {
			instance = new PriorityAllocation();
		}
		else {
			throw new IOException("지원되지 않는 기능입니다.");
		}
		
		return instance;
	};
}
