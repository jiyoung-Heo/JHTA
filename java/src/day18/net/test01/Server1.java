package day18.net.test01;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

/*
 * [서버프로그램]
 * 1. ServerSocket 생성(포트번호 지장)
 * 2. accept메소드를 호출(클라이언트 접속대기-> 허용-> 데이터를 송수신할 소켄객체 생성)
 * 3. socket객체를 통해 데이터 주고받기 (io스트림 사용)
 * 4. 접속종료(소켓닫기)
 */
public class Server1 {
	public static void main(String[] args) {
		ServerSocket server = null;
		try {
			server = new ServerSocket(3000);
			System.out.println("서버 실행중...");
			Socket socket = server.accept();
			System.out.println("클라이언트가 접속했습니다...");
			// 연결된 소켓으로부터 데이터를 읽어오기 위한 입력스트림객체 얻어오기

			InputStream in = socket.getInputStream();
			// 연결된소켓으로부터 전송된 데이터를 읽어와 b배열에 저장하기
			byte[] b = new byte[512];
			int n = in.read(b);
			// 배열을 String으로 저장하기
			String s = new String(b, 0, n);
			// 상대방이보내온 메세지 출력하기
			System.out.println(s);
			// 연결끊기
			in.close();
			socket.close();
			server.close();

		} catch (IOException e) {
			e.getStackTrace();
		}

	}
}
