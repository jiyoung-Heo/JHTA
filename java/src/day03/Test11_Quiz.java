package day03;

import java.util.Scanner;

/*
 * 5���� �л���ȣ, �������� �Է¹ް� ��ü ������ ����� ���� ������
 * ��)
 * �л���ȣ�Է�: 1
 * ���������Է�: 100
 * ...
 * ��ü ����: xxx
 * ��ü ���: xxx
 */
public class Test11_Quiz {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		for (int i = 1; i <= 5; i++) {
			System.out.print("�л���ȣ�Է�: ");
			int num = sc.nextInt();
			System.out.print("���������Է�: ");
			int kor = sc.nextInt();
			sum += kor;
		}
		System.out.println("��ü ����: " + sum);
		System.out.println("��ü ���: " + sum / 5.0);
	}
}
