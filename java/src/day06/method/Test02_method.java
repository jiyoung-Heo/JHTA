package day06.method;

import java.util.Scanner;

/*
 * ���μ��α��� �Է¹޾� �簢�� ���� ���ϱ�
 */
public class Test02_method {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("���α����Է�");
		double w = sc.nextDouble();
		System.out.println("���α����Է�");
		double h = sc.nextDouble();
		// �簢���� ���̸� ���ϴ� getBox �޼ҵ带 �ϼ��ؼ� ���α׷��� ����ǵ��� �غ�����
		double area = getBox(w, h);
		System.out.println("����" + area);
//		System.out.println("����" + getBox(w, h));
		System.out.println("�������Է�");
		double ban = sc.nextDouble();
		System.out.println("���� ����" + result(ban));

	}

	public static double getBox(double w, double h) {
		double nul = w * h;
		return nul;
	}

	public static double result(double ban) {
		double nul = ban * ban * 3.14;
		return nul;
	}
}
