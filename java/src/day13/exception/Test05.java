package day13.exception;

import java.util.Scanner;

public class Test05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("�����Է�");
		String age = sc.next();
		try {
			int iAge = Integer.parseInt(age);
			System.out.println("�Էµ� ����: " + iAge);
		} catch (NumberFormatException e) {
			System.out.println("���̸� ���ڷ� �Է����ּ���");
			System.out.println("�����޼���: " + e.getMessage());
		}
		// public static int parseInt(String s) throws NumberFormatException
	}
}
