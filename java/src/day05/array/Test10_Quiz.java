package day05.array;

import java.util.Scanner;

/*
 * 3���� �л��� ��ȣ, ����, ����, �������� �Է¹޾� ����, ��� ���ؼ� ����ϱ�
 */
public class Test10_Quiz {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[][] stu = new int[3][6];
		int sum = 0;
		String[] sub = { "����", "����", "����" };
		for (int i = 0; i < stu.length; i++) {
			System.out.println("��ȣ�� �Է��ϼ���");
			stu[i][0] = sc.nextInt();
			for (int j = 1; j < 4; j++) {
				System.out.println(sub[j - 1] + "�����Է�");
				stu[i][j] = sc.nextInt();
				if (stu[i][j] < 1 || stu[i][j] > 100) {
					System.out.println("�߸� �Է��ϼ̽��ϴ�.");
					j--;
				}
			}
		}
		for (int i = 0; i < stu.length; i++) {
			for (int j = 1; j < 4; j++) {
				sum += stu[i][j];
			}
			System.out.println(stu[i][0] + "�� �л���" + "�հ�: " + sum);
			System.out.println(stu[i][0] + "�� �л���" + "���: " + sum / 3.0);
			sum = 0;
		}
	}
}
