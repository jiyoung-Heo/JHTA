package day01.test.aa;

import java.util.Scanner;

public class Test04_Quiz {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("이름: ");
		String name = sc.next();
		System.out.print("국어: ");
		int kor = sc.nextInt();
		System.out.print("영어: ");
		int eng = sc.nextInt();
		double sum = kor + eng;
		System.out.println("---------------------------");
		System.out.println("[출력결과]\n국어점수: " + kor + "\n영어점수: " + eng + "\n총점: " + sum + "\n평균: " + sum / 2);

	}
}
