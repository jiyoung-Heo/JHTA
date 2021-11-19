package day15.test;

import java.io.Serializable;

public class Student implements Serializable {
	private int num;
	private int kor;
	private int eng;

	public Student(int num, int kor, int eng) {
		this.num = num;
		this.kor = kor;
		this.eng = eng;
	}

	public int getNum() {
		return num;
	}

	public int getKor() {
		return kor;
	}

	public int getEng() {
		return eng;
	}
}
