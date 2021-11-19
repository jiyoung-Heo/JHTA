package day17.java8;

import java.util.ArrayList;
import java.util.stream.Stream;

/*
 * 회원아이디, 이름, 이메일정보를 갖는 클래스를 만드세요(comparable인터페이스 오버라이딩, 아이디를 기준으로 오름차순 정렬하기)
 * 
 * ArrayList에 회원정보를 담고 stream을 사용해서 출력해보세요.
 * 
 * ArrayList에 회원정보를 담고 Stream을 사용해서 이름을 기준으로 오름차순 정렬해서 출력하세요.
 */
public class Test06_Quiz {
	public static void main(String[] args) {
		ArrayList<Member> list = new ArrayList<>();
		list.add(new Member("admin", "홍길동", "a.naver.com"));
		list.add(new Member("zest", "김안녕", "b.naver.com"));
		list.add(new Member("togo", "지지지", "c.naver.com"));

		Stream<Member> st = list.stream();
		System.out.println("<<ArrayList에 회원정보를 담고 stream을 사용해서 출력(아이디기준 오름차순)>>");
		st.sorted().forEach(s -> System.out.println(s));

		Stream<Member> st1 = list.stream();
		System.out.println("<<이름을 기준으로 오름차순 정렬>>");
		st1.sorted((Member o1, Member o2) -> o1.getName().compareTo(o2.getName())).forEach(s -> System.out.println(s));
	}
}

class Member implements Comparable<Member> {
	private String id;
	private String name;
	private String email;

	public Member(String id, String name, String email) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
	}

	public String getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getEmail() {
		return email;
	}

	@Override
	public String toString() {
		return "아이디: " + id + ", 이름: " + name + ", 이메일: " + email;
	}

	@Override
	public int compareTo(Member o) {
		return id.compareTo(o.getId());
	}
}