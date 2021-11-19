package day12.collection;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;

public class Test05_Map {
	public static void main(String[] args) {
		HashMap<Integer, String> hs = new HashMap<Integer, String>();
		hs.put(1, "����1");
		hs.put(2, "����2");
		hs.put(3, "����3");
		// public Collection<v> values(): value������ collection��ü�� ����
		Collection<String> c = hs.values();// value����(�̸�)�� ����غ�����

		Iterator<String> it = c.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		// public Set<K> keySet() -> keyset�޼ҵ带 ����ؼ� Ű������ ��� ����غ�����
		Collection<Integer> ii = hs.keySet();
		Iterator<Integer> in = ii.iterator();
//		while (in.hasNext()) {
//			System.out.println(in.next());
//		}
		while (in.hasNext()) {
			Integer key = in.next();
			String value = hs.get(key);
			System.out.println(key + ": " + value);
		}

	}
}
