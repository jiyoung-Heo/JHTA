package day08.overriding;

//Rect클래스를 상속받아 삼각형의 넓이를 구하는 자식클래스를 만들고
//삼각형의 넓이를 구하도록 getArea()메소드를 오버라이딩해보세요.
public class Test07_Quiz {
	public static void main(String[] args) {
		Tryangle ta = new Tryangle(20, 40);
		System.out.println(ta.getArea());
	}
}

class Rect1 {
	private int x;// 가로
	private int y;// 세로

	public Rect1(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public int getArea() {
		return x * y;
	}
}

class Tryangle extends Rect1 {

	public Tryangle(int x, int y) {
		super(x, y);
	}

	public int getArea() {
		int a = super.getArea();// 부모에 정의된 getArea()메소드 호출
		return a / 2;
	}

}