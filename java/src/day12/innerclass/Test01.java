package day12.innerclass;

/*
 * [내부클래스]
 * - 클래스내부에 또 다른 클래스를 만드는 것
 * - 내부클래스는 외부클래스의 모든 멤버를 자신의 멤버처럼 사용할 수 있다.
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
