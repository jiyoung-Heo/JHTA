package day05.array;

import java.util.Scanner;

/*
 * �л� ����� �Է¹޾� �л��� ������ ����غ�����.
 * ������ �Ʒ��� �����ϴ�.(���� 1���� 10��)
 * ��)
 * �л���� 10�� �Է�
 * 1�����Է�:1
 * 2�����Է�:3
 * ...
 * �л�����:xxx
 */
public class Test05_Quiz {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] a = { 1, 2, 3, 4, 1, 2, 3, 4, 1, 2 };
		int score = 0;
		int[] result = new int[10];
		char[] c = new char[10];
		System.out.println("������Է��ϼ���");
		for (int i = 0; i < result.length; i++) {
			System.out.print((i + 1) + "�� �� �Է�: ");
			result[i] = sc.nextInt();
		}
		for (int i = 0; i < result.length; i++) {
			if (a[i] == result[i]) {
				score += 10;
				c[i] = 'O';
			} else {
				c[i] = 'X';
			}
		}
		for (int i = 0; i < c.length; i++) {
			System.out.print(result[i] + " ");
		}
		System.out.println();
		for (int i = 0; i < c.length; i++) {
			System.out.print(c[i] + " ");
		}
		System.out.println();
		System.out.println("����: " + score);
	}
}
