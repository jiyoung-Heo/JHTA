package day02.homework;

import java.util.Scanner;

//6. Ű�� �����Ը� �Է¹޾� �񸸵� �������α׷� �ۼ��� ������.
// - ǥ�� ������ ���ϴ� ��
// Ű 151 �̻��� ���: (Ű��100)��0.9
// Ű 150 ������ ���: (Ű��100)
// - �񸸵� ���ϴ� ��
// ���� ������ �� ǥ�� ������ ��100
// - �񸸵�
// 90~110 = ����ü��
// 110~120 =��ü��
// 120 �̻� = ��
public class Homework6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Ű: ");
		int hight = sc.nextInt();
		System.out.print("������: ");
		int weight = sc.nextInt();
		if (hight >= 151) {
			double result = (double) weight / ((hight - 100) * 0.9) * 100;
			System.out.println("ǥ�ظ�����: " + (hight - 100) * 0.9);
			System.out.println("�񸸵�: " + result);
			if (result >= 120) {
				System.out.println("��");
			} else if (result < 120 && result >= 110) {
				System.out.println("��ü��");
			} else if (result >= 90 && result < 110) {
				System.out.println("����");
			} else {
				System.out.println("��ü��");
			}
		} else if (hight <= 150) {
			double result = (double) weight / (hight - 100) * 100;
			System.out.println("ǥ�ظ�����: " + (hight - 100));
			System.out.println("�񸸵�: " + result);
			if (result >= 120) {
				System.out.println("��");
			} else if (result < 120 && result >= 110) {
				System.out.println("��ü��");
			} else if (result >= 90 && result < 110) {
				System.out.println("����");
			} else {
				System.out.println("��ü��");
			}
		}
	}

}