package day05.homework2;

import java.util.Scanner;

//1. �л�5���� �̸��� ������ �Է¹޾� �迭�� �����ϰ�
//���� ���� ������ �л��̸�,���� ���� ������ �л��̸��� ���ؼ� ����� ������.
public class Homework01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] stu = new String[5];
		int[] num = new int[5];
		int a = 0;
		String astu = "";
		// �Է¹ޱ�
		for (int i = 0; i < stu.length; i++) {
			System.out.println("�л��� �̸��� �Է��ϼ���");
			stu[i] = sc.next();
			System.out.println(stu[i] + "�л��� ������ �Է��ϼ���");
			num[i] = sc.nextInt();
		}
		// ���� �������� ���
		for (int i = 0; i < num.length; i++) {
			if (num[i] > a) {
				a = num[i];
				astu = stu[i];
			}
		}
		System.out.println("���� ���� ����: " + a + " ->" + astu + "�л�");
		// ���� �������� ���
		for (int i = 0; i < num.length; i++) {
			if (num[i] < a) {
				a = num[i];
				astu = stu[i];
			}
		}
		System.out.println("���� ���� ����: " + a + " ->" + astu + "�л�");
	}

}
