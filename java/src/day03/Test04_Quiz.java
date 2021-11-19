package day03;

import java.util.Scanner;

/*
 * [단 입력받아 구구단 출력하기]
 * 예)
 * 단입력
 * 3
 * 
 * 3단
 * 3*1=3
 * ...
 * 3*9=27
 */
public class Test04_Quiz {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("단을 입력하세요: ");
		int dan = sc.nextInt();
		System.out.println();
		System.out.println(dan + "단");
		for (int i = 1; i <= 9; i++) {
			System.out.println(dan + "*" + i + "=" + dan * i);
		}
	}
}
