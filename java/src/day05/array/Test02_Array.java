package day05.array;

import java.util.Scanner;

/*
 * �л� 10���� ������ �Է¹޾� �迭�� �����ϰ� ���� ���� ������ ���� ���� ����ϱ�
 */
public class Test02_Array {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] grade = new int[10];
		for (int i = 0; i < 10; i++) {
			System.out.print((i + 1) + "�� �л��� ������ �Է��ϼ���: ");
			grade[i] = sc.nextInt();
		}
		for (int i = 0; i < 10; i++) {
			System.out.print(grade[i] + " ");
		}
		System.out.println();
		int result = 0;

		for (int i = 0; i < 10; i++) {
			if (grade[i] > result) {
				result = grade[i];
			}

		}
		System.out.println("�ִ밪" + result);
		int min = result;
		for (int i = 9; i >= 0; i--) {
			if (grade[i] < min) {
				min = grade[i];
			}
		}
		System.out.println("�ּҰ�" + min);
	}
}
