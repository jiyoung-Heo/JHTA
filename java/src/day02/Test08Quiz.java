package day02;

import java.util.Scanner;

/*
 * 두 정시와 사칙연산자 중 하나를 입력받아 해당 연산이 수행되도록 프로그램 구현하기
 * switch사용
 * 예)
 * 연산할첫번째 정수
 * 1
 * 연산할두번째 정수
 * 연산자(+,-,*,/)
 * [결과]
 * 1-2=-1
 */
public class Test08Quiz {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("첫번째 수");
		int num1 = sc.nextInt();
		System.out.println("두번째 수");
		int num2 = sc.nextInt();
		System.out.println("연산자");
		String mix = sc.next();
		switch (mix) {
		case "+":
			System.out.println(num1 + "+" + num2 + "=" + (num1 + num2));
			break;
		case "-":
			System.out.println(num1 + "-" + num2 + "=" + (num1 - num2));
			break;
		case "*":
			System.out.println(num1 + "*" + num2 + "=" + (num1 * num2));
			break;
		case "/":
			System.out.println(num1 + "/" + num2 + "=" + ((double) num1 / num2));
			break;
		default:
			System.out.println("연산자 입력오류");
		}
	}
}
