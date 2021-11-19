package day02.homework;

import java.util.Scanner;

//4. 국어,영어,수학점수를 입력받고 각 과목이 50이상 평균이 70이상인 경우 합격 아니면
// 불합격을 출력해 보세요.
//
//
public class Homework4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("국어점수: ");
		int kor = sc.nextInt();
		System.out.print("수학점수: ");
		int math = sc.nextInt();
		System.out.print("영어점수: ");
		int eng = sc.nextInt();
		double evr = (kor + math + eng) / 3;
		if (kor >= 50 && math >= 50 && eng >= 50 && evr >= 70) {
			System.out.println("합격");
		} else {
			System.out.println("불합격");
		}
	}

}