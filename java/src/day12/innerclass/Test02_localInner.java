package day12.innerclass;
/*
 * [���ó���Ŭ����]
 * - �޼ҵ� �ȿ� Ŭ������ ������� ���
 * - �޼ҵ� �ȿ����� ��� �����ϴ�.
 * - �ܺ�Ŭ������ ��������� ���ٰ��������� �޼ҵ峻�� ���������� ������ �� ���� final����� ���ٰ����ϴ�.
 */

class Outer2 {
	private int a;

	public void test() {
		int b = 20;
		b = 200;// b�� final����� �ƴ� ����.
		final int c = 30;
		class Inner2 {// �޼ҵ峻�ο��� Ŭ������ ���ǵ�->���ó���Ŭ����
			public void print() {
//				a=30; �ܺΰ��� ���ٰ���
				System.out.println("a: " + a);
//				b=30; ���������� ������ �� ����. 13���� b���� final����̴�.(14���� ������! final�����Ȱɷ� �� �� ����)
//				System.out.println("b: " + b);
				System.out.println("c " + c);
			}
		}
		Inner2 in2 = new Inner2();
		in2.print();
	}
}

public class Test02_localInner {
	public static void main(String[] args) {
		Outer2 outer2 = new Outer2();
		outer2.test();
	}
}
