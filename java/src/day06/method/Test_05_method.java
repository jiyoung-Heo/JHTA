package day06.method;

public class Test_05_method {
	public static void main(String[] args) {
		int a = sum(10, 20);
		System.out.println("두수합: " + a);
		int b = sum(10, 20, 30);
		System.out.println("세수합: " + b);
	}

	public static int sum(int... x) {// 가변길이 인자(전달된 인자값들이 매개변수에 배열형태로 저장
		int s = 0;
		for (int i = 0; i < x.length; i++) {
			s += x[i];
		}
		return s;
	}
}
