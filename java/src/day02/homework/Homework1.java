package day02.homework;

import java.util.Scanner;

//1. �� ������ �Է¹޾� �� ���� ���� ū���� ���� ������.(if�� ���)
public class Homework1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("ù��° ������ �Է��ϼ���");
		int num1 = sc.nextInt();
		System.out.println("�ι�° ������ �Է��ϼ���");
		int num2 = sc.nextInt();
		System.out.println("����° ������ �Է��ϼ���");
		int num3 = sc.nextInt();
		if (num1 > num2 && num1 > num3) {
			System.out.println("���� ū ������ " + num1 + "�Դϴ�");
		} else if (num2 > num1 && num2 > num3) {
			System.out.println("���� ū ������ " + num2 + "�Դϴ�");
		} else if (num3 > num1 && num3 > num2) {
			System.out.println("���� ū ������ " + num3 + "�Դϴ�");
		}
	}
}