package day12.innerclass;

//static 내부클래스
public class Test05_staticInner {
	public static void main(String[] args) {
		MyMath.Calc mc = new MyMath.Calc();
		System.out.println("두수합: " + mc.add(1, 2));
		MyMath.MyNumber mm = new MyMath.MyNumber();
		System.out.println("반올림값: " + mm.round(4.6));
	}
}

class MyMath {
	static class Calc {
		public int add(int a, int b) {
			return a + b;
		}
	}

	static class MyNumber {
		public int round(double a) {
			return (int) Math.round(a);
		}

		public int ceil(double a) {
			return (int) Math.ceil(a);
		}
	}
}