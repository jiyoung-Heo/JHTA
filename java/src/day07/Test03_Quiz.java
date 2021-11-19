package day07;

public class Test03_Quiz {
	public static void main(String[] args) {
		MyAbs m = new MyAbs();
		// 아래의 기능을 수행될 수 있도록 절대값을 구하는 abs메소드를 오버로딩해보세요
		System.out.println("-10의 절대값: " + m.abs(-10));
		System.out.println("-10의 절대값: " + m.abs(-10.5));
		System.out.println("-10의 절대값: " + m.abs(-100L));
		System.out.println("-10의 절대값: " + m.abs(-10.3F));
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
