package day06.class1;

/*
 * [��ü���� ���α׷���]
 * - ��� �۾��� ��üȭ�ؼ� ���α׷����ϴ� ���
 * - ��ü���� ���α׷��ֿ����� ��� �۾��� Ŭ������ �����Ѵ�.
 * - Ŭ���� ����� ����
 *  class Ŭ������{
 *  	������� ����;
 *  	����޼ҵ�(){
 *  		..
 *  	}
 *  }
 *  - Ŭ������ ����ϱ� ���ؼ��� ��ü(�ν��Ͻ�)�� �����ؾ� �Ѵ�.
 *  - ��ü�� �����ϱ� ���� ����
 *   Ŭ������ ��ü�� new Ŭ������();
 */
//public class Test01 {
//	public static void main(String[] args) {
//	}
//
//}
public class Test01 {
	public static void main(String[] args) {
		Box b = new Box();
		b.setPosition(100, 200);
		b.draw();
		b.setColor("RED");
		b.paint();
		Box c = new Box();
		c.setPosition(200, 300);
		c.draw();

	}
}

class Box {
	private int x;
	private int y;
	private String color;

	public void setPosition(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public void draw() {
		System.out.println(x + "," + y + "�� ��ġ�� �簢�� �׸���");
	}

	public void paint() {
		System.out.println(color + "�������� �簢�� ĥ�ϱ�");
	}
}
