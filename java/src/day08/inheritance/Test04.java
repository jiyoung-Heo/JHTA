package day08.inheritance;

public class Test04 {
	public static void main(String[] args) {
		// MyBox��ü�� �����ؼ� �簢�� ���̸� ���غ�����
		MyBox1 m = new MyBox1(300, 200);
		System.out.println("�簢�� ����: " + m.getAres());
		Bupi b = new Bupi(300, 200, 7);
		System.out.println("�簢�� ����: " + b.getAres());
	}
}

class MyBox1 {
	protected double x;// ����
	protected double y;// ����

	public MyBox1(double x, double y) {
		this.x = x;
		this.y = y;
	}

	public double getAres() {
		return x * y;
	}
}

class Bupi extends MyBox1 {
	protected double z;

	public Bupi(double x, double y, double z) {
		super(x, y);
		this.z = z;
	}

	public double getAres() {
		return x * y * z;
	}

}