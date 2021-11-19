package day13.exception;

import java.util.Scanner;

public class Test04_Throws {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("ù��° ���� �Է�");
		int n1 = sc.nextInt();
		System.out.println("�ι�° ���� �Է�");
		int n2 = sc.nextInt();
		try {
			int n3 = div(n1, n2);
			System.out.println("������: " + n3);
		} catch (ArithmeticException e) {
			System.out.println("0���� ���� �� �����.");
		}
	}

	/**
	 * ���2) ���ܰ� �߻��� �� �ִ� ������� ���� ó������ �ʰ� throw�� ���ѱ��
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
