package day03.homework;

import java.util.Scanner;

//4. 임의의 정수를 입력받아 소수인지 아닌지 출력해 보세요.
//소수:1과 자신으로만 나누어지는 수(2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31....)
//
//(힌트 : for문으로 입력된 정수가 100이면 2부터 99까지 나눠본다)
public class Homework04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("정수를 입력하세요");
		int num = sc.nextInt();
		int result = 0;
		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				result += 1;
			}
		}
		if (result == 0) {
			System.out.println("소수입니다.");
		} else {
			System.out.println("소수가 아닙니다.");
		}
	}
}
