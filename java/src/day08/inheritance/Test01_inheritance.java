package day08.inheritance;

/*
 * [상속(***)]
 * - 기본클래서(부모클래스, super클래스)의 속성과 메소드를 물려받고 기존의 기능을 수정하거나 새로운 기능을 추가(확장)하는것
 * - 형식)
 * class 부모클래스명{
 * 		...
 * }
 * class 자식클래스명 extends 부모클래스명{
 * 		...
 * }
 * - 부모의 private 멤버는 자식크래스에서 접근할 수 없다.
 * 	 부모의 protected멤버는 다른 패키지에서는 접근할 수 없지만 자식클래스에서는 접근할 수 있다.
 * - 접근지정자
 * 	 private: 자신의 클래스에서만 접근가능
 *   default: 같은 패키지내에서 접근가능
 *   protected: 같은 패키지 또는 패키지가 달라도 자식클래스에서 접근가능
 *   public: 어디서든 접근가능
 *   
 */
public class Test01_inheritance {
	public static void main(String[] args) {
//		Person ps = new Person();
//		ps.setPerson("지영", 33);
//		ps.printPerson();
		Student st = new Student();
		st.setPerson("지영", 33);
		st.printPerson();
		st.setStudent(22, "수학", 33);
		st.printStudent();
	}
}

class Student extends Person {
	private int snum;// 학생번호
	private String subject;// 과목
	private int score;// 점수

	public void setStudent(int snum, String subject, int score) {
		this.score = score;
		this.snum = snum;
		this.subject = subject;
	}

	public void printStudent() {
//		System.out.println("이름: "+name);->부모의 private 멤버는 접근 못함.
		System.out.println("학생번호: " + snum);
		System.out.println("과목명: " + subject);
		System.out.println("점수: " + score);
	}
}

class Person {
	private String name;
	private int age;

	public void setPerson(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public void printPerson() {
		System.out.println("이름: " + name);
		System.out.println("나이: " + age);
	}

}
