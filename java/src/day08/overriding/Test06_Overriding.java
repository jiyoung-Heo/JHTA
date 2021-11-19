package day08.overriding;

/*
 * [�������̵�(***)]
 * - �θ�Ŭ������ �޼ҵ带 �ڽ�Ŭ�������� �����ϰ��� �Ҷ� �������̵��� �Ѵ�.
 * - ����� ���
 * 	 �θ�Ŭ������ �޼ҵ��, �Ķ���Ͱ���, Ÿ�� ��� ��ġ�ؾ��Ѵ�.
 * - �������̵��Ҷ� ���������ڴ� �θ��� ���������ں��� ������ �������� �ȵȴ�.
 * ��)
 * 	class AA{
 * 		public void show(){
 * 	}
 * 	class BB extends AA{
 * 		public void show(){}//�������̵�
 * 		public void show(String a){}//�����ε�
 */
public class Test06_Overriding {
	public static void main(String[] args) {
		Rect r = new Rect();
		r.setXY(100, 200);
		r.draw();// �ڽĿ��� �������̵��� �޼ҵ� ȣ��
		r.draw("����");
		Circle c = new Circle();
		c.setXY(300, 400);
		c.draw();
	}
}

class Shape {
	protected int x;
	protected int y;

	public void setXY(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public void draw() {
		System.out.println("x: " + x + "y: " + y + " ��ġ�� ���� �׸���");
	}
}

class Rect extends Shape {
	public void draw() {// �������̵�
		System.out.println("x: " + x + "y: " + y + " ��ġ�� �簢�� �׸���");
	}

	public void draw(String color) {// �����ε�
		System.out.println("x: " + x + ",y: " + y + "��ġ�� " + color + " ������ �簢�� �׸���");
	}
}

class Circle extends Shape {
	public void draw() {// �������̵�
		System.out.println("x: " + x + "y: " + y + " ��ġ�� �簢�� �׸���");
	}
}