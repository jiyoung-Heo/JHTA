package day05.homework1;

import java.util.Scanner;

//3. ������ �Է¹޾� �������� ���غ�����. ������ �л��� ���� ���غ�����.
//��)
//10���� ������ �Է��ϼ���
//100
//90
//99
//70
//8
//..
//
//[���]
//1����:1��
//10����:0��
//..
//70����:1��
//80����:0��
//90����:2��
//100����:1��
public class Homework3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] num = new int[10];
		int[] result = new int[11];
		System.out.println("10���� ������ �Է��ϼ���");
		for (int i = 0; i < 10; i++) {
			num[i] = sc.nextInt();
		}
		System.out.println("[���]");
		int stu = 0;
		for (int i = 0; i <= 10; i++) {
			for (int j = 0; j < 10; j++) {
				if (num[j] / 10 == i) {
					result[i]++;
				}
			}
			System.out.println(i * 10 + "����: " + result[i] + "��");
			stu = 0;
		}
	}

}
