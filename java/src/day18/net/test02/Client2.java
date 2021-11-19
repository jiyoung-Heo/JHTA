package day18.net.test02;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

//클라이언트 프로그램
public class Client2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
//			Socket socket = new Socket("127.0.0.1", 3001);
			Socket socket = new Socket("localhost", 3001);
			System.out.println("서버에 접속 성공!");
			System.out.print("서버에 보낼 메세지 입력>>");
			String msg = sc.next();
			// printwriter사용
			PrintWriter pw = new PrintWriter(socket.getOutputStream());
			// 자동 플러쉬
//			PrintWriter pw = new PrintWriter(socket.getOutputStream(),true);
			pw.println(msg);
			pw.flush();
			System.out.println("서버에 메세지 보내기 완료");

//			outputsteam사용
//			OutputStream out = socket.getOutputStream();
//			out.write(msg.getBytes());
//			out.flush();
//			System.out.println("서버에 메세지 전송완료");
//			socket.close();

		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}
}