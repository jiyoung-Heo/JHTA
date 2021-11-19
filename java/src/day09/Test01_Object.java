package day09;

class Member {
	private String id;
	private String pwd;

	public Member(String id, String pwd) {
		this.id = id;
		this.pwd = pwd;
	}

	public String getId() {
		return id;
	}

	public String getPwd() {
		return pwd;
	}

	@Override
	public String toString() {
		return id.toString() + " " + pwd.toString();
	}

	@Override
	public boolean equals(Object obj) {
		boolean b = false;
		Member m4 = (Member) obj;
		if (id.equals(m4.id) && pwd.equals(m4.pwd)) {
			b = true;
		}
		return b;
	}
}

public class Test01_Object {
	public static void main(String[] args) {
		// 멤버객체 생성해서 값 저장 후 출력되도록 해보세요.
		Member m3 = new Member("aaa", "111");
		Member m4 = new Member("aaa", "111");
		if (m3.equals(m4)) {
			System.out.println("같은 회원입니다.");
		} else {
			System.out.println("다른 회원입니다.");
		}
//		Member mb = new Member("user", "1234");
//		System.out.println(mb.getId() + " " + mb.getPwd());
//		int a = mb.hashCode();
//		System.out.println(a);

//		String m = mb.toString();
//		System.out.println(m);

//		String c = "hello";
//		String d = c.toString();
//		System.out.println(d);// 클래스명@hashcode값

//		Date e = new Date();
//		System.out.println(e.toString());
//		Member m1 = new Member("aaa", "1111");
//		Member m2 = new Member("aaa", "1111");
//		Member m2 = m1;
//		boolean f = m1.equals(m2);
//		if (f) {
//			System.out.println("두객체는 같아요");
//		} else {
//			System.out.println("두객체는 달라요");
//		}
//		String s1 = new String("hello");
//		String s2 = new String("hello");
//		if (s1.equals(s2)) {
//			System.out.println("두 문자열은 같아요");
//		} else {
//			System.out.println("두 문자열은 달라요");
//		}
	}
}
