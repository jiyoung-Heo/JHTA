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
		System.out.println("���̵�: " + id);
		System.out.println("��й�ȣ: " + pwd);
		System.out.println("���: " + grade);
	}
}
