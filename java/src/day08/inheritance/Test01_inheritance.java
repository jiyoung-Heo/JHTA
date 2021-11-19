package day08.inheritance;

/*
 * [���(***)]
 * - �⺻Ŭ����(�θ�Ŭ����, superŬ����)�� �Ӽ��� �޼ҵ带 �����ް� ������ ����� �����ϰų� ���ο� ����� �߰�(Ȯ��)�ϴ°�
 * - ����)
 * class �θ�Ŭ������{
 * 		...
 * }
 * class �ڽ�Ŭ������ extends �θ�Ŭ������{
 * 		...
 * }
 * - �θ��� private ����� �ڽ�ũ�������� ������ �� ����.
 * 	 �θ��� protected����� �ٸ� ��Ű�������� ������ �� ������ �ڽ�Ŭ���������� ������ �� �ִ�.
 * - ����������
 * 	 private: �ڽ��� Ŭ���������� ���ٰ���
 *   default: ���� ��Ű�������� ���ٰ���
 *   protected: ���� ��Ű�� �Ǵ� ��Ű���� �޶� �ڽ�Ŭ�������� ���ٰ���
 *   public: ��𼭵� ���ٰ���
 *   
 */
public class Test01_inheritance {
	public static void main(String[] args) {
//		Person ps = new Person();
//		ps.setPerson("����", 33);
//		ps.printPerson();
		Student st = new Student();
		st.setPerson("����", 33);
		st.printPerson();
		st.setStudent(22, "����", 33);
		st.printStudent();
	}
}

class Student extends Person {
	private int snum;// �л���ȣ
	private String subject;// ����
	private int score;// ����

	public void setStudent(int snum, String subject, int score) {
		this.score = score;
		this.snum = snum;
		this.subject = subject;
	}

	public void printStudent() {
//		System.out.println("�̸�: "+name);->�θ��� private ����� ���� ����.
		System.out.println("�л���ȣ: " + snum);
		System.out.println("�����: " + subject);
		System.out.println("����: " + score);
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
		System.out.println("�̸�: " + name);
		System.out.println("����: " + age);
	}

}
