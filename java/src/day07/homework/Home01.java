package day07.homework;

//����1)
class User {
	private String id;
	private String pwd;
	private String email;

	public User(String id, String pwd, String email) {
		this.id = id;
		this.pwd = pwd;
		this.email = email;
	}

	public void setData(String id, String pwd, String email) {
		this.id = id;
		this.pwd = pwd;
		this.email = email;
	}

	public String getId() {
		return id;
	}

	public String getPwd() {
		return pwd;
	}

	public String getEmail() {
		return email;
	}

	public void show() {
		System.out.println(id + " " + pwd + " " + email);
	}
}
//���� ���� Ŭ������ �ִ�. 
//- ���� Ŭ������ ��������� ��θ� ����ϴ� �޼ҵ带 �߰��� ������. 
//- UserŬ������ �Ű����� 3���� ���޹޾� ��������� ���� 
//�ʱ�ȭ�ϴ� �����ڸ� ����� ����Ʈ�����ڵ� �������� 

public class Home01 {
	public static void main(String[] args) {
		User us = new User("id", "pwd", "gyoung06@naver.com");
//		us.setData("id", "pwd", "gyoung06@naver.com");
		us.show();
	}
}
