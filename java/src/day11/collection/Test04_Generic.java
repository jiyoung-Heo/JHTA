package day11.collection;

import java.util.ArrayList;

import day11.test.Member;

/*
 * [제네릭(Generic)]
 * - 자료구조관련 클래스(ArrayList,Vector,...)에 특정클래스타입만 저장할 수 있도록 설정한것
 * - 컬렉션클래스에 실수로 다른 클래스타입이 저장됨을 방지하기 위해 사용함
 * - 저장된요소를 꺼내올때 형변환 하지 않아도 된다.
 * - 형식)
 *   클래스명<저장할 클래스타입> 객체명 = new 클래스명<저장할 클래스타입>();
 */
public class Test04_Generic {
	public static void main(String[] args) {
//		ArrayList<String> list = new ArrayList<String>();// ArrayList에는 String 객체만을 저장할 수 있음
//		list.add("java");
//		list.add("jsp");
//		list.add("html");
////		list.add(new Integer("100")); // 제네릭을 써주면 컴파일 시 에러가 발생한다. 출력해보지않아도 에러가 발생
//		for (int i = 0; i < list.size(); i++) {
//			String o =  list.get(i);//제네릭을 사용하면 강제형변환없이 사용할 수 있다.
//			System.out.println(o);
//		}
		// ArrayList에 Member객체를 3개 담고 전체데이터를 출력해보세요
		Member mb = new Member("user", "1234");
		Member mb1 = new Member("hi", "0000");
		Member mb2 = new Member("you", "1010");
		ArrayList<Member> list = new ArrayList<Member>();
		list.add(mb);
		list.add(mb1);
		list.add(mb2);
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i).getId() + " " + list.get(i).getPwd());
		}
	}
}
