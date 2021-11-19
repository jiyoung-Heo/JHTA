package day13.exception;

import java.util.Scanner;

public class Test04_Throws {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("첫번째 정수 입력");
		int n1 = sc.nextInt();
		System.out.println("두번째 정수 입력");
		int n2 = sc.nextInt();
		try {
			int n3 = div(n1, n2);
			System.out.println("나눈값: " + n3);
		} catch (ArithmeticException e) {
			System.out.println("0으로 나눌 수 없어요.");
		}
	}

	/**
	 * 방법2) 예외가 발생될 수 있는 문장들을 직접 처리하지 않고 throw로 떠넘기기
	 * 
	 * @param n1
	 * @param n2
	 * @return
	 * @throws ArithmeticException
	 */
	public static int div(int n1, int n2) throws ArithmeticException {
		int n3 = n1 / n2;
		return n3;
	}
}
