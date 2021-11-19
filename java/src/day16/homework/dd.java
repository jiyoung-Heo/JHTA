package day16.homework;
/*
 * 덧셈 계산 프로그램 만들기
 * 
 * 임의의 난수를 두개 더해서 맞추는 프로그램. 맞추면 점수는 10점 증가한다.
 * 시간은 60초가 주어진다.(스레드로 시간 체크하기)
 * 예)
 * 3+2=5
 * 정답
 * 9+3=1
 * 오답
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
				System.out.println("정답!");
				cnt += 10;
				System.out.println("현재 점수 :" + cnt + "점!");
				;
			} else {
				System.out.println("오답");
				System.out.println("현재 점수 :" + cnt + "점!");
				;
			}
			count++;
		}
		System.out.println("문제 종료");
		System.out.println("최종 점수 :" + cnt + "점!");
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
					System.out.println("시간 종료");
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
			t.join();// t스레드가 종료될때까지 기다림(join)
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("종료되었습니다.");
		System.out.println("최종 점수 : " + m.getCnt());
		System.exit(0);
	}
}
