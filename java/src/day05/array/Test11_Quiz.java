package day05.array;

import java.util.Scanner;

/*
 * �л�������Է¹޾� �л��� ������ ����غ�����
 * ������ �Ʒ��� �����ϴ�. ���� 1���� 10��
 * 
 * int[] a = { 1, 2, 3, 4, 1, 2, 3, 4, 1, 2 };
 * ��)
 * �л����10���Է�
 * 1�����Է�: 1
 * ...
 * 
 * �л�����: xx��
 * -->�л��� 3���ΰ��(2�����迭���
 * [��°��]
 * 1 2 ... 90
 * ... 100
 * ... ...
 * 
 */
public class Test11_Quiz {
	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 4, 1, 2, 3, 4, 1, 2 };
		Scanner sc = new Scanner(System.in);
		int[][] stu = new int[3][11];
		for (int i = 0; i < 3; i++) {
			System.out.println((i + 1) + "�� �л� ");
			stu[i][10] = 0;
			for (int j = 0; j < 10; j++) {
				System.out.print((j + 1) + "�� �� �Է�: ");
				stu[i][j] = sc.nextInt();
				if (stu[i][j] == a[j]) {
					stu[i][10] += 10;
				}
			}
		}
		System.out.println("[��°��]");
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 11; j++) {
				System.out.print(stu[i][j] + " ");
			}
			System.out.println();
		}

	}
}
