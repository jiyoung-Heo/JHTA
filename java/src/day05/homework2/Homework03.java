package day05.homework2;

import java.util.Random;
import java.util.Scanner;

//3. ���������� ����
//��) ����:1 ����:2 ���ڱ�:3
//  ������������ ������:1
//
// [���]
// ��:����
// ��ǻ��:����
// ==> ��ǻ�Ͱ� �̰���ϴ�.
//���
//���� 
public class Homework03 {
	public static void main(String[] args) {
		Random rd = new Random();
		Scanner sc = new Scanner(System.in);
		String[] ga = { "����", "����", "��" };

		System.out.println("����:1 ����:2 ���ڱ�:3");
		System.out.print("������������ ������: ");
		int result = sc.nextInt();
		int com = rd.nextInt(3) + 1;
		System.out.println("\n[���]");
		System.out.println("��: " + ga[result - 1]);
		System.out.println("��ǻ��: " + ga[com - 1]);

		for (int i = 0; i < ga.length; i++) {
			if (com < result || (com == 3 && result == 1)) {
				System.out.println("��ǻ�Ͱ� �����ϴ�.");
				break;
			}
		}
		if (!(com < result || (com == 3 && result == 1))) {
			System.out.println("��ǻ�Ͱ� �̰���ϴ�.");
		}

	}
}
