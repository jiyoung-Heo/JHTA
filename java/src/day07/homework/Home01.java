package day07.homework;

//문제1)
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
//위와 같은 클래스가 있다. 
//- 위의 클래스에 멤버변수값 모두를 출력하는 메소드를 추가해 보세요. 
//- User클래스에 매개변수 3개를 전달받아 멤버변수에 값을 
//초기화하는 생성자를 만들고 디폴트생성자도 만들어보세요 

public class Home01 {
	public static void main(String[] args) {
		User us = new User("id", "pwd", "gyoung06@naver.com");
//		us.setData("id", "pwd", "gyoung06@naver.com");
		us.show();
	}
}
