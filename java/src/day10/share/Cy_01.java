package day10.share;

import java.util.Scanner;

public class Cy_01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);// 스캐너 자료 입력
		String[] tall = new String[5];// 스트링 배열로 5개의 값을 저장
		double tot = 0;// 총점수를 더할 객체

		for (int i = 0; i < tall.length; i++) {// for문을 통해 tall[]의 값을 넣어줌.
			System.out.println("신장 입력 : ");
			tall[i] = sc.next();
			double tall1 = Double.parseDouble(tall[i]);// String을 더블로 바꿔주고
			tot += tall1;// 그 바꿔준 것을 더해줌

		}
		System.out.println();// 줄바꿈
		System.out.println("평균 :" + Math.round(tot / tall.length));// round 함수 + 객체의 숫자만큼 나눠주고 출력

	}
}