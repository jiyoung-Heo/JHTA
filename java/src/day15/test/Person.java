package day15.test;

import java.io.Serializable;

/*
 * [객체의 직렬화]
 * - 객체를 바이트단위로 쪼개서 열별로 나열하는것
 * - 역질렬화: 직렬화된 객체를 다시 조합하는것
 * - 직렬화 가능한 클래스 만들기: Serializable 인터페이스 상속받기
 */
public class Person implements Serializable {
	private String name;// 이름
	private transient String snum;// 주민번호 transient: 직렬화가 안됨
	private int age;// 나이

	public Person() {
		super();
	}

	public Person(String name, String snum, int age) {
		this.name = name;
		this.snum = snum;
		this.age = age;
	}

	public void setName(String name) {// setter메소드
		this.name = name;
	}

	public String getSnum() {// getter메소드
		return snum;
	}

	public int getAge() {
		return age;
	}

	public String getName() {
		return name;
	}

}
