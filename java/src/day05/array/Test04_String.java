package day05.array;

import java.util.Scanner;

/*
 * String �迭
 * �ټ��� �̸� �Է¹޾� �迭�� �����ϰ� ����ϱ�
 */
public class Test04_String {
	public static void main(String[] args) {
		String[] arr = new String[5];
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < arr.length; i++) {
			System.out.println((i + 1) + "��° �л��̸� �Է�");
			arr[i] = sc.next();
		}
		System.out.println("�Էµ��л��̸�");
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}

	}
}
