package day06.class1;

//main메소드가 잘 실행될 수 있도록 myrect클래스를 완성해 보세요.
public class Test_06_Quiz {
	public static void main(String[] args) {
		// 생성자를 사용해서 가로, 세로길이 설정하기
		MyRect mr = new MyRect(100, 200);
		double r = mr.getArea();
		System.out.println("사각형 넓이: " + r);
	}
}

class MyRect {
	// 코드 완성하기
//	private double getArea;
	private int a;// 가로
	private int b;// 세로

	public MyRect(int a, int b) {
		this.a = a;
		this.b = b;
	}

	public double getArea() {
		return a * b;
	}

}
