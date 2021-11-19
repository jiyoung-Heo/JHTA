package day05.array;

import java.util.Scanner;

/*
 * 10���л��������Է¹޾ƹ迭�������ϰ���ü�Էµ������� ����غ�����
 * ������ 80���̻��� �л����� ���ؼ� ����ϼ���
 * 
 * ��)
 * 10���л������Է�
 * ...
 * [�Էµ��л�����]
 * 100 90 70 ...
 * ������ 80���̻��� �л��� : 2��
 */
public class Test03_Quiz {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] stu = new int[10];
		int cnt = 0;
		for (int i = 0; i < stu.length; i++) {
			System.out.print((i + 1) + "�� �л� ���� �Է�: ");
			stu[i] = sc.nextInt();
		}
		System.out.println("");
		for (int i = 0; i < stu.length; i++) {
			System.out.print(stu[i] + " ");
			if (stu[i] >= 80) {
				cnt++;
			}
		}
		System.out.println();
		System.out.println("������ 80�� �̻��� �л���: " + cnt);
	}
}
