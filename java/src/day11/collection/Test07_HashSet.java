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
 *	List Ŭ�������� Ư¡
 *		1. ���� ������ �� ������ �ִ�.
 *		2. �ߺ��� ���� ������ �� �ִ�.
 *	Set Ŭ�������� Ư¡
 *		1. ���� ������ �� ������ ����.
 *		2. �ߺ����� ������� �ʴ´�.
 */
public class Test07_HashSet {
	public static void main(String[] args) {
		HashSet<String> hs = new HashSet<String>();
		hs.add("���޷�");
		hs.add("������");
		hs.add("����ȭ");
		// public Iterator<E> iterator : Iterator ->��Ҹ� ���������� �������� ����� ��ü
		Iterator<String> a = hs.iterator();
		// boolean hasNext(): ������Ұ� ������ true;
		while (a.hasNext()) {
			// E next(): ������� ����
			String s = a.next();
			System.out.println(s);
		}
	}
}
