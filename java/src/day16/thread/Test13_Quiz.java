package day16.thread;

/*
 * << ������� ���α׷� >>
 * ������ ������ �ΰ� ���ϴ� ���α׷�. ������ ������ 10�� �����Ѵ�.
 * �ð��� 60�ʰ� �־�����.(������� �ð�üũ�ϱ�)
 * 
 * 3+2=
 * 
 * 
 */
import java.util.Random;
import java.util.Scanner;

class TimeCheck extends Thread {
	int time = 60;

	@Override
	public void run() {
		for (int i = 6; i > 0; i--) {
			System.out.println("<<<<<<<<<<" + time + "�� ���ҽ��ϴ�");
			time -= 10;
			if (time == 0) {
				System.out.println("�ð� ����!");
				RndGen.a = true;
				System.out.println("����:" + RndGen.score);
				System.out.println("���α׷��� �����մϴ�....");
				System.exit(0);
				break;
			}
			try {
				Thread.sleep(10000);
			} catch (InterruptedException ie) {
				ie.printStackTrace();
			}
		}
	}
}

class RndGen extends Thread {
	static boolean a = false;
	static int score = 0;
	Random rnd = new Random();
	Scanner sc = new Scanner(System.in);

	@Override
	public void run() {
		while (!a) {
			int num1 = rnd.nextInt(10) + 1;
			int num2 = rnd.nextInt(10) + 1;
			System.out.print(num1 + " + " + num2 + " = ");
			int ans = sc.nextInt();
			if ((num1 + num2) == ans) {
				score += 10;
				System.out.println("���� " + score + "�� �Դϴ�!");
			} else {
				System.out.println("Ʋ�Ƚ��ϴ�.");
			}
		}
	}
}

public class Test13_Quiz {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		RndGen rg = new RndGen();
		rg.start();
		TimeCheck t = new TimeCheck();
		t.start();

	}
}
