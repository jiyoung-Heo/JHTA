package day05.array;

import java.util.Scanner;

/*
 * �ټ����� ��ȣ, ����, ���������� �Է¹޾� ���� ��� ���ؼ� ����ϱ�
 */
public class Test09_Array {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[][] arr = new int[5][5];
		System.out.println("�Է��ϼ���");
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < 3; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		for (int i = 0; i < arr.length; i++) {
			for (int j = 1; j < 3; j++) {
				arr[i][3] += arr[i][j];
			}
			arr[i][4] = arr[i][3] / 2;
			System.out.println(i + "�л��� ����: " + arr[i][3]);
			System.out.println(i + "�л��� ���: " + arr[i][4]);
		}
	}
}
