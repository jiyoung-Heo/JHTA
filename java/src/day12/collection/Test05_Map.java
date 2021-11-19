package day12.collection;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;

public class Test05_Map {
	public static void main(String[] args) {
		HashMap<Integer, String> hs = new HashMap<Integer, String>();
		hs.put(1, "하이1");
		hs.put(2, "하이2");
		hs.put(3, "하이3");
		// public Collection<v> values(): value값들을 collection객체로 리턴
		Collection<String> c = hs.values();// value값들(이름)을 출력해보세요

		Iterator<String> it = c.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		// public Set<K> keySet() -> keyset메소드를 사용해서 키값들을 모두 출력해보세요
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
