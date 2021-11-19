package day09;

public class Test08 {
	public static void main(String[] args) {
		Rect4 r = new Rect4();
		r.draw();
		r.paint();
		r.resize();
		r.setPoint(100, 200);
	}
}

//rect3�� ��ӹ޴� Ŭ���� Rect2�� ����� ����غ�����

interface Shape5 {
	void draw();

	void paint();
}

interface Point {
	void setPoint(int x, int y);
}

interface Rect3 extends Shape5, Point {// �������̽����� ����Ҷ��� extends�� ����Ѵ�.
	void resize();
}

class Rect4 implements Rect3 {
	public void draw() {
		System.out.println("�簢��");
	}

	public void paint() {
		System.out.println("������");
	}

	public void setPoint(int x, int y) {
		System.out.println(x + " " + y + "��ǥ");
	}

	public void resize() {
		System.out.println("�ٽ����ϱ�");
	}

}
