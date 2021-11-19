package day12.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.TreeSet;

public class Test02_TreeSet {
	public static void main(String[] args) {
		TreeSet<String> ts = new TreeSet<String>();
		ts.add("허지영1");
		ts.add("허지영2");
		ts.add("허지영3");
		Iterator<String> it = ts.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		ArrayList<String> list = new ArrayList<String>();
		list.add("호1");
		list.add("호2");
		list.add("호3");
		Iterator<String> ito = list.iterator();
		while (ito.hasNext()) {
			System.out.println(ito.next());
		}
	}
}
