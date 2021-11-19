package day02;

import java.util.Scanner;

public class Test09Quiz {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("학생번호: ");
		int stuNum = sc.nextInt();
		System.out.print("국어점수: ");
		int kor = sc.nextInt();
		System.out.print("영어점수: ");
		int eng = sc.nextInt();
		int sum = kor + eng;
		System.out.println("학생번호" + stuNum + "번 학생의 총점,평균, 학점입니다.");
		System.out.println("총점: " + sum);
		System.out.println("평균: " + sum / 2.0);
		int grade = (int) (sum / 2.0 / 10);
		switch (grade) {
		case 10:
		case 9:
			System.out.println("학점: A");
			break;
		case 8:
			System.out.println("학점: B");
			break;
		case 7:
			System.out.println("학점: C");
			break;
		case 6:
			System.out.println("학점: D");
			break;
		default:
			System.out.println("학점: E");
		}
	}
}