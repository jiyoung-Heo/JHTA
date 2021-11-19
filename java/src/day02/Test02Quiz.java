package day02;

import java.util.Scanner;

/*
 * 1. 두 정수를 입력받아 두 수중 큰 값을 if문을 사용하여 구해보세요.
 */
public class Test02Quiz {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("첫번째 정수를 입력하세요");
		int num1 = sc.nextInt();
		System.out.println("두번째 정수를 입력하세요");
		int num2 = sc.nextInt();
		if (num1 > num2) {
			System.out.println(num1);
		} else if (num1 < num2) {
			System.out.println(num2);
		} else {
			System.out.println("두 값이 동일합니다.");
		}
//		int max = num1;
//		if (max < num2) {
//			max = num2;
//		}
//		System.out.println("큰값" + max);

	}
}