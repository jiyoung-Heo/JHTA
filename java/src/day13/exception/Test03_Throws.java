package day13.exception;

import java.util.Scanner;

/*
 * [예외처리 방법]
 * - 자바에서는 예외처리방법이 두가지가 있다.
 * 방법1) 예외가 발생될 수 있는 문장들을 직접 try~catch로 처리하기
 * 방법2) 예외가 발생될 수 있는 문장들을 직접 처리하지 않고 throw로 떠넘기기
 */
public class Test03_Throws {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("첫번째 정수 입력");
		int n1 = sc.nextInt();
		System.out.println("두번째 정수 입력");
		int n2 = sc.nextInt();
		int n3 = div(n1, n2);
		System.out.println("나눈값: " + n3);
	}

	/**
	 * 방법1) 예외가 발생될 수 있는 문장들을 직접 try~catch로 처리하기
	 * 
	 * @param n1
	 * @param n2
	 * @return
	 */
	public static int div(int n1, int n2) {
		try {
			int n3 = n1 / n2;
			return n3;
		} catch (ArithmeticException e) {
			System.out.println("0으로 나눌 수 없어요" + e.getMessage());
			return 0;
		}
	}
}
