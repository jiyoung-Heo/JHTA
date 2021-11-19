package day01.test.bb;

import java.util.Scanner;

/*
 * [논리연산자]
 * ! (not) : 어떠한 값이 참이면 거짓, 거짓이면 참으로 바꿈
 * && (and): 대응되는 값이 모두 참이면 참, 아니면 거짓
 * || (or) : 대응되는 값이 모두 거짓이면 거짓, 아니면 참
 */
public class Test03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("면접점수 입력");
		int interview = sc.nextInt();
		System.out.println("영어점수 입력");
		int eng = sc.nextInt();
		if (interview >= 90 || eng >= 80) {
			System.out.println("당신은 합격");
		} else {
			System.out.println("당신은 불합격");
		}
	}
}
