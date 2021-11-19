package day13.io;

import java.io.IOException;
import java.io.InputStream;

/*
 * [자바의 IO]
 * - 데이터를 읽어오거나 출력에 관련된 작업
 * - 자바에서 데이터를 입출력 할때는 스트림을 사용한다.(스트림은 데이터의 흐름)
 * - 1바이트처리스트림과 2바이트처리스트림이 있다.
 * <InputStream 클래스>
 * - 입력스트림의 최상위 추상클래스
 * - 1바이트처리스트림
 */
public class Test01 {
	public static void main(String[] args) {
		// public static final InputStrim in
		InputStream is = System.in;
		try {
			// public abstract int read() throws IOException: 키보드로 1바이트 데이터 읽어오기
			System.out.println("딱 한글자만 입력하세요");
			int a = is.read();
			System.out.println("입력된 문자: " + (char) a);
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}
}
