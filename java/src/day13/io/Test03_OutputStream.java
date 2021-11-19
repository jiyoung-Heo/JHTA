package day13.io;

import java.io.IOException;
import java.io.OutputStream;

/*
 * [OutputStream]
 * - 1바이트처리 출력스트림(출력스트림의 최상위 클래스)
 * - 추상클래스이므로 객체를 생성할 수 없다.
 * - 화면에 출력하기 위한 스트림객체 얻어오기
 *    OutputStream os=System.out;
 */
public class Test03_OutputStream {
	public static void main(String[] args) {
		OutputStream os = System.out;
//		public void write(byte[] b) throws IOException
		try {
			int b = 65;
			os.write(b);
			os.flush();// 버퍼가 다 차지 않아도 데이터를 내보내라.(출력하기)
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}
}
