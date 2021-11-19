package day15.test;

import java.io.Serializable;

/*
 * [��ü�� ����ȭ]
 * - ��ü�� ����Ʈ������ �ɰ��� ������ �����ϴ°�
 * - ������ȭ: ����ȭ�� ��ü�� �ٽ� �����ϴ°�
 * - ����ȭ ������ Ŭ���� �����: Serializable �������̽� ��ӹޱ�
 */
public class Person implements Serializable {
	private String name;// �̸�
	private transient String snum;// �ֹι�ȣ transient: ����ȭ�� �ȵ�
	private int age;// ����

	public Person() {
		super();
	}

	public Person(String name, String snum, int age) {
		this.name = name;
		this.snum = snum;
		this.age = age;
	}

	public void setName(String name) {// setter�޼ҵ�
		this.name = name;
	}

	public String getSnum() {// getter�޼ҵ�
		return snum;
	}

	public int getAge() {
		return age;
	}

	public String getName() {
		return name;
	}

}
