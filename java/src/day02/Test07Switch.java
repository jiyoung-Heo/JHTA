package day02;

import java.util.Scanner;

/*
 * [switch문]
 * -일치되는 값을 찾아 선택적으로 문장을 수행
 * - 형식
 *  switch(비교대상){
 *  	case 값1: 실행문장;
 *  		..
 *  		break;
 *  	case 값2: 실행문장;
 *  		..
 *  		break;
 *  	case 값3: 실행문장;
 *  		..
 *  		break;
 *  	default: 일치되는 값이 없을때 실행할 문장;
 *  }
 *  주의: case 절에는 정수/단일문자/문자열만 가능(실수x,조건식x)
 */
public class Test07Switch {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		System.out.println("상품번호 입력");
//		int n = sc.nextInt();
//		switch (n) {
//		case 1:
//			System.out.println("상품: TV");
//			break;
//		case 2:
//			System.out.println("상품: 냉장고");
//			break;
//		case 3:
//			System.out.println("상품: 스마트폰");
//			break;
//		case 4:
//			System.out.println("상품: 노트북");
//			break;
//		default:
//			System.out.println("상품없음");
//		}
//		System.out.println("상품코드 입력");
//		String n = sc.next();
//		switch (n) {
//		case "A":
//		case "a":
//			System.out.println("상품: TV");
//			break;
//		case "B":
//		case "b":
//			System.out.println("상품: 냉장고");
//			break;
//		case "C":
//		case "c":
//			System.out.println("상품: 스마트폰");
//			break;
//		case "D":
//		case "d":
//			System.out.println("상품: 노트북");
//			break;
//		default:
//			System.out.println("상품없음");
//		}
		// 위의 스위치문을 if 문으로 바꿔보세요
		System.out.println("상품코드 입력");
		String n = sc.next();
		if (n.equals("a") || n.equals("A")) {
			System.out.println("상품: TV");
		} else if (n.equals("b") || n.equals("B")) {
			System.out.println("상품: 냉장고");
		} else if (n.equals("c") || n.equals("C")) {
			System.out.println("상품: 스마트폰");
		} else if (n.equals("d") || n.equals("D")) {
			System.out.println("상품: 노트북");
		} else {
			System.out.println("상품없음");
		}

	}
}
