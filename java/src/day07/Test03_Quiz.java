package day07;

public class Test03_Quiz {
	public static void main(String[] args) {
		MyAbs m = new MyAbs();
		// �Ʒ��� ����� ����� �� �ֵ��� ���밪�� ���ϴ� abs�޼ҵ带 �����ε��غ�����
		System.out.println("-10�� ���밪: " + m.abs(-10));
		System.out.println("-10�� ���밪: " + m.abs(-10.5));
		System.out.println("-10�� ���밪: " + m.abs(-100L));
		System.out.println("-10�� ���밪: " + m.abs(-10.3F));
	}
}

class MyAbs {
	public int abs(int x) {
		return (x < 0) ? -x : x;
	}

	public double abs(double x) {
		return (x < 0) ? -x : x;
	}

	public long abs(long x) {
		return (x < 0) ? -x : x;
	}

	public float abs(float x) {
		return (x < 0) ? -x : x;
	}
}
