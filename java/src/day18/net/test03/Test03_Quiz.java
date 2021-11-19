package day18.net.test03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

/*
 * 서버 프로그램
 * - 클라이언트가 접속하면 메세지 보내기
 * - 클라이언트가 보내온 메세지 출력
 * 클라이언트 프로그램
 * - 서버에서 보내온 메세지 출력하고 서버에게 메세지 보내기
 */
public class Test03_Quiz {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ServerSocket server = null;
		try {
			server = new ServerSocket(4000);
			System.out.println("서버가 열렸습니다.(서버실행)");
			Socket socket = server.accept();
			System.out.println("클라이언트와 연결되었습니다.");
			// 클라이언트에 메세지를 보내기 위한 스트림
			PrintWriter go = new PrintWriter(socket.getOutputStream());
			// 클라이언트에 메세지 보내기
			System.out.print("클라이언트에 보낼 메세지를 입력하세요: ");
			String msg = sc.next();
			go.println(msg);
			go.flush();

			// 클라이언트에서 보낸 메세지를 받기 위한 스트림
			BufferedReader read = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			// 클라이언트에서 메세지 받기
			String in = read.readLine();
			System.out.println("클라이언트에서 보내온 메세지>>" + in);

			server.close();
			socket.close();
			go.close();
			read.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
