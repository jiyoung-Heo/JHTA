package day17.test;

public class Person {
	private String name;
	private String age;

	public Person(String name, String age) {
		super();
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public String getAge() {
		return age;
	}

	@Override
	public String toString() {
		return "이름: " + name + ", 나이" + age + "";
	}

}
