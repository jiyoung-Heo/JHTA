package day08.inheritance;

public class Test04 {
	public static void main(String[] args) {
		// MyBox객체를 생성해서 사각형 넓이를 구해보세요
		MyBox1 m = new MyBox1(300, 200);
		System.out.println("사각형 넓이: " + m.getAres());
		Bupi b = new Bupi(300, 200, 7);
		System.out.println("사각형 부피: " + b.getAres());
	}
}

class MyBox1 {
	protected double x;// 가로
	protected double y;// 세로

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