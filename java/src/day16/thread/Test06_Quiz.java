package day16.thread;

import java.util.Calendar;
import java.util.Random;

/*
 * 1초에 한번씩 현재시간을 출력하는 스레드
 * 1초에 한번씩 난수를 출력하는 스레드
 * -> 위의 두 스레드를 만들고 실행해보세요
 */
public class Test06_Quiz {
	public static void main(String[] args) {
//		Day d = new Day();
		new Day().start();
		new RandomTest().start();
	}
}

class Day extends Thread {
	@Override
	public void run() {
		for (;;) {
			Calendar cl = Calendar.getInstance();
			String d = cl.get(Calendar.YEAR) + "년" + cl.get((Calendar.MONTH) + 1) + "월" + cl.get(Calendar.DAY_OF_MONTH)
					+ "일";
			int time = cl.get(Calendar.HOUR);
			int min = cl.get(Calendar.MINUTE);
			int sec = cl.get(Calendar.SECOND);
			System.out.println(d + time + "시" + min + "분" + sec + "초");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

class RandomTest extends Thread {
	@Override
	public void run() {
		Random ran = new Random();
		for (;;) {
			int result = ran.nextInt(100) + 1;
			System.out.println(result);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}