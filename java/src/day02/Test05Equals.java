package day02;

import java.util.Scanner;

public class Test05Equals {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("���̵��Է�");
		String id = sc.next();
		if (!id.equals("admin")) {
			System.out.println("�����ڸ��α����Ҽ��ֽ��ϴ�");
			System.out.println("���α׷��� �����մϴ�");
			return;// ���θ޼ҵ� ������
		}
		System.out.println("��й�ȣ�Է�");
		String pwd = sc.next();
		if (id.equals("admin") && pwd.equals("1234")) {
			System.out.println("�����ڷ� �α����ϼ̽��ϴ�.");
		} else {
			System.out.println("���̵� �Ǵ� ��й�ȣ�� ���� �ʽ��ϴ�.");
		}
	}
}