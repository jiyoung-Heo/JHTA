package day03;

import java.util.Scanner;

public class Test10_Break {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		for (int i = 1; i <= 3; i++) {
			System.out.println(i + "��° �õ��Դϴ�.");
			System.out.print("���̵� �Է�: ");
			String id = sc.next();
			System.out.print("��й�ȣ �Է�: ");
			String pw = sc.next();
			if (id.equals("user") && pw.equals("1234")) {
				System.out.println(id + "ȸ���� ȯ���մϴ�");
				break;
			} else {
				System.out.println("���̵� �Ǵ� ��й�ȣ�� ���� �ʾƿ�. �õ������� Ƚ����" + (3 - i) + "�� ���ҽ��ϴ�.");
			}

		}
	}
}
