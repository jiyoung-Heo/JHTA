package day01.homework;

import java.util.Scanner;

//1. 반지름(int)을 입력받아 원의 넓이를 구해 보세요. 원의넓이: 반지름*반지름*3.14
//2. 국어, 영어점수를 입력받아 평균이 80점이상이면 "합격", 아니면 "불합격"을 출력하도록 작성해 보세요.

public class Homework {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		System.out.println("반지름을 입력하세요");
//		int half = sc.nextInt();
//		System.out.println(half * half * 3.14);
		System.out.print("국어점수: ");
		int kor = sc.nextInt();
		System.out.print("영어점수: ");
		int eng = sc.nextInt();
//		if ((kor + eng) / 2 >= 80) {
//			System.out.println("합격입니다.");
//		} else {
//			System.out.println("불합격입니다.");
//		}
		String result = (((kor + eng) / 2) >= 80) ? "합격" : "불합격";
		System.out.println(result);
		System.out.println(result);

	}
}
