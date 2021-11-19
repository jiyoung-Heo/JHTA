package day11.test;

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
		return id + " " + pwd;
	}
}
