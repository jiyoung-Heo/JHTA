package day05.array;

import java.util.Scanner;

/*
 * ȸ�����̵� �Է¹޾� ��й�ȣ�� ����ϴ� ���α׷� �����
 * ��)
 * ȸ�����̵��Է�:admin
 * [admin]���� ��й�ȣ�� [1234]�Դϴ�.
 * �Ǵ�
 * ȸ�����̵��Է�:abcd
 * �ش� ���̵� �������� �ʽ��ϴ�.
 */
public class Test13_Quiz {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[][] users = { { "admin", "1234" }, { "test", "0000" }, { "hello", "1004" } };
		String id = "";
		int cnt = 0;
		System.out.print("���̵� �Է��ϼ���: ");
		id = sc.next();
		for (int i = 0; i < users.length; i++) {
			if (users[i][0].equals(id)) {
				System.out.println("[" + id + "]���� ��й�ȣ�� " + users[i][1] + "�Դϴ�.");
				cnt = 1;
				break;
			}
		}
		if (cnt == 0) {
			System.out.println("�ش� ���̵� �������� �ʽ��ϴ�.");
		}

	}
}
