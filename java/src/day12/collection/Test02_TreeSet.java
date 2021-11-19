package day12.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.TreeSet;

public class Test02_TreeSet {
	public static void main(String[] args) {
		TreeSet<String> ts = new TreeSet<String>();
		ts.add("������1");
		ts.add("������2");
		ts.add("������3");
		Iterator<String> it = ts.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		ArrayList<String> list = new ArrayList<String>();
		list.add("ȣ1");
		list.add("ȣ2");
		list.add("ȣ3");
		Iterator<String> ito = list.iterator();
		while (ito.hasNext()) {
			System.out.println(ito.next());
		}
	}
}
