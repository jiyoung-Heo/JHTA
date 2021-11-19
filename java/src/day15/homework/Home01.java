package day15.homework;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

//1. 회원의 아이디,비밀번호,이메일정보를 갖는 클래스를 만들고
//파일에 저장하기.(여러명 저장)

public class Home01 {
	public static void main(String[] args) {
		// 새로운 파일클래스를 만들어준다.
		File f = new File("D:\\hta_JAVA\\bb\\hi.txt");
		// PrintWriter를 초기화해준다.
		PrintWriter br = null;
		// person객체를 생성해준다.
		Person p = new Person("iidd", "pass", "dodo");
		Person p2 = new Person("iid", "pas", "dod");
		Person p3 = new Person("ii", "pa", "do");

		try {
			// f의 절대경로에 접근하는 PrintWriter 객체 br을 만들어준다.
			br = new PrintWriter(f.getAbsolutePath());
			// person객체의 getId, getPwd, getEmail을 이용해 파일에 저장해준다.
			br.println("아이디: " + p.getId() + " 비밀번호: " + p.getPwd() + " 이메일: " + p.getEmail());
			br.println("아이디: " + p2.getId() + " 비밀번호: " + p2.getPwd() + " 이메일: " + p2.getEmail());
			br.println("아이디: " + p3.getId() + " 비밀번호: " + p3.getPwd() + " 이메일: " + p3.getEmail());
			System.out.println("저장완료되었습니다.");
			br.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}

//Person 클래스객체
class Person {
	private String id;
	private String pwd;
	private String email;

	public Person(String id, String pwd, String email) {
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
}