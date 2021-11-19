package day03.homework;

import java.util.Scanner;

//1. 임의의 수를 입력받아 입력받은 수까지 합을 구해 보세요.
//예)임의의 수 입력:50
//[결과]1부터 50까지의 합:XX
public class Homework01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("정수를 입력하세요");
		int num = sc.nextInt();
		int sum = 0;
		System.out.println("[결과]");
		for (int i = 1; i <= num; i++) {
			sum += i;
		}
		System.out.println("1부터 " + num + "까지의 합: " + sum);
	}
}
