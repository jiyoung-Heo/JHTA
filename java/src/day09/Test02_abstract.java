package day09;

/*
 * [�߻�Ŭ����]
 * - �߻�޼ҵ带 �����ϴ� Ŭ����
 * - ��ü�� �����Ҽ��� ���� ������ ����� �������� �����.
 * - ����� ����: Ŭ������ abstract�� �ٿ��� �����.
 * [�߻�޼ҵ�]
 * - body(��ü)�� ���� �ʴ� �޼ҵ� 
 * - �߻�޼ҵ�� �ڽ�Ŭ�������� �ݵ�� �������̵��ؾ� �Ѵ�.�ڡڡ�
 * - ���������: �޼ҵ��տ� abstract�� ���̰� body�κ��� ������ �ʴ´�.
 * ��)
 * class MyClass{//�߻�Ŭ����
 * 		public abstract void print();//�߻�޼ҵ�
 * }
 * 
 * - ����� ����: �ڽ�Ŭ�������� �������� �ݵ�� �����ؾ� �� ����� �޼ҵ带 ������ �� ��� �߻�޼ҵ带 �����.
 * 
 */
public class Test02_abstract {
	public static void main(String[] args) {
		Rect rt = new Rect(100, 200);
		rt.draw();
		// Shape s = new Shape(); ����-> �߻�Ŭ������ ��ü������ �� �� ����
		Shape s = rt;// �ڽİ�ü ������ ����
		rt.draw();
	}
}

//shape�� ��ӹ޾� draw�޼ҵ带  �������̵��ϴ� Rect Ŭ������ ����� ������.
//draw�޼ҵ�� x,y��ǥ�� �簢���� �׷��� ��� ��µǵ���
abstract class Shape {
	private int x;
	private int y;

	public Shape(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public abstract void draw();
}

class Rect extends Shape {
	public Rect(int x, int y) {
		super(x, y);
	}

	public void draw() {
		System.out.println(getX() + "," + getY() + "��ǥ�� �簢���� �׷���");
	}
}
