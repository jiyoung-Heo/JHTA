package day01.test.bb;

import java.util.Scanner;

/*
 * [������]
 * - ���׿�����(���ǿ�����)
 *  ����)
 *  (���ǽ�)?��1:��2;
 *  -> ���ǽ��� ���̸� ��1, �����̸� ��2�� ������� ���´�.
 */

public class Test01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		System.out.println("ù��° �� �Է�");
//		int n1 = sc.nextInt();
//		System.out.println("�ι�° �� �Է�");
//		int n2 = sc.nextInt();
//
//		int n3 = (n1 > n2) ? n1 : n2;
//
//		System.out.println("�μ��� ū���� " + n3 + "�Դϴ�.");

		// ������ ������ �Է¹޾� ���밪�� ���� ������.
		// ��: -10 �Է� --> ���밪: 10
		System.out.println("���� �Է�");
		int n4 = sc.nextInt();
		int n6 = (n4 > 0) ? n4 : -n4;
		System.out.println("����: " + n6);
	}
}
