package day01.test.aa;

public class Test05_Castiong {
	/*
	 * [강제형변환(type Casting)] - 데이터형을 강제로 변환하는것 - 형식 (바꿀 자료형)변수/상수 예) int a =
	 * (int)4.5;
	 */
	public static void main(String[] args) {
		byte a = 100;
		int b = a;// 자동형변환이 이루어짐
		byte c = (byte) b;// 큰자료형을 작은 자료형에 넣을때는 강제형변환해야 한다.
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);

		long e = 333333333L;// long형 상수로 만들기
		System.out.println("e: " + e);
	}
}
