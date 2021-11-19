package day02.homework;

import java.util.Scanner;

//6. 키와 몸무게를 입력받아 비만도 측정프로그램 작성해 보세요.
// - 표준 몸무게 구하는 법
// 키 151 이상일 경우: (키－100)×0.9
// 키 150 이하일 경우: (키－100)
// - 비만도 구하는 법
// 현재 몸무게 ÷ 표준 몸무게 ×100
// - 비만도
// 90~110 = 정상체중
// 110~120 =과체중
// 120 이상 = 비만
public class Homework6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("키: ");
		int hight = sc.nextInt();
		System.out.print("몸무게: ");
		int weight = sc.nextInt();
		if (hight >= 151) {
			double result = (double) weight / ((hight - 100) * 0.9) * 100;
			System.out.println("표준몸무게: " + (hight - 100) * 0.9);
			System.out.println("비만도: " + result);
			if (result >= 120) {
				System.out.println("비만");
			} else if (result < 120 && result >= 110) {
				System.out.println("과체중");
			} else if (result >= 90 && result < 110) {
				System.out.println("정상");
			} else {
				System.out.println("저체중");
			}
		} else if (hight <= 150) {
			double result = (double) weight / (hight - 100) * 100;
			System.out.println("표준몸무게: " + (hight - 100));
			System.out.println("비만도: " + result);
			if (result >= 120) {
				System.out.println("비만");
			} else if (result < 120 && result >= 110) {
				System.out.println("과체중");
			} else if (result >= 90 && result < 110) {
				System.out.println("정상");
			} else {
				System.out.println("저체중");
			}
		}
	}

}