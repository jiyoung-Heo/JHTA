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
		// �����ü �����ؼ� �� ���� �� ��µǵ��� �غ�����.
		Member m3 = new Member("aaa", "111");
		Member m4 = new Member("aaa", "111");
		if (m3.equals(m4)) {
			System.out.println("���� ȸ���Դϴ�.");
		} else {
			System.out.println("�ٸ� ȸ���Դϴ�.");
		}
//		Member mb = new Member("user", "1234");
//		System.out.println(mb.getId() + " " + mb.getPwd());
//		int a = mb.hashCode();
//		System.out.println(a);

//		String m = mb.toString();
//		System.out.println(m);

//		String c = "hello";
//		String d = c.toString();
//		System.out.println(d);// Ŭ������@hashcode��

//		Date e = new Date();
//		System.out.println(e.toString());
//		Member m1 = new Member("aaa", "1111");
//		Member m2 = new Member("aaa", "1111");
//		Member m2 = m1;
//		boolean f = m1.equals(m2);
//		if (f) {
//			System.out.println("�ΰ�ü�� ���ƿ�");
//		} else {
//			System.out.println("�ΰ�ü�� �޶��");
//		}
//		String s1 = new String("hello");
//		String s2 = new String("hello");
//		if (s1.equals(s2)) {
//			System.out.println("�� ���ڿ��� ���ƿ�");
//		} else {
//			System.out.println("�� ���ڿ��� �޶��");
//		}
	}
}
