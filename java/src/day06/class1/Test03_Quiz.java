package day06.class1;

import java.util.Scanner;

/*
 * �������� �Է¹޾� ���� ���̸� ���ϴ� ����� Ŭ������ ���� ������ ������.
 */
public class Test03_Quiz {
	public static void main(String[] args) {
		Circle cc = new Circle();

		cc.input();
		cc.math();
		cc.show();

	}
}

class Circle {
	private int half;
	private double result;

	public void input() {
		Scanner sc = new Scanner(System.in);
		System.out.println("�������� �Է��ϼ���");
		this.half = sc.nextInt();
	}

	public void math() {
		result = half * half * 3.14;
	}

	public void show() {
		System.out.println("�Է°��" + result);
	}
}
