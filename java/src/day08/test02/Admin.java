package day08.test02;

import day08.test01.User;

public class Admin extends User {
	private String grade;

	public void setAdminInfo(String id, String pwd, String grade) {
		this.id = id;
		this.pwd = pwd;
		this.grade = grade;
	}

	public void printAdminInfo() {
		System.out.println("아이디: " + id);
		System.out.println("비밀번호: " + pwd);
		System.out.println("등급: " + grade);
	}
}
