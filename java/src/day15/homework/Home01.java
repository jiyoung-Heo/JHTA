package day15.homework;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

//1. ȸ���� ���̵�,��й�ȣ,�̸��������� ���� Ŭ������ �����
//���Ͽ� �����ϱ�.(������ ����)

public class Home01 {
	public static void main(String[] args) {
		// ���ο� ����Ŭ������ ������ش�.
		File f = new File("D:\\hta_JAVA\\bb\\hi.txt");
		// PrintWriter�� �ʱ�ȭ���ش�.
		PrintWriter br = null;
		// person��ü�� �������ش�.
		Person p = new Person("iidd", "pass", "dodo");
		Person p2 = new Person("iid", "pas", "dod");
		Person p3 = new Person("ii", "pa", "do");

		try {
			// f�� �����ο� �����ϴ� PrintWriter ��ü br�� ������ش�.
			br = new PrintWriter(f.getAbsolutePath());
			// person��ü�� getId, getPwd, getEmail�� �̿��� ���Ͽ� �������ش�.
			br.println("���̵�: " + p.getId() + " ��й�ȣ: " + p.getPwd() + " �̸���: " + p.getEmail());
			br.println("���̵�: " + p2.getId() + " ��й�ȣ: " + p2.getPwd() + " �̸���: " + p2.getEmail());
			br.println("���̵�: " + p3.getId() + " ��й�ȣ: " + p3.getPwd() + " �̸���: " + p3.getEmail());
			System.out.println("����Ϸ�Ǿ����ϴ�.");
			br.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}

//Person Ŭ������ü
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