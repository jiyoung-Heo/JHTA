package day01.test.bb;
/*
 * [대입연산자]
 * 연산자			의미
 * -------------------
 * a+=b			a=b+b
 * a-=b			a=b-b
 * a*=b			a=b*b
 * a/=b			a=b/b
 * a%=b			a=b%b
 * ..
 */

public class Test05 {
	public static void main(String[] args) {
		int a = 3, b = 4, c = 5, d = 6;
		a += b;
		b -= 5;
		c *= 2;
		d /= 3;
		System.out.println("a: " + a);
		System.out.println("b: " + b);
		System.out.println("c: " + c);
		System.out.println("d: " + d);
	}
}
