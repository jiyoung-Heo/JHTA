package day16.thread;

import java.util.Calendar;
import java.util.Random;

/*
 * 1�ʿ� �ѹ��� ����ð��� ����ϴ� ������
 * 1�ʿ� �ѹ��� ������ ����ϴ� ������
 * -> ���� �� �����带 ����� �����غ�����
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
			String d = cl.get(Calendar.YEAR) + "��" + cl.get((Calendar.MONTH) + 1) + "��" + cl.get(Calendar.DAY_OF_MONTH)
					+ "��";
			int time = cl.get(Calendar.HOUR);
			int min = cl.get(Calendar.MINUTE);
			int sec = cl.get(Calendar.SECOND);
			System.out.println(d + time + "��" + min + "��" + sec + "��");
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