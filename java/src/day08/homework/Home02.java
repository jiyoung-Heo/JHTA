package day08.homework;

//2. MyShapeŬ������ ��ӹ޴� MyLine,MyRectŬ������
//����� draw�޼ҵ带 �������̵��غ�����
//
//[ ��°�� ]
//x��ǥ:100,y��ǥ:200�� ��ġ�� �簢���� ���������� �׷���.
//x��ǥ:100,y��ǥ:200�� ��ġ�� ������ �Ķ������� �׷���.
//class MyShape{
//	protected int x,y;//x,y��ǥ
//	private String color;//����
//	public MyShape(int x,int y,String color){
//		this.x=x;
//		this.y=y;
//		this.color=color;
//	}
//	public String getColor(){
//		return color;
//	}
//	public void draw(){
//		System.out.println("x��ǥ:"  + x + "y��ǥ:" + y +"�� ��ġ��"+ color );
//	}
//}
public class Home02 {
	public static void main(String[] args) {
		System.out.println("[��°��]");
		MyLine ml = new MyLine(100, 200, "����");
		ml.draw();
		MyRect mr = new MyRect(100, 200, "��Ȳ");
		mr.draw();
	}
}

class MyShape {
	protected int x, y;// x,y��ǥ
	private String color;// ����

	public MyShape(int x, int y, String color) {
		this.x = x;
		this.y = y;
		this.color = color;
	}

	public String getColor() {
		return color;
	}

	public void draw() {
		System.out.println("x��ǥ:" + x + "y��ǥ:" + y + "�� ��ġ��" + color);
	}
}

class MyLine extends MyShape {
	private String color2;

	public MyLine(int x, int y, String color) {
		super(x, y, color);
		color2 = color;
	}

	public void draw() {
		System.out.println("x��ǥ:" + x + "y��ǥ: " + y + "�� ��ġ�� ������ " + color2 + "�� ���� �׷���.");
	}

}

class MyRect extends MyShape {
	private String color2;

	public MyRect(int x, int y, String color) {
		super(x, y, color);
		color2 = color;
	}

	public void draw() {
		System.out.println("x��ǥ:" + x + "y��ǥ: " + y + "�� ��ġ�� �簢���� " + color2 + "�� ���� �׷���.");
	}
}