package day12.collection;

import java.util.ArrayList;
import java.util.Vector;

/*
 * ArrayList(Collection<? extends E> c)
 * 
 * -Collection<? extends E>c: E타입의 객체를 담은 Collection객체이거나 E타입의 자식객체를 담은 Collection객체
 * -Collection<? super E> c: E타입의 객체를 담은 Collection객체이거나 E타입의 부모객체를 담은 Collection객체
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
		// BB객체인 경우 b값도 출력되도록 해보세요.
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
		vec.add("무궁화");
		vec.add("민들레");
		// ArrayList(collection<? extends E> c);
		ArrayList<String> list4 = new ArrayList<String>(vec);
		list4.add("개나리");
		list4.add("진달래");
		for (String s : list4) {
			System.out.println(s);
		}
	}
}
