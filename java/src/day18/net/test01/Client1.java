package day18.net.test01;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

/*
 * [클라이언트 프로그램]
 * 1. 서버접속하기(Socket객체 - 서버 ip주소, prot번호)
 * 2. Socket객체를 통해 데이터 주고받기(io스트림 사용)
 * 3. 접속종료(소켓닫기)
 */
public class Client1 {
	public static void main(String[] args) {
		Socket socket = null;
		try {
			socket = new Socket("192.168.0.19", 3000);
			System.out.println("서버에 접속성공!");

			String msg = "반가워요 서버~";
			OutputStream out = socket.getOutputStream();
			out.write(msg.getBytes());
			out.flush();
			System.out.println("서버에 메세지 전송완료");
			socket.close();

		} catch (UnknownHostException e) {
			System.out.println(e.getMessage());
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}
}
