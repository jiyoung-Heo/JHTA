package day12.collection;

import java.util.HashMap;
import java.util.Scanner;

public class Test06_Map {
	public static void main(String[] args) {
		Member m1 = new Member("test1", "1234");
		Member m2 = new Member("test2", "1234");
		Member m3 = new Member("test3", "1234");
		HashMap<String, Member> map = new HashMap<>();
		map.put(m1.getId(), m1);
		map.put(m2.getId(), m2);
		map.put(m3.getId(), m3);
		Scanner sc = new Scanner(System.in);
		System.out.println("조회할 회원아이디 입력");
		String id = sc.next();
		Member m = map.get(id);
		if (m != null) {
			System.out.println("조회된 회원 아이디");
			System.out.println(m);
		} else {
			System.out.println("아이디가 없습니다.");
		}
	}
}
