package day05.array;

import java.util.Scanner;

/*
 * 다섯명의 번호, 국어, 영어점수를 입력받아 총점 평균 구해서 출력하기
 */
public class Test09_Array {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[][] arr = new int[5][5];
		System.out.println("입력하세요");
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < 3; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		for (int i = 0; i < arr.length; i++) {
			for (int j = 1; j < 3; j++) {
				arr[i][3] += arr[i][j];
			}
			arr[i][4] = arr[i][3] / 2;
			System.out.println(i + "학생의 총점: " + arr[i][3]);
			System.out.println(i + "학생의 평균: " + arr[i][4]);
		}
	}
}
