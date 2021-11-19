package day04;

import java.util.Scanner;

/*
 * 아이디와 비밀번호를 입력받아 맞으면 [회원님 환영합니다.]
 * 틀리면[아이디 또는 비밀번호가 맞지 않아요]라고 출력한다.
 * 조건- 입력기회는 3번이고 3번 모두 틀리면 [입력오류!]라고 출력하고 프로그램종료한다.(System.exit(0); 이나 return;)
 */
public class Test05_Quiz {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int chance = 3;
		while (chance > 0) {
			System.out.println("아이디를 입력하세요");
			String id = sc.next();
			System.out.println("비밀번호를 입력하세요");
			String pw = sc.next();
			if (id.equals("user") && pw.equals("1234")) {
				System.out.println("[회원님 환영합니다.]");
			} else {
				System.out.println("[아이디 또는 비밀번호가 맞지 않아요]");
				chance--;
			}
		}
		if (chance == 0) {
			System.out.println("[입력오류, 프로그램 종료]");
			return;
		}
	}
}
