package day06.class1;

import java.util.Scanner;

/*
 * 학생의 번호, 국어점수, 영어점수 입력받고 번호 국어점수 영어점수 총점 평균 출력하기
 */
public class Test02 {
	// Student 클래스타입의 객체를 생성후 값 저장한 후 데이터를 출력해보세요
	public static void main(String[] args) {
		Student st = new Student();
		st.input();
		st.calc();
		st.output();
	}
}

class Student {
	private int num;
	private int kor;
	private int eng;
	private int tot;
	private double ave;

	public void input() {// 입력받기
		Scanner sc = new Scanner(System.in);
		System.out.println("학생번호 입력");
		num = sc.nextInt();
		System.out.println("국어점수 입력");
		kor = sc.nextInt();
		System.out.println("영어점수 입력");
		eng = sc.nextInt();
	}

	public void calc() {// 총점, 평균 계산하기
		tot = kor + eng;
		ave = tot / 2.0;
	}

	public void output() {
		System.out.println("학생번호 " + num);
		System.out.println("국어점수: " + kor);
		System.out.println("영어점수: " + eng);
		System.out.println("총점: " + tot);
		System.out.println("평균: " + ave);
	}
}
