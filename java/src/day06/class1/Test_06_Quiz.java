package day06.class1;

//main�޼ҵ尡 �� ����� �� �ֵ��� myrectŬ������ �ϼ��� ������.
public class Test_06_Quiz {
	public static void main(String[] args) {
		// �����ڸ� ����ؼ� ����, ���α��� �����ϱ�
		MyRect mr = new MyRect(100, 200);
		double r = mr.getArea();
		System.out.println("�簢�� ����: " + r);
	}
}

class MyRect {
	// �ڵ� �ϼ��ϱ�
//	private double getArea;
	private int a;// ����
	private int b;// ����

	public MyRect(int a, int b) {
		this.a = a;
		this.b = b;
	}

	public double getArea() {
		return a * b;
	}

}
