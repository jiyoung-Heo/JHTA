package day16.homework;
/*
 * ���� ��� ���α׷� �����
 * 
 * ������ ������ �ΰ� ���ؼ� ���ߴ� ���α׷�. ���߸� ������ 10�� �����Ѵ�.
 * �ð��� 60�ʰ� �־�����.(������� �ð� üũ�ϱ�)
 * ��)
 * 3+2=5
 * ����
 * 9+3=1
 * ����
 */

import java.util.Random;
import java.util.Scanner;

class Mul extends Thread {
	boolean flag = false;
	int count = 0;
	int cnt = 0;

	public int getCnt() {
		return cnt;
	}

	@Override
	public void run() {

		while (!flag) {
			if (flag)
				break;
			if (count == 10)
				break;
			Random ran = new Random();
			int rn1 = ran.nextInt(9) + 1;
			int rn2 = ran.nextInt(9) + 1;
			Scanner sc = new Scanner(System.in);
			int rn3 = rn1 + rn2;
			System.out.print(rn1 + " + " + rn2 + " = ");
			int ans = sc.nextInt();
			if (rn3 == ans) {
				System.out.println("����!");
				cnt += 10;
				System.out.println("���� ���� :" + cnt + "��!");
				;
			} else {
				System.out.println("����");
				System.out.println("���� ���� :" + cnt + "��!");
				;
			}
			count++;
		}
		System.out.println("���� ����");
		System.out.println("���� ���� :" + cnt + "��!");
		System.exit(0);
	}
}

class Time extends Thread {
	boolean flag = false;
	int i = 60;

	public void run() {
		for (;;) {
			try {
				Thread.sleep(1000);
				i--;
				if (i == 1) {
					flag = true;
					System.out.println("�ð� ����");
					break;
				}
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

public class dd {
	public static void main(String[] args) {

		Mul m = new Mul();
		Time t = new Time();

		m.start();
		t.start();

		try {
			t.join();// t�����尡 ����ɶ����� ��ٸ�(join)
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("����Ǿ����ϴ�.");
		System.out.println("���� ���� : " + m.getCnt());
		System.exit(0);
	}
}
