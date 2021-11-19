package day11.collection;

import java.util.ArrayList;

/*
 * [ArrayList(***)]
 * - ��ü�� �迭ó�� �����ϱ� ���� Ŭ����, �迭�� ����� �����Ǿ� ������ ArrayList�� ��ü�� ũ�⸸ŭ ����� �����ȴ�.
 * - �ֿ�޼ҵ�
 * 		public boolean add(E e): ��� �߰�
 * 		public E get(int index): index��ġ�� ��Ҹ� ����
 * 		public E remove(int index): index��ġ�� ��Ҹ� ����
 * 		public E set(int index): index��ġ�� ��Ҹ� element��ü�� ����
 * 		public int size(): ArrayList�� ��� ����� ���� ����
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
		System.out.println(o + " ��Ұ� �����Ǿ����");
		// list�� ����� ��Ұ��� ��� �빮�ڷ� ��µǵ��� ��������. String::toUpperCase()
		for (int i = 0; i < list.size(); i++) {
			String el = (String) list.get(i);
			System.out.println(el.toUpperCase());
		}
	}
}
