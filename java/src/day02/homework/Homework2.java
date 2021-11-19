package day02.homework;

import java.util.Scanner;

//2. 임의의 정수를 입력받아 절대값을 구해보세요.(if문 사용)
//예)
//정수입력 : 10
//결과 10의 절대값 :10
//---------------------
//정수입력 :-10
//결과 -10의 절대값 :10
public class Homework2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("정수를 입력하세요");
		int num = sc.nextInt();
		if (num > 0) {
			System.out.println(num);
		} else if (num < 0) {
			System.out.println(-num);
		} else {
			System.out.println("0입니다");
		}

	}
}