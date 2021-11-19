package day13.exception;

import java.util.Scanner;

public class Test05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("나이입력");
		String age = sc.next();
		try {
			int iAge = Integer.parseInt(age);
			System.out.println("입력된 나이: " + iAge);
		} catch (NumberFormatException e) {
			System.out.println("나이를 숫자로 입력해주세요");
			System.out.println("오류메세지: " + e.getMessage());
		}
		// public static int parseInt(String s) throws NumberFormatException
	}
}
