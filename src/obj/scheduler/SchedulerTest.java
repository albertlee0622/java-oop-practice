package obj.scheduler;

import java.io.IOException;
import java.util.Scanner;

public class SchedulerTest {

	public static void main(String[] args) throws IOException {

		System.out.println("전화 상담원 할당 방식을 선택하세요");
		System.out.println("R : 한명씩 차례대로");
		System.out.println("L : 대기가 적은 상담원 우선");
		System.out.println("P : 우선순위가 높은 고객우선 숙련도 높은 상담원");
		
		Scanner sc = new Scanner(System.in);
		char ch = sc.next().charAt(0);
		ch = Character.toUpperCase(ch);
		
		Scheduler scheduler = null;
		try {
			scheduler = SchedulerFactory.getInstance(ch);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		scheduler.getNextCall();
		scheduler.sendCallToAgent();
	}

}
