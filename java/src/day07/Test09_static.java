package day07;

/*
 * 2. static �������(Ŭ��������)
 * - �ν��Ͻ������� ��ü�� ����ŭ ���������� static��������� ��ü�� ���� ������� ������ �ϳ��� �����Ǿ� ��� ��ü�� �����ؼ� ����Ѵ�.
 * - ����¹��: ��������տ� static�� �ٿ��� �����.
 * - �ν��Ͻ������� ��ü�� new�� �����ϴ� ������ ����������� static��������� mew�� �������� �ʾƵ� Ŭ������ �ε��Ǵ� ������ �����ȴ�.
 */

class MyClass {
	private int a;
	private static int b;

	public MyClass() {
		a++;
		b++;
	}

	public int getA() {
		return a;
	}

	public static int getB() {
		return b;
	}
}

public class Test09_static {
	public static void main(String[] args) {
		MyClass mc1 = new MyClass();
		System.out.println("a: " + mc1.getA());
		System.out.println("b: " + MyClass.getB());
		MyClass mc2 = new MyClass();
		System.out.println("a: " + mc2.getA());
		System.out.println("b: " + MyClass.getB());
		MyClass mc3 = new MyClass();
		System.out.println("a: " + mc3.getA());
		System.out.println("b: " + MyClass.getB());
	}
}
