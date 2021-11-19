package day07.homework;

import java.util.Scanner;

//4  학생이름,국어,영어,수학점수를 입력받아 총점,평균,학점을 계산하는
//클래스를 만들고 사용해 보세요.
//학생수는 5명(객체 배열 사용)
//학점 평균  90이상 A
//              80이상 B
//...
public class Home04 {
	public static void main(String[] args) {
		Student.input();
		Student.output();
	}
}

class Student {
	private static String name;
	private static int kor;
	private static int eng;
	private static int math;
	private static String grade;

	public static void input() {
		Scanner sc = new Scanner(System.in);
		System.out.print("학생이름: ");
		String name = sc.next();
		System.out.print("국어: ");
		kor = sc.nextInt();
		System.out.print("영어: ");
		eng = sc.nextInt();
		System.out.print("수학: ");
		math = sc.nextInt();
	}

	public static void output() {
		System.out.println("총점: " + (kor + eng + math));
		System.out.println("평균: " + (kor + eng + math) / 3);
		if ((kor + eng + math) / 3 >= 90) {
			grade = "A";
		} else if ((kor + eng + math) / 3 >= 80) {
			grade = "B";
		} else {
			grade = "C";
		}
		System.out.println("학점: " + grade);
	}
}
