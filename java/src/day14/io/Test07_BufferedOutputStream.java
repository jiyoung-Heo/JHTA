package day14.io;

import java.io.BufferedOutputStream;
import java.io.IOException;

//BufferedOutputStream: 버퍼의 사이즈를 조절하는 기능을 갖는 클래스
public class Test07_BufferedOutputStream {
	public static void main(String[] args) {
		try {
//			BufferedOutputStream(OutputStream out, int size)
			// 버퍼의 크기를 100바이트를 갖는 출력스트림객체 생성
			BufferedOutputStream bos = new BufferedOutputStream(System.out, 1024);// 버퍼가 다 차야 출력됨. 5 안쓰면 아무것도안나옴
			byte[] b = { 65, 66, 67, 68, 69, 70 };
			bos.write(b);
			bos.close();// 버퍼에 있는거 다 출력해줌

		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}
}
