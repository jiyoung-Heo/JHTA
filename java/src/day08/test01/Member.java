package day08.test01;

public class Member extends User {
	private String name;// ȸ���̸�

	public void setMember(String id, String pwd, String name) {
		this.id = id;
		this.pwd = pwd;
//		setInfo(id,pwd);
		this.name = name;
	}

	public void printInfo() {
		System.out.println("ȸ������");
		System.out.println("���̵�: " + getId());
		System.out.println("��й�ȣ: " + getPwd());
		System.out.println("�̸�: " + name);
	}
}
