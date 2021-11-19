package day12.collection;

import java.util.HashMap;
import java.util.Scanner;

/*
 * 회원아이디를 key로 회원이름을 value로 저장하는 hashmap 생성하고 데이터 저장하기
 * 1. 회원아이디로 회원이 조회
 * 2. 회원아이디로 회원이 삭제
 */
public class Test04_Quiz {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		HashMap<String, String> hm = new HashMap<String, String>();
		hm.put("admin", "회원이");
		hm.put("a", "회원1");
		hm.put("b", "회원2");
		System.out.println("조회할 회원아이디");
		String find = sc.next();
		String name = hm.get(find);
		if (name != null) {
			System.out.println("회원이름: " + name);
		} else {
			System.out.println("아이디가 존재하지 않아요");
		}
		System.out.println("삭제할 회원 아이디");
		String delete = sc.next();
		String s = hm.remove(delete);
		System.out.println(s + "회원 삭제!");
		System.out.println("전체 회원 목록");
		System.out.println(hm.entrySet());
//		for (int i = 0; i < hm.size(); i++) {
//		}

	}
}
