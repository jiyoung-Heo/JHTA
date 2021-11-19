package day09;

public class Test03_Quiz {
	public static void main(String[] args) {
		Rect2 rc = new Rect2(100, 200);
		System.out.println(rc.getArea());
	}
}

abstract class MyArea {
	protected int x;
	protected int y;

	public MyArea(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public abstract int getArea();
}

class Rect2 extends MyArea {
	public Rect2(int x, int y) {
		super(x, y);
	}

	public int getArea() {
		return x * y;
	}
}
//myAreaŬ������ getArea�޼ҵ带 �߻�Ŭ������ ��������
//MyAreaŬ������ ��ӹ޾� �簢�� ���̸� ���ϴ� �ڽ�Ŭ������ ����� ����غ�����
