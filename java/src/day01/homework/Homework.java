package day01.homework;

import java.util.Scanner;

//1. ������(int)�� �Է¹޾� ���� ���̸� ���� ������. ���ǳ���: ������*������*3.14
//2. ����, ���������� �Է¹޾� ����� 80���̻��̸� "�հ�", �ƴϸ� "���հ�"�� ����ϵ��� �ۼ��� ������.

public class Homework {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		System.out.println("�������� �Է��ϼ���");
//		int half = sc.nextInt();
//		System.out.println(half * half * 3.14);
		System.out.print("��������: ");
		int kor = sc.nextInt();
		System.out.print("��������: ");
		int eng = sc.nextInt();
//		if ((kor + eng) / 2 >= 80) {
//			System.out.println("�հ��Դϴ�.");
//		} else {
//			System.out.println("���հ��Դϴ�.");
//		}
		String result = (((kor + eng) / 2) >= 80) ? "�հ�" : "���հ�";
		System.out.println(result);
		System.out.println(result);

	}
}
