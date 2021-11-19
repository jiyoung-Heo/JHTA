package day03;

import java.util.Scanner;

/*
 * 5명의 학생번호, 국어점수 입력받고 전체 총점과 평균을 구해 보세요
 * 예)
 * 학생번호입력: 1
 * 국어점수입력: 100
 * ...
 * 전체 총점: xxx
 * 전체 평균: xxx
 */
public class Test11_Quiz {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		for (int i = 1; i <= 5; i++) {
			System.out.print("학생번호입력: ");
			int num = sc.nextInt();
			System.out.print("국어점수입력: ");
			int kor = sc.nextInt();
			sum += kor;
		}
		System.out.println("전체 총점: " + sum);
		System.out.println("전체 평균: " + sum / 5.0);
	}
}
