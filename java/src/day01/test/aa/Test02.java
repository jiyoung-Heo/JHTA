package day01.test.aa;

/*
 * 1. 변수- 임이의 값을 저장하기 위한 메모리상의 저장공간
 * 	  변수명 만드는 규칙
 * 	   - 소문자로 시작한다.
 * 	   - 영문자, 숫자, _로 구성된다.
 * 	   - 변수명이 숫자로 시작되어서는 안된다.
 * 2. 변수선언
 * 	  형식) 자료형 변수명=초기값;
 * 3. 자료형(Data Type)
 *  1) 기본자료형(Primitive Type)
 *  	- 정수형: byte(1바이트), short(2바이트), int(4바이트), long(8바이트)
 *  	- 실수형: float(4바이트), double(8바이트)
 *  	- 부울형: boolean(1바이트) : true/false
 *  	- 문자형: char(2바이트)
 *  2) 참조자료형(Reference Type)
 * 		-클래스, 배열
 * 
 * 
 */
public class Test02 {
	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		int c = a + b;
		System.out.println(a + "+" + b + "=" + c);
	}
}
