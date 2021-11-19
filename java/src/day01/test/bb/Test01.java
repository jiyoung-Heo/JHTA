package day01.test.bb;

import java.util.Scanner;

/*
 * [연산자]
 * - 삼항연산자(조건연산자)
 *  형식)
 *  (조건식)?값1:값2;
 *  -> 조건식이 참이면 값1, 거짓이면 값2의 결과물을 갖는다.
 */

public class Test01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		System.out.println("첫번째 수 입력");
//		int n1 = sc.nextInt();
//		System.out.println("두번째 수 입력");
//		int n2 = sc.nextInt();
//
//		int n3 = (n1 > n2) ? n1 : n2;
//
//		System.out.println("두수중 큰수는 " + n3 + "입니다.");

		// 임의의 정수를 입력받아 절대값을 구해 보세요.
		// 예: -10 입력 --> 절대값: 10
		System.out.println("정수 입력");
		int n4 = sc.nextInt();
		int n6 = (n4 > 0) ? n4 : -n4;
		System.out.println("절댓값: " + n6);
	}
}
