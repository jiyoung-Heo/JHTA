package day05.array;

import java.util.Scanner;

/*
 * 3���л��� �л���ȣ �̸� ��ȭ��ȣ �ּҸ� �Է¹޾� ����� ������.
 * 2���� �迭 ���
 */
public class Test14_Quiz {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[][] save = new String[3][4];
		for (int i = 0; i < save.length; i++) {
			System.out.println((i + 1) + "�� �л��� �л���ȣ, �̸�, ��ȭ��ȣ, �ּҸ� �Է��ϼ���");
			for (int j = 0; j < save[i].length; j++) {
				save[i][j] = sc.next();
			}
		}
		System.out.println("[�л�����]");
		for (int i = 0; i < save.length; i++) {
			for (int j = 0; j < save[i].length; j++) {
				System.out.print(save[i][j] + "	");
			}
			System.out.println();
		}
	}
}
