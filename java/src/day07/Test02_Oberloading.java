package day07;

/*
 * [오버로딩(Overloading)]
 * - 같은 이름의 메소드를 중복해서 정의하는 것
 * - 메소드 이름은 같지만 파라미터 타입이나 갯수가 달라야 한다.
 * 
 * 예)
 * class AA{
 * 		int add(int x,int y){...}
 * 		int add(int x, int y, intz}{...}
 */
public class Test02_Oberloading {
	public static void main(String[] args) {
		// add메소드를 사용해서 세 정수의 합을 구하여 출력되도록 해보세요.
		MyMath mm = new MyMath();
		System.out.println(mm.add(3, 2, 3));
	}
}

class MyMath {
	public int add(int x, int y) {
		return x + y;
	}
//	public int add(int x, int y) {//오버로딩 안됨
//		return x + y;
//	}

	public int add(int x, int y, int z) {
		return x + y + z;
	}

	public double add(double x, double y) {
		return x + y;
	}
}