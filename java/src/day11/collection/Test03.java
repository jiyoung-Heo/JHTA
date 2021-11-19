package day11.collection;

import java.util.ArrayList;

import day11.test.Member;

public class Test03 {
	public static void main(String[] args) {
		// Member객체 3개를 생성하고 ArrayList에 저장되도록 해보세요
		Member mb = new Member("user", "1234");
		Member mb2 = new Member("hi", "0000");
//		Member mb3 = new Member("you", "1010");
		ArrayList list = new ArrayList();
		list.add(mb);
		list.add(mb2);
		list.add(new Member("you", "1010"));
//		list.add(mb.getId());
//		list.add(mb.getPwd());
//		list.add(mb2.getId());
//		list.add(mb2.getPwd());
//		list.add(mb3.getId());
//		list.add(mb3.getPwd());
		for (int i = 0; i < list.size(); i++) {
//			Member result = (Member) list.get(i);
//			System.out.println(result.getId() + result.getPwd());
			Object m = list.get(i);
			System.out.println(m.toString());
//			System.out.println(list.get(i).toString());
		}
		System.out.println(list.toString());
	}
}
