package day17.test;

public class Student implements Comparable<Student> {
	private int num;
	private String name;
	private int score;

	public Student(int num, String name, int score) {
		super();
		this.num = num;
		this.name = name;
		this.score = score;
	}

	public int getNum() {
		return num;
	}

	public String getName() {
		return name;
	}

	public int getScore() {
		return score;
	}

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "��ȣ" + num + ", �̸�" + name + ", ����" + score;
	}

	@Override
	public int compareTo(Student o) {// ��������
//		if (score > o.getScore()) {
//			return 1;
//		} else if (score < o.getScore()) {
//			return -1;
//		} else {
//			return 0;
//		}
//		return Integer.compare(score, o.getScore());// ������������ ����
		return Integer.compare(score, o.getScore()) * -1;// ������������ ����

	}

}
