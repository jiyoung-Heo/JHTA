package day07;

public class Test04_this {
	public static void main(String[] args) {
		// Member객체를 생성후 아이디와 비밀번호를 저장하고 해당 정보가 출력되도록 해보세요.
		Member mb1 = new Member("admin", "1234");
		System.out.println(mb1.getId());
		System.out.println(mb1.getPwd());
		mb1 = new Member("cc", "0101");
		Member mb2 = new Member("test", "0000");
		System.out.println(mb2.getId());
		System.out.println(mb2.getPwd());
		mb2.show();
		new Member("go", "12344").show();
		Member mb3 = mb2;
		mb3.show();
		print(mb1);

	}

	private static void print(Member a) {
		a.show();
	}
}

class Member {
	private String id;
	private String pwd;

	public Member(String id, String pwd) {
		this.id = id;
		this.pwd = pwd;
	}

	public void show() {
		System.out.println("id: " + id);
		System.out.println("pw: " + pwd);
	}

	public String getId() {
		return id;
	}

	public String getPwd() {
		return pwd;
	}
}
