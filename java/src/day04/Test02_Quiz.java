package day04;

import java.util.Scanner;

/*
 * 1. 1부터 100까지 수중 3의 배수 출력하고 3의 배수합 구하기
 * 
 * 2. 단 입력받아 해당 구구단 출력하기
 * -->while문 사용
 */
public class Test02_Quiz {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = 1;
		int sum = 0;
		while (a <= 100) {
			if (a % 3 == 0) {
				System.out.print(a);
				sum += a;
			}
			a++;
		}
		System.out.println("\n3의 배수합" + sum);
		System.out.println("============");
		System.out.println("단을 입력하세요");
		int num = sc.nextInt();
		int cnt = 1;
		while (cnt < 10) {
			int result = num * cnt;
			System.out.println(num + "*" + cnt + "=" + result);
			cnt++;
		}
	}
}
