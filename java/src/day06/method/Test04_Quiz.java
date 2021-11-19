package day06.method;

import java.util.Scanner;

/*
 * 두 정수를 입력받아 두 수중 큰값을 메소드를 만들어 구해보세요
 * 세 정수를 입력받아 세 정수의 합을 메소드를 만들어 구해보세요
 */
public class Test04_Quiz {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("첫번째 정수를 입력하세요");
		int a = sc.nextInt();
		System.out.println("두번째 정수를 입력하세요");
		int b = sc.nextInt();
		bigOne(a, b);
		System.out.println("첫번째 정수를 입력하세요");
		int fir = sc.nextInt();
		System.out.println("두번째 정수를 입력하세요");
		int sec = sc.nextInt();
		System.out.println("세번째 정수를 입력하세요");
		int thir = sc.nextInt();
		System.out.println(sum(fir, sec, thir));
	}

	public static void bigOne(int a, int b) {
		if (a > b) {
			System.out.println(a);
		} else if (a < b) {
			System.out.println(b);
		} else {
			System.out.println("두 수는 같습니다.");
		}
	}

	public static int sum(int a, int b, int c) {
		int result = a + b + c;
		return result;
	}
}
