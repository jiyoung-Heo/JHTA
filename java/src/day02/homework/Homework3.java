package day02.homework;

import java.util.Scanner;

//3. 아이디와 비밀번호를 입력받고 아이디와 비밀번호가 일치하는지 검사해 보세요.(아이디와 비밀번호는
// 임의의 값과 비교합니다.)
public class Homework3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("아이디를 입력하세요");
		String id = sc.next();
		System.out.println("비밀번호를 입력하세요");
		String pw = sc.next();
		if (id.equals("admin") && pw.equals("0000")) {
			System.out.println("로그인완료");
		} else {
			System.out.println("로그인 불가");
		}
	}
}