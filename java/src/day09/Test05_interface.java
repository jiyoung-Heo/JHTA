package day09;

/*
 * [�������̽�(***)]
 * - �ڽ�Ŭ�������� ������ �� ��ɵ��� ����� ����(����, �⺻Ʋ ����)
 * - ����� �߻�޼ҵ�� �̷����
 * ���������)
 *  interface �������̽���{
 * 		���;
 * 		�߻�޼ҵ�();
 *  }
 *  - �������̽��� ��ü�� ������ �� ����.(�ڽİ�ü ������ ����)
 *  - �������
 *  	1. �ڽ�Ŭ������ ������ �� ��ɵ��� ���븦 ����
 *  	2. Ŭ������ ���߻���� �������� ������ �������̽��� Ȱ���Ͽ� ���߻���� �����Ѵ�.
 *  	3. �������̽��� ������ ��������ν� ���������� ������ ����.
 */
public class Test05_interface {
	public static void main(String[] args) {
		Box1 b1 = new Box1();
		b1.draw();
		b1.paint();
		Circle1 c1 = new Circle1();
		c1.draw();
		c1.paint();
		Shape2 s = c1;
		s.draw();
		s.paint();
	}
}

interface Shape2 {
	double PI = 3.14;// ����̴�. public static final�� ������

	public abstract void draw();

	void paint();// public abstract ��������
}

class Box1 implements Shape2 {
	public void draw() {
		System.out.println("�簢�� �׸���");
	}

	public void paint() {// public �Ƚ��ָ� default�� ����ȴ�. public���� default�� ���� �����̱� ������ �ڽĿ��� ����� �� ����.-�ڽ��� ��
							// �����Ÿ� ������
		System.out.println("�簢�� ĥ�ϱ�");
	}
}

class Circle1 implements Shape2 {
	public void draw() {
		System.out.println("Ÿ�� �׸���");
	}

	public void paint() {
		System.out.println("Ÿ�� ĥ�ϱ�");
	}
}
