package day06.method;

/*
 * [사용자 정의 메소드]
 * - 어떠한 기능을 갖는 코드의 묶음
 * - 형식
 *  리턴형 메소드형(매개변수, ...){
 *  	실행문장;
 *  	...
 *  	return;
 *  }
 */
public class Test01_method {
	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		int c = sum(a, b);
		System.out.println("두수합" + c);
	}

	public static int sum(int x, int y) {
		int z = x + y;
		return z;
	}
}
