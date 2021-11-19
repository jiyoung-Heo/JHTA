package day02;

import java.util.Scanner;

/*
 * 3. if~elseif 문
 *   - 조건이 여러개인 경우
 *   형식)
 *   if(조건문1){
 *   	조건문1이 참일때 수행할 문장;
 *   	..	
 * 	 }else if(조건문2){
 * 		조건문1이 참일때 수행할 문장;
 *   	..	
 * 	 }else if(조건문3){
 * 		조건문1이 참일때 수행할 문장;
 *   	..	
 *   }else{
 *   	조건이 모두 맞지 않을 때 수행할 문장;
 *   	..
 *   }
 */
public class Test03If {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		System.out.println("임의의 정수 입력");
//		int num = sc.nextInt();
//		if (num > 0) {
//			System.out.println(num + "은 양수입니다.");
//		} else if (num < 0) {
//			System.out.println(num + "은 음수입니다.");
//
//		} else {
//			System.out.println(num + "은 영입니다.");
//		}
//두 정수를 입력받아 두수중 큰 값 구하기(같은값이면 두수는 같다라고 출력하기)
		System.out.println("첫번째 정수를 입력하세요");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		if (num1 > num2) {
			System.out.println("첫번째 정수" + num1 + "이(가) 더 큽니다");
		} else if (num1 < num2) {
			System.out.println("첫번째 정수" + num2 + "이(가) 더 큽니다");
		} else {
			System.out.println("두 값은 같습니다.");
		}
	}
}
