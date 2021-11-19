package day12.collection;

import java.util.ArrayList;
import java.util.Vector;

/*
 * ArrayList(Collection<? extends E> c)
 * 
 * -Collection<? extends E>c: EŸ���� ��ü�� ���� Collection��ü�̰ų� EŸ���� �ڽİ�ü�� ���� Collection��ü
 * -Collection<? super E> c: EŸ���� ��ü�� ���� Collection��ü�̰ų� EŸ���� �θ�ü�� ���� Collection��ü
 */
class AA {
	private int a;

	public AA(int a) {
		this.a = a;
	}

	public int getA() {
		return a;
	}
}

class BB extends AA {
	private int b;

	public BB(int a, int b) {
		super(a);
		this.b = b;
	}

	public int getB() {
		return b;
	}

}

public class Test09_Generic {
	public static void main(String[] args) {
		ArrayList<BB> list1 = new ArrayList<BB>();
		list1.add(new BB(1, 2));
		list1.add(new BB(10, 20));
		list1.add(new BB(100, 200));
		// ArrayList(collection<? extends E> c);
		ArrayList<BB> list2 = new ArrayList<BB>(list1);
		list2.add(new BB(3, 4));
		for (BB b : list2) {
			System.out.println(b.getA() + "," + b.getB());
		}
		System.out.println("==========");
		// ArrayList(collection<? extends E> c);
		ArrayList<AA> list3 = new ArrayList<AA>(list1);
		list3.add(new AA(5));
		// BB��ü�� ��� b���� ��µǵ��� �غ�����.
		for (AA aa : list3) {
			if (aa instanceof BB) {
				BB b = (BB) aa;
				System.out.println("a: " + b.getA() + " b: " + b.getB());
			} else {
				System.out.println(aa.getA());
			}
		}
		System.out.println("======");
		Vector<String> vec = new Vector<String>();
		vec.add("����ȭ");
		vec.add("�ε鷹");
		// ArrayList(collection<? extends E> c);
		ArrayList<String> list4 = new ArrayList<String>(vec);
		list4.add("������");
		list4.add("���޷�");
		for (String s : list4) {
			System.out.println(s);
		}
	}
}
