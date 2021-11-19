package day07;

/*
 * [static]
 * 1. static메소드
 * - 일반 멤버메소드는 객체를 생성한 후에 사용할 수 있지만 static메소드는 객체 생성없이 클래스명으로
 * 	 호출해서 사용한다.
 * - 일반멤버변수(인스턴스변수)는 사용할 수 없고 static멤버만 사용할 수 있다.
 * - this는 사용할 수 없다.
 * - 만드는방법: 리턴형앞에 static을 붙인다.
 * - 인스턴스변수를 사용하지 않는 독립적인 기능의 메소드를 만들 때 static메소드를 만들어 사용한다.
 */
public class Test08_static {
	public static void main(String[] args) {
//		Math1 mm = new Math1();
//		int n = mm.add(100, 200);
//		System.out.println(n);
		int n1 = Math1.minus(100, 50);
		System.out.println(n1);
		System.out.println(Math1.num(-5));
		// java.lang.Math클래스의 static double abs(double a)메소드를 사용하여 절대값구해보세요
		System.out.println(Math.abs(-5.4));
		char[] a = { '자', '바', '따', '라', '잡', '기' };
		// String 클래스의 valueOf메소드를 사용해서 a를 String으로 변환해보세요
		// static String valueOf(char[] data)
		System.out.println(String.valueOf(a));
	}
}

class Math1 {
	private int a = 0;// 인스턴스 변수
	private static int b = 0;

	public int add(int x, int y) {
		a = x + y;
		return a;
	}

	public static int minus(int x, int y) {
//		a=x+y;-->에러
		b = x + y;
		return b;
	}

	public static int num(int x) {
		return (x < 0) ? -x : x;
	}
}
