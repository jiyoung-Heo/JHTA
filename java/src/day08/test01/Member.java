package day08.test01;

public class Member extends User {
	private String name;// 회원이름

	public void setMember(String id, String pwd, String name) {
		this.id = id;
		this.pwd = pwd;
//		setInfo(id,pwd);
		this.name = name;
	}

	public void printInfo() {
		System.out.println("회원정보");
		System.out.println("아이디: " + getId());
		System.out.println("비밀번호: " + getPwd());
		System.out.println("이름: " + name);
	}
}
