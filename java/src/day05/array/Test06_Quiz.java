package day05.array;

import java.util.Scanner;

/*
 * ���̵� �Է¹޾� ��밡���� ���̵����� �ƴ��� ����� ������
 * ������ ������� ���̵�� �Ʒ��� ���� ����Ǿ� ����
 * String[] ids = {"test","user1","admin","hello1"}
 * 
 * ��)
 * ����� ���̵� �Է�: user1
 * user1�� ������� ���̵��Դϴ�.
 * ����� ���̵��Է�: java12
 * java12�� ��밡���� ���̵��Դϴ�.
 */
public class Test06_Quiz {
	public static void main(String[] args) {
		String[] ids = { "test", "user1", "admin", "hello1" };
		Scanner sc = new Scanner(System.in);
		System.out.print("����� ���̵� �Է�: ");
		String id = sc.next();
		boolean result = false;
		for (int i = 0; i < ids.length; i++) {
			if (ids[i].equals(id)) {
				System.out.println(id + "�� ������� ���̵��Դϴ�.");
				result = true;
				break;
			}
		}
		if (!result) {
			System.out.println("��밡���� ���̵��Դϴ�.");
		}
		result = false;
	}
}
