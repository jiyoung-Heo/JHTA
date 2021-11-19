package day13.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Test02_Exception {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			try {
				System.out.println("첫번째 수 입력(종료:0)");
				int n1 = sc.nextInt();
				if (n1 == 0)
					break;
				System.out.println("두번째 수 입력");
				int n2 = sc.nextInt();
				int n3 = n1 / n2;
				System.out.println(n1 + "/" + n2 + "=" + n3);

			} catch (ArithmeticException e) {
				System.out.println("0으로 나눌수 없어요.");
				System.out.println("에러메세지: " + e.getMessage());
			} catch (InputMismatchException e) {
				System.out.println("정수로 입력해 주세요.");
				System.out.println("에러메세지: " + e.getMessage());
				sc.next();// 잘못입력된 문자 읽어와서 버리기
			} finally {
				System.out.println("예외와 상관없이 무조건 실행");
			}

		}
	}
}
