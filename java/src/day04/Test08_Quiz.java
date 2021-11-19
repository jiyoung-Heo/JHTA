package day04;

import java.util.Random;
import java.util.Scanner;

/*
 * 아래와 같은 덧셈계산 프로그램이 실행되도록 해보세요.
 * 예)
 * 1+2=3
 * 2+3=5
 * ...
 * --> 덧셈 연산할 두 수는 랜덤한 난수이고 사용자가 답을 입력해 맞춘다.
 * 	문제는 총 10문제이고 점수는 1문제당 10점이다.
 * 	
 */
public class Test08_Quiz {
	public static void main(String[] args) {
		Random rnd = new Random();
		Scanner sc = new Scanner(System.in);
		int cnt = 0;
		for (int i = 0; i < 10; i++) {
			int num1 = rnd.nextInt(10) + 1;
			int num2 = rnd.nextInt(10) + 1;
			System.out.print(num1 + "+" + num2 + "=");
			int result = sc.nextInt();
			if ((num1 + num2) == result) {
				System.out.println("정답!");
				cnt++;
			}
		}
		System.out.println("맞춘갯수: " + cnt + "개");

	}
}
