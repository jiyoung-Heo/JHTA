package day18.net.test03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class Test03_Quiz_Client {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Socket socket = null;
		try {
			socket = new Socket("localhost", 4000);
			System.out.println("...서버와 연결 성공...");
			// 서버에서 보낸 메세지를 받기위한 스트림
			BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			// 서버에서 메세지 받기
			String in = br.readLine();
			System.out.println("서버에서 보내온 메세지>>>" + in);

			// 서버에 메세지를 보내기위한 스트림
			PrintWriter rego = new PrintWriter(socket.getOutputStream());
			// 서버에 메세지 보내기
			System.out.print("서버에 보낼 메세지를 입력하세요: ");
			String out = sc.next();
			rego.println(out);
			rego.flush();
			System.out.println("서버에 데이터 전송 완료~");

			socket.close();
			br.close();
			rego.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
