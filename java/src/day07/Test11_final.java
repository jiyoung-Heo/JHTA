package day07;

class MyCicle {
	public static final double PI = 3.141592;

	public double getArea(double r) {
		return r * r * PI;
	}
}

public class Test11_final {
	public static void main(String[] args) {
		MyCicle mc = new MyCicle();
		System.out.println("���� ����: " + mc.getArea(3.4));
		System.out.println(MyCicle.PI);
		final double a = 100;
		// a = 200; -> ����: final�� ���� �������
		System.out.println("a: " + a);
		// Math Ŭ����: public static final double PI
		System.out.println(Math.PI);
		System.out.println(Integer.MAX_VALUE);
	}
}
