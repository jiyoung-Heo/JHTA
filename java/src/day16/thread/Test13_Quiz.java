package day16.thread;

/*
 * << 덧셈계산 프로그램 >>
 * 임의의 난수를 두개 더하는 프로그램. 맞히면 점수는 10점 증가한다.
 * 시간은 60초가 주어진다.(스레드로 시간체크하기)
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
			System.out.println("<<<<<<<<<<" + time + "초 남았습니다");
			time -= 10;
			if (time == 0) {
				System.out.println("시간 종료!");
				RndGen.a = true;
				System.out.println("점수:" + RndGen.score);
				System.out.println("프로그램을 종료합니다....");
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
				System.out.println("현재 " + score + "점 입니다!");
			} else {
				System.out.println("틀렸습니다.");
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
