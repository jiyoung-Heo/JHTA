package day02.homework;

import java.util.Scanner;

//1. 세 정수를 입력받아 세 수중 가장 큰값을 구해 보세요.(if문 사용)
public class Homework1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("첫번째 정수를 입력하세요");
		int num1 = sc.nextInt();
		System.out.println("두번째 정수를 입력하세요");
		int num2 = sc.nextInt();
		System.out.println("세번째 정수를 입력하세요");
		int num3 = sc.nextInt();
		if (num1 > num2 && num1 > num3) {
			System.out.println("가장 큰 정수는 " + num1 + "입니다");
		} else if (num2 > num1 && num2 > num3) {
			System.out.println("가장 큰 정수는 " + num2 + "입니다");
		} else if (num3 > num1 && num3 > num2) {
			System.out.println("가장 큰 정수는 " + num3 + "입니다");
		}
	}
}