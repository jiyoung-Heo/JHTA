package day04;

import java.util.Scanner;

/*
 * [do~while문]
 * - 형식
 * do{
 * 		실행문장;
 * 		..
 * }while(조건식);
 * 
 * 	-조건식이 거짓일 때까지 반복해서 문장을 실행
 * 	-while문은 조건식을 먼저 판별하지만 do~while은 먼저 문장을 실행하고 조건을 판별한다.
 */
public class Test06_dowhile {
	public static void main(String[] args) {
//		int sum = 0;
//		int i = 1;
//		do {
//			sum += i;
//			i++;
//		} while (i <= 100);
//		System.out.println("1부터 100까지의 합" + sum);
		Scanner sc = new Scanner(System.in);
		int n = 0;
		do {
			System.out.println("단 입력");
			n = sc.nextInt();
		} while (!(n >= 2 && n <= 9));
		for (int i = 1; i <= 9; i++) {
			System.out.println(n + "*" + i + "=" + (n * i));

		}
	}
}
