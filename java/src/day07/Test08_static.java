package day07;

/*
 * [static]
 * 1. static�޼ҵ�
 * - �Ϲ� ����޼ҵ�� ��ü�� ������ �Ŀ� ����� �� ������ static�޼ҵ�� ��ü �������� Ŭ����������
 * 	 ȣ���ؼ� ����Ѵ�.
 * - �Ϲݸ������(�ν��Ͻ�����)�� ����� �� ���� static����� ����� �� �ִ�.
 * - this�� ����� �� ����.
 * - ����¹��: �������տ� static�� ���δ�.
 * - �ν��Ͻ������� ������� �ʴ� �������� ����� �޼ҵ带 ���� �� static�޼ҵ带 ����� ����Ѵ�.
 */
public class Test08_static {
	public static void main(String[] args) {
//		Math1 mm = new Math1();
//		int n = mm.add(100, 200);
//		System.out.println(n);
		int n1 = Math1.minus(100, 50);
		System.out.println(n1);
		System.out.println(Math1.num(-5));
		// java.lang.MathŬ������ static double abs(double a)�޼ҵ带 ����Ͽ� ���밪���غ�����
		System.out.println(Math.abs(-5.4));
		char[] a = { '��', '��', '��', '��', '��', '��' };
		// String Ŭ������ valueOf�޼ҵ带 ����ؼ� a�� String���� ��ȯ�غ�����
		// static String valueOf(char[] data)
		System.out.println(String.valueOf(a));
	}
}

class Math1 {
	private int a = 0;// �ν��Ͻ� ����
	private static int b = 0;

	public int add(int x, int y) {
		a = x + y;
		return a;
	}

	public static int minus(int x, int y) {
//		a=x+y;-->����
		b = x + y;
		return b;
	}

	public static int num(int x) {
		return (x < 0) ? -x : x;
	}
}
