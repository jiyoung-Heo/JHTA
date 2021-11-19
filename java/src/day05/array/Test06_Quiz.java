package day05.array;

import java.util.Scanner;

/*
 * 아이디를 입력받아 사용가능한 아이디인지 아닌지 출력해 보세요
 * 기존의 사용중인 아이디는 아래와 같이 저장되어 있음
 * String[] ids = {"test","user1","admin","hello1"}
 * 
 * 예)
 * 사용할 아이디 입력: user1
 * user1은 사용중인 아이디입니다.
 * 사용할 아이디입력: java12
 * java12는 사용가능한 아이디입니다.
 */
public class Test06_Quiz {
	public static void main(String[] args) {
		String[] ids = { "test", "user1", "admin", "hello1" };
		Scanner sc = new Scanner(System.in);
		System.out.print("사용할 아이디 입력: ");
		String id = sc.next();
		boolean result = false;
		for (int i = 0; i < ids.length; i++) {
			if (ids[i].equals(id)) {
				System.out.println(id + "는 사용중인 아이디입니다.");
				result = true;
				break;
			}
		}
		if (!result) {
			System.out.println("사용가능한 아이디입니다.");
		}
		result = false;
	}
}
