package day11.collection;

import java.util.ArrayList;

/*
 * [ArrayList(***)]
 * - 객체를 배열처럼 관리하기 위한 클래스, 배열은 사이즈가 고정되어 있지만 ArrayList는 객체의 크기만큼 사이즈가 조절된다.
 * - 주요메소드
 * 		public boolean add(E e): 요소 추가
 * 		public E get(int index): index위치의 요소를 리턴
 * 		public E remove(int index): index위치의 요소를 삭제
 * 		public E set(int index): index위치의 요소를 element객체로 변경
 * 		public int size(): ArrayList에 담긴 요소의 개수 리턴
 */
public class Test01_ArrayList {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		// public boolean add(Object e)
		list.add("java");
		list.add("jsp");
		list.add("SpringFramework");
		// public E get(int index)
//		Object e = list.get(1);
//		System.out.println(e);
		Object o = list.remove(0);
		System.out.println(o + " 요소가 삭제되었어요");
		// list에 저장된 요소값을 모두 대문자로 출력되도록 새보세요. String::toUpperCase()
		for (int i = 0; i < list.size(); i++) {
			String el = (String) list.get(i);
			System.out.println(el.toUpperCase());
		}
	}
}
