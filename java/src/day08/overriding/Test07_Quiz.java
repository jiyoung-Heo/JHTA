package day08.overriding;

//RectŬ������ ��ӹ޾� �ﰢ���� ���̸� ���ϴ� �ڽ�Ŭ������ �����
//�ﰢ���� ���̸� ���ϵ��� getArea()�޼ҵ带 �������̵��غ�����.
public class Test07_Quiz {
	public static void main(String[] args) {
		Tryangle ta = new Tryangle(20, 40);
		System.out.println(ta.getArea());
	}
}

class Rect1 {
	private int x;// ����
	private int y;// ����

	public Rect1(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public int getArea() {
		return x * y;
	}
}

class Tryangle extends Rect1 {

	public Tryangle(int x, int y) {
		super(x, y);
	}

	public int getArea() {
		int a = super.getArea();// �θ� ���ǵ� getArea()�޼ҵ� ȣ��
		return a / 2;
	}

}