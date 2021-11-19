package day12.collection;

import java.util.HashSet;
import java.util.Iterator;

public class Test01 {
	public static void main(String[] args) {
		Member m1 = new Member("test", "1234");
		Member m2 = new Member("aaa", "0000");
		HashSet<Member> hs = new HashSet<Member>();
		hs.add(m1);
		hs.add(m2);
		// hs에담긴 Member정보를 모두 출력해보세요
		Iterator<Member> it = hs.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}
}
