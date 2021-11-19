package day01.test.bb;

import java.util.Scanner;

/*
 * [연산자]
 * 1. 단항연산자
 * 		++, --, !
 * 2. 산술연산자
 * 		+,-,*,/,%(나머지값)
 * 3. 관계연산자
 * 		>,>=,==,!=,<=
 * 4. 논리연산자
 * 		!,&&,||
 * 5. 조건연산자
 * 		(조건식)?값1:값2;
 * 6. 대입연산자
 * 		=, +=, -=, *=, %=,...
 * 
 * [if문]
 * 형식)
 * if(조건식){
 * 		조건이 참일때 수행할 문장;
 * 		..
 * }else{
 * 		조건이 거짓일 때 수행할 문장;
 * 		..
 * }
 */
public class Test02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("임의의 정수 입력");
		int n = sc.nextInt();
//		int a = n % 2;
//		System.out.println(a);
//		if (n % 2 == 0) {
//			System.out.println(n + "은 짝수 입니다");
//		} else {
//			System.out.println(n + "은 홀수 입니다");
//		}
		String result = (n % 2 == 0) ? "은 짝수 입니다" : "은 홀수 입니다";
		System.out.println(n + result);
	}
}
