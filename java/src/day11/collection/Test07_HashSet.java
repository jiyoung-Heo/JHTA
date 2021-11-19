package day11.collection;

import java.util.HashSet;
import java.util.Iterator;

/*
 * 					[collection]
 * 						  |
 * 			List---------------------Set
 * 			  |						  |
 * 	 ArrayList,Vector,...		HashSet, TreeSet,...
 * 
 *	List 클래스들의 특징
 *		1. 값을 저장할 때 순서가 있다.
 *		2. 중복된 값을 저장할 수 있다.
 *	Set 클래스들의 특징
 *		1. 값을 저장할 때 순서가 없다.
 *		2. 중복값을 허용하지 않는다.
 */
public class Test07_HashSet {
	public static void main(String[] args) {
		HashSet<String> hs = new HashSet<String>();
		hs.add("진달래");
		hs.add("개나리");
		hs.add("무궁화");
		// public Iterator<E> iterator : Iterator ->요소를 순차적으로 꺼내오는 기능의 객체
		Iterator<String> a = hs.iterator();
		// boolean hasNext(): 다음요소가 있으면 true;
		while (a.hasNext()) {
			// E next(): 다음요소 리턴
			String s = a.next();
			System.out.println(s);
		}
	}
}
