package day03.homework;

import java.util.Scanner;

//1. ������ ���� �Է¹޾� �Է¹��� ������ ���� ���� ������.
//��)������ �� �Է�:50
//[���]1���� 50������ ��:XX
public class Homework01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("������ �Է��ϼ���");
		int num = sc.nextInt();
		int sum = 0;
		System.out.println("[���]");
		for (int i = 1; i <= num; i++) {
			sum += i;
		}
		System.out.println("1���� " + num + "������ ��: " + sum);
	}
}
