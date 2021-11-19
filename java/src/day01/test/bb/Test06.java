package day01.test.bb;

/*
 * [쉬프트연산자]
 * 정수<<n: 정수를 좌측방향으로 n비트 이동
 * 정수>>n: 정수를 우측방향으로 n비트 이동
 */
public class Test06 {
	public static void main(String[] args) {
		int a = 7;
		int b = a << 2;
		int c = a >> 2;
		System.out.println("b: " + b);
		System.out.println("c: " + c);
	}
}
