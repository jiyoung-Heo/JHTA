package day01.test.aa;

public class Test05_Castiong {
	/*
	 * [��������ȯ(type Casting)] - ���������� ������ ��ȯ�ϴ°� - ���� (�ٲ� �ڷ���)����/��� ��) int a =
	 * (int)4.5;
	 */
	public static void main(String[] args) {
		byte a = 100;
		int b = a;// �ڵ�����ȯ�� �̷����
		byte c = (byte) b;// ū�ڷ����� ���� �ڷ����� �������� ��������ȯ�ؾ� �Ѵ�.
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);

		long e = 333333333L;// long�� ����� �����
		System.out.println("e: " + e);
	}
}
