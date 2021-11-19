package day12.innerclass;

/*
 * [����Ŭ����]
 * - Ŭ�������ο� �� �ٸ� Ŭ������ ����� ��
 * - ����Ŭ������ �ܺ�Ŭ������ ��� ����� �ڽ��� ���ó�� ����� �� �ִ�.
 */
class Outer1 {
	private int a = 10;

	class Inner1 {
		private int b = 20;

		public void printAll() {
			System.out.println("a: " + a + ",b: " + b);
		}
	}

	public void printA() {
		System.out.println("a: " + a);
	}

	public void printAB() {
		Inner1 inner1 = new Inner1();
		inner1.printAll();
	}
}

public class Test01 {
	public static void main(String[] args) {
		Outer1 ot = new Outer1();
		ot.printAB();
	}
}
