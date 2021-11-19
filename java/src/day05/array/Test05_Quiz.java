package day05.array;

import java.util.Scanner;

/*
 * 학생 답안을 입력받아 학생의 점수를 출력해보세요.
 * 정답은 아래와 같습니다.(문제 1개당 10점)
 * 예)
 * 학생답안 10개 입력
 * 1번답입력:1
 * 2번답입력:3
 * ...
 * 학생점수:xxx
 */
public class Test05_Quiz {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] a = { 1, 2, 3, 4, 1, 2, 3, 4, 1, 2 };
		int score = 0;
		int[] result = new int[10];
		char[] c = new char[10];
		System.out.println("답안을입력하세요");
		for (int i = 0; i < result.length; i++) {
			System.out.print((i + 1) + "번 답 입력: ");
			result[i] = sc.nextInt();
		}
		for (int i = 0; i < result.length; i++) {
			if (a[i] == result[i]) {
				score += 10;
				c[i] = 'O';
			} else {
				c[i] = 'X';
			}
		}
		for (int i = 0; i < c.length; i++) {
			System.out.print(result[i] + " ");
		}
		System.out.println();
		for (int i = 0; i < c.length; i++) {
			System.out.print(c[i] + " ");
		}
		System.out.println();
		System.out.println("점수: " + score);
	}
}
