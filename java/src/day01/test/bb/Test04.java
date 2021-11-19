package day01.test.bb;

/*
 * [증감연산자]
 * ++a : a=a+1을 의미
 * --b : b=b-1을 의미
 * ++,-- 기호가 앞에 있으면 연산식에서 증감된 값으로 연산하고
 * ++,-- 기호가 뒤에 있으면 연산식에서 증감되지 않은 값으로 연산하고 연산식이 끝나면 값을 증감한다
 *  
 */
public class Test04 {
	public static void main(String[] args) {
//		int a = 10;
//		int b = ++a;
//		int c = b++;
//		System.out.println("a:" + a);
//		System.out.println("b:" + b);
//		System.out.println("c:" + c);
		int a1 = 10, b1 = 10, c1 = 10, d1 = 0, d2 = 0;
		d1 = ++a1 + 10;
		d2 = b1++ + a1 + c1--;
//		System.out.println("a1:" + a1);
//		System.out.println("b1:" + b1);
//		System.out.println("c1:" + c1);
//		System.out.println("d1:" + d1);
//		System.out.println("d2:" + d2);

		int a2 = 5, b2 = 5, c2 = 5;
		int d3 = ++a2 + b2;
		int e = b2-- + 10;
		int f = c2++ + b2;
		// 먼저 실행하지 말고 결과를 예상해보세요.
		System.out.println("a2:" + a2);
		System.out.println("b2:" + b2);
		System.out.println("c2:" + c2);
		System.out.println("b3:" + d3);
		System.out.println("e:" + e);
		System.out.println("f:" + f);

	}
}
