package day02.homework;

import java.util.Scanner;

//3. ���̵�� ��й�ȣ�� �Է¹ް� ���̵�� ��й�ȣ�� ��ġ�ϴ��� �˻��� ������.(���̵�� ��й�ȣ��
// ������ ���� ���մϴ�.)
public class Homework3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("���̵� �Է��ϼ���");
		String id = sc.next();
		System.out.println("��й�ȣ�� �Է��ϼ���");
		String pw = sc.next();
		if (id.equals("admin") && pw.equals("0000")) {
			System.out.println("�α��οϷ�");
		} else {
			System.out.println("�α��� �Ұ�");
		}
	}
}