package day02.homework;

import java.util.Scanner;

//4. ����,����,���������� �Է¹ް� �� ������ 50�̻� ����� 70�̻��� ��� �հ� �ƴϸ�
// ���հ��� ����� ������.
//
//
public class Homework4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("��������: ");
		int kor = sc.nextInt();
		System.out.print("��������: ");
		int math = sc.nextInt();
		System.out.print("��������: ");
		int eng = sc.nextInt();
		double evr = (kor + math + eng) / 3;
		if (kor >= 50 && math >= 50 && eng >= 50 && evr >= 70) {
			System.out.println("�հ�");
		} else {
			System.out.println("���հ�");
		}
	}

}