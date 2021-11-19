package day13.exception;

import java.util.Scanner;

/*
 * [����ó�� ���]
 * - �ڹٿ����� ����ó������� �ΰ����� �ִ�.
 * ���1) ���ܰ� �߻��� �� �ִ� ������� ���� try~catch�� ó���ϱ�
 * ���2) ���ܰ� �߻��� �� �ִ� ������� ���� ó������ �ʰ� throw�� ���ѱ��
 */
public class Test03_Throws {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("ù��° ���� �Է�");
		int n1 = sc.nextInt();
		System.out.println("�ι�° ���� �Է�");
		int n2 = sc.nextInt();
		int n3 = div(n1, n2);
		System.out.println("������: " + n3);
	}

	/**
	 * ���1) ���ܰ� �߻��� �� �ִ� ������� ���� try~catch�� ó���ϱ�
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
			System.out.println("0���� ���� �� �����" + e.getMessage());
			return 0;
		}
	}
}
