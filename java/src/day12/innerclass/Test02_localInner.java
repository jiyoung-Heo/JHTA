package day12.innerclass;
/*
 * [로컬내부클래스]
 * - 메소드 안에 클래스가 만들어진 경우
 * - 메소드 안에서만 사용 가능하다.
 * - 외부클래스의 멤버변수는 접근가능하지만 메소드내의 지역변수는 접근할 수 없고 final상수만 접근가능하다.
 */

class Outer2 {
	private int a;

	public void test() {
		int b = 20;
		b = 200;// b는 final상수가 아닌 변수.
		final int c = 30;
		class Inner2 {// 메소드내부에서 클래스가 정의됨->로컬내부클래스
			public void print() {
//				a=30; 외부값은 접근가능
				System.out.println("a: " + a);
//				b=30; 지역변수는 접근할 수 없다. 13줄의 b값은 final상수이다.(14줄이 없으면! final생략된걸로 볼 수 있음)
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
