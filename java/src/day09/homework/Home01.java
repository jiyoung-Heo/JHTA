package day09.homework;

import java.util.Scanner;

//�Ʒ��� �������̽��� ��ӹ޾� ������ ���̸� Ŭ������ ����� ����� ������.
public class Home01 {
	public static void main(String[] args) {
		Rect33 rc = new Rect33();
		rc.input();
		rc.printArea();
	}
}

interface MyArea {
	void input();// ������ Ű����� �Է¹޴� ���

	void printArea();// ���� ���ؼ� ����ϴ� ���
}

class Rect33 implements MyArea {
	private int x;
	private int y;

	@Override
	public void input() {
		Scanner sc = new Scanner(System.in);
		System.out.println("���ڸ��Է��ϼ���");
		x = sc.nextInt();
		y = sc.nextInt();
	}

	public void printArea() {
		int a = 0;
		a = x * y;
		System.out.println(a);
	}
}