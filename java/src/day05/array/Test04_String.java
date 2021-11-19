package day05.array;

import java.util.Scanner;

/*
 * String 배열
 * 다섯명 이름 입력받아 배열에 저장하고 출력하기
 */
public class Test04_String {
	public static void main(String[] args) {
		String[] arr = new String[5];
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < arr.length; i++) {
			System.out.println((i + 1) + "번째 학생이름 입력");
			arr[i] = sc.next();
		}
		System.out.println("입력된학생이름");
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}

	}
}
