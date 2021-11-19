package day12.collection;

public class Member {
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
		return "아이디:" + id + ",비밀번호:" + pwd;
	}
}
