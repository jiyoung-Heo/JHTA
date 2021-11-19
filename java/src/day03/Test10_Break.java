package day03;

import java.util.Scanner;

public class Test10_Break {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		for (int i = 1; i <= 3; i++) {
			System.out.println(i + "번째 시도입니다.");
			System.out.print("아이디 입력: ");
			String id = sc.next();
			System.out.print("비밀번호 입력: ");
			String pw = sc.next();
			if (id.equals("user") && pw.equals("1234")) {
				System.out.println(id + "회원님 환영합니다");
				break;
			} else {
				System.out.println("아이디 또는 비밀번호가 맞지 않아요. 시도가능한 횟수가" + (3 - i) + "번 남았습니다.");
			}

		}
	}
}
