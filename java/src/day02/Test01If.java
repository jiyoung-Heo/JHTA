package day02;

/*
 * [조건제어문]
 * - 조건에 따라 문장을 선택적으로 수행한다.
 * 1. if문
 * 	형식)
 * 	if(조건식){
 * 		조건이 참일때 실행할 문장;
 * 		..
 * 	}
 * 
 * 2. if~else 문
 * 	형식)
 * 	if(조건식){
 * 		조건이 참일때 수행할 문장;
 * 		..
 * 	}else{
 * 		조건이 거짓일때 수행할 문장;
 * 	}
 */
import java.util.Scanner;

public class Test01If {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("점수입력");
		int score = sc.nextInt();
//		String result = "";
//		if (score >= 80) {
//			result = "합격";
//		} else {
//			result = "불합격";
//		}
//		System.out.println(result);
		String result = "불합격";
		if (score >= 80) {
			result = "합격";
		}
		System.out.println(result);
	}
}
