package day11.collection;

import java.util.ArrayList;

import day11.test.Member;

/*
 * [���׸�(Generic)]
 * - �ڷᱸ������ Ŭ����(ArrayList,Vector,...)�� Ư��Ŭ����Ÿ�Ը� ������ �� �ֵ��� �����Ѱ�
 * - �÷���Ŭ������ �Ǽ��� �ٸ� Ŭ����Ÿ���� ������� �����ϱ� ���� �����
 * - ����ȿ�Ҹ� �����ö� ����ȯ ���� �ʾƵ� �ȴ�.
 * - ����)
 *   Ŭ������<������ Ŭ����Ÿ��> ��ü�� = new Ŭ������<������ Ŭ����Ÿ��>();
 */
public class Test04_Generic {
	public static void main(String[] args) {
//		ArrayList<String> list = new ArrayList<String>();// ArrayList���� String ��ü���� ������ �� ����
//		list.add("java");
//		list.add("jsp");
//		list.add("html");
////		list.add(new Integer("100")); // ���׸��� ���ָ� ������ �� ������ �߻��Ѵ�. ����غ����ʾƵ� ������ �߻�
//		for (int i = 0; i < list.size(); i++) {
//			String o =  list.get(i);//���׸��� ����ϸ� ��������ȯ���� ����� �� �ִ�.
//			System.out.println(o);
//		}
		// ArrayList�� Member��ü�� 3�� ��� ��ü�����͸� ����غ�����
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
