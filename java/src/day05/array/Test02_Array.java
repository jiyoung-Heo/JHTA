package day05.array;

import java.util.Scanner;

/*
 * 학생 10명의 점수를 입력받아 배열에 저장하고 가장 높은 점수와 낮은 점수 출력하기
 */
public class Test02_Array {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] grade = new int[10];
		for (int i = 0; i < 10; i++) {
			System.out.print((i + 1) + "번 학생의 점수를 입력하세요: ");
			grade[i] = sc.nextInt();
		}
		for (int i = 0; i < 10; i++) {
			System.out.print(grade[i] + " ");
		}
		System.out.println();
		int result = 0;

		for (int i = 0; i < 10; i++) {
			if (grade[i] > result) {
				result = grade[i];
			}

		}
		System.out.println("최대값" + result);
		int min = result;
		for (int i = 9; i >= 0; i--) {
			if (grade[i] < min) {
				min = grade[i];
			}
		}
		System.out.println("최소값" + min);
	}
}
