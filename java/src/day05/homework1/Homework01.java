package day05.homework1;

import java.util.Scanner;

//1. �л�5���� ������ �迭�� �����ϰ� ��ü����,��ü���,���� ��������,���� ���� ������ ���غ����� ( while�� ���)
public class Homework01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] std = new int[5];
		int sum = 0;
		int high = 0;

		for (int i = 0; i < 5; i++) {
			System.out.print((i + 1) + "�� �л��� ����:");
			std[i] = sc.nextInt();
		}

		int i = 0;
		while (i < 5) {
			sum += std[i];
			if (high < std[i]) {
				high = std[i];
			}
			i++;
		}
		int low = high;
		i = 0;
		while (i < 5) {
			if (low > std[i]) {
				low = std[i];
			}
			i++;
		}

		System.out.println("��ü����" + sum);
		System.out.println("��ü���" + sum / 5.0);
		System.out.println("�����������" + high);
		System.out.println("���峷������" + low);
	}
}
