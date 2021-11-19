package day07;

import java.util.Scanner;

public class Test06_Quiz {
	public static void main(String[] args) {
		Student[] st = new Student[3];
		for (int i = 0; i < st.length; i++) {
			st[i] = new Student();
			st[i].input();
		}
		for (int i = 0; i < st.length; i++) {
			st[i].output();
		}

	}
}

class Student {
	private String name;
	private int kor;
	private int eng;

	// 입력메소드
	public void input() {
		Scanner sc = new Scanner(System.in);
		System.out.println("학생이름");
		name = sc.next();
		System.out.println("국어점수");
		kor = sc.nextInt();
		System.out.println("영어점수");
		eng = sc.nextInt();
		System.out.println();
	}

	// 출력메소드
	public void output() {
		System.out.println("학생이름: " + name);
		System.out.println("국어이름: " + kor);
		System.out.println("영어이름: " + eng);
		System.out.println("총점: " + (kor + eng));
		System.out.println("평균: " + (kor + eng) / 2.0);
		System.out.println("========================");
	}

}
