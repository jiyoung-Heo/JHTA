package day05.array;

import java.util.Scanner;

/*
 * 3명학생의 학생번호 이름 전화번호 주소를 입력받아 출력해 보세요.
 * 2차원 배열 사용
 */
public class Test14_Quiz {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[][] save = new String[3][4];
		for (int i = 0; i < save.length; i++) {
			System.out.println((i + 1) + "번 학생의 학생번호, 이름, 전화번호, 주소를 입력하세요");
			for (int j = 0; j < save[i].length; j++) {
				save[i][j] = sc.next();
			}
		}
		System.out.println("[학생정보]");
		for (int i = 0; i < save.length; i++) {
			for (int j = 0; j < save[i].length; j++) {
				System.out.print(save[i][j] + "	");
			}
			System.out.println();
		}
	}
}
