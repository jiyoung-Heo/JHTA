package day05.array;

import java.util.Scanner;

/*
 * 회원아이디를 입력받아 비밀번호를 출력하는 프로그램 만들기
 * 예)
 * 회원아이디입력:admin
 * [admin]님의 비밀번호는 [1234]입니다.
 * 또는
 * 회원아이디입력:abcd
 * 해당 아이디가 존재하지 않습니다.
 */
public class Test13_Quiz {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[][] users = { { "admin", "1234" }, { "test", "0000" }, { "hello", "1004" } };
		String id = "";
		int cnt = 0;
		System.out.print("아이디를 입력하세요: ");
		id = sc.next();
		for (int i = 0; i < users.length; i++) {
			if (users[i][0].equals(id)) {
				System.out.println("[" + id + "]님의 비밀번호는 " + users[i][1] + "입니다.");
				cnt = 1;
				break;
			}
		}
		if (cnt == 0) {
			System.out.println("해당 아이디가 존재하지 않습니다.");
		}

	}
}
