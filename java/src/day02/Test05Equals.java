package day02;

import java.util.Scanner;

public class Test05Equals {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("아이디입력");
		String id = sc.next();
		if (!id.equals("admin")) {
			System.out.println("관리자만로그인할수있습니다");
			System.out.println("프로그램을 종료합니다");
			return;// 메인메소드 끝내기
		}
		System.out.println("비밀번호입력");
		String pwd = sc.next();
		if (id.equals("admin") && pwd.equals("1234")) {
			System.out.println("관리자로 로그인하셨습니다.");
		} else {
			System.out.println("아이디 또는 비밀번호가 맞지 않습니다.");
		}
	}
}