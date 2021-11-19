package day05.array;

import java.util.Scanner;

/*
 * [배열]
 * - 같은 자료형의 변수가 여러개 필요한 경우 연속적인 공간에 데이터를 나열하여 저장하는 자료구조
 * 1) 1차원배열
 * - 첨자가 하나인 배열
 * 형식)
 * 자료형[] 배열명 =new 자료형[배열크기]
 */
public class Test01_Array {
	public static void main(String[] args) {
//		int[] a = new int[3];
//		a[0] = 100;
//		a[1] = 50;
//		a[2] = 80;
//		for (int i = 0; i < 3; i++) {
//			System.out.println(a[i]);
//		}
//		int[] aa = { 100, 50, 80 };
//		for (int i = 0; i < 3; i++) {
//			System.out.println(a[i]);
//		}
		Scanner sc = new Scanner(System.in);
		int[] a = new int[5];
		int tot = 0;
		for (int i = 0; i < 5; i++) {
			System.out.println((i + 1) + "번째 학생 점수 입력");
			a[i] = sc.nextInt();
			tot += a[i];
		}
		double ave = tot / 5.0;
		System.out.println("<<입력된학생점수>>");
		for (int i = 0; i < 5; i++) {
			System.out.println(a[i] + " ");
		}
		System.out.println();
		System.out.print("전체총점: " + tot);
		System.out.print("전체평균: " + ave);
	}
}
