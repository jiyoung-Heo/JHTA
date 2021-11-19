package day11.collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

/*
 * 3명 회원의 아이디를 입력받아 HashSet에 저장하고 전체 아이디를 출력해보세요.
 */
public class Test08_Quiz {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		HashSet<String> hs = new HashSet<String>();
		System.out.println("아이디를 입력하세요");
		hs.add(sc.next());
		hs.add(sc.next());
		hs.add(sc.next());
		Iterator<String> it = hs.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}

	}
}
