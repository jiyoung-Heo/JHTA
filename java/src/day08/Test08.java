package day08;

/*
 * [Ŭ�������� ����ȯ]
 * - Ŭ���������� ����ȯ�� �ȵ����� ��Ӱ��迡���� ����ȯ�� �����ϴ�.
 * - �θ�Ŭ������ �ڽ�Ŭ������ ������ �� ������ �ڽ�Ŭ�������� �߰��� ����� ������ �� ����.
 *   �� �������̵��� �޼ҵ�� ������ �����ϴ�.
 * - �ڽ�Ŭ�������� �θ�Ŭ������ ������ ���� ������ �̶��� ��������ȯ�� �ؾ� �Ѵ�.
 */
public class Test08 {
	public static void main(String[] args) {
		Rect r = new Rect();
		r.setXY(100, 200);
		r.draw();
		Shape s = r;// ����
		s.setXY(300, 300);
		s.draw();// �ڽĿ��� �������̵��� �޼ҵ尡 ȣ���.
//		s.paintRect("Red");//����->�ڽĿ��� �߰��� �޼ҵ�� ���ٸ���
		Circle c = new Circle();
		c.setXY(500, 600);
		c.draw();
		Shape s1 = c;
		s1.draw();
		Circle c1 = (Circle) s1;// �ڽİ�ü�� �θ�ü�� �����Ҷ��� �ݵ�� ��������ȯ �ؾ� �Ѵ�.
		c1.draw();
		c1.paintCircle("blue");
//		Circle c2 = r;//����
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

	public void paintRect(String color) {
		System.out.println(color + "�������� �簢�� ĥ�ϱ�");
	}
}

class Circle extends Shape {
	public void draw() {// �������̵�
		System.out.println("x: " + x + "y: " + y + " ��ġ�� Ÿ�� �׸���");
	}

	public void paintCircle(String color) {
		System.out.println(color + "�������� Ÿ�� ĥ�ϱ�");
	}
}