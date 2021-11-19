package day18.net.test02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

//서버프로그램
public class Server2 {
	public static void main(String[] args) {
		try {
			ServerSocket server = new ServerSocket(3001);
			System.out.println("서버실행~");
			Socket socket = server.accept();
			InetAddress a = socket.getInetAddress();
			String clientIP = a.getHostAddress();
			System.out.println("클라이언트가 접속했어요...[" + clientIP + "]");

			BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			String msg = br.readLine();
			System.out.println("클라이언트메세지>>" + msg);

//			inputStream 사용
//			InputStream in = socket.getInputStream();
//			// 연결된소켓으로부터 전송된 데이터를 읽어와 b배열에 저장하기
//			byte[] b = new byte[512];
//			int n = in.read(b);
//			// 배열을 String으로 저장하기
//			String s = new String(b, 0, n);
//			// 상대방이보내온 메세지 출력하기
//			System.out.println(s);
//			// 연결끊기
//			in.close();
//			socket.close();
//			server.close();

			br.close();
			socket.close();
			socket.close();

		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}
}
