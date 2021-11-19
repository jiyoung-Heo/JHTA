package day07;

/*
 * 2. static 멤버변수(클래스변수)
 * - 인스턴스변수는 객체의 수만큼 생성되지만 static멤버변수는 객체의 수와 상관없이 오로지 하나만 생성되어 모든 객체가 공유해서 사용한다.
 * - 만드는방법: 멘버변수앞에 static을 붙여서 만든다.
 * - 인스턴스변수는 객체를 new로 생성하는 순간에 만들어지지만 static멤버변수는 mew로 생성하지 않아도 클래스가 로딩되는 순간에 생성된다.
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
