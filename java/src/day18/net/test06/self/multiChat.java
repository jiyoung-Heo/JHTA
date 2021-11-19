package day18.net.test06.self;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Vector;

public class multiChat {
	public static void main(String[] args) {
		ServerSocket server = null;
		Vector<Socket> vec = new Vector<>();
		try {
			server = new ServerSocket(4000);
			while (true) {
				System.out.println("서버 실행중...");
				Socket socket = server.accept();
				System.out.println("클라이언트가 접속했습니다....");
				System.out.print("아이디를 입력하세요: ");
				// 클라이언트와 연결된 소켓을 Vector에 저장
				vec.add(socket);

				// 데이터를 수신하는 스레드 실행
				new EcoThread(socket, vec).start();
			}

		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}
}

class EcoThread extends Thread {
	Socket socket;
	Vector<Socket> vec;

	public EcoThread(Socket socket, Vector<Socket> vec) {
		this.socket = socket;
		this.vec = vec;
	}

	@Override
	public void run() {
		try {
			// 클라이언트가 메세지를 보내면 보내온 메세지를 다른 클라이언트들에게 보내기
			BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			while (true) {
				String msg = br.readLine();
				if (msg == null) {
					System.out.println("사용자가 접속을 종료하였습니다.");
					break;
				}
				sendMsg(msg);
			}
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}

	}

	public void sendMsg(String msg) throws IOException {
		// 다른클라이언트들에게 메세지 보내기
		for (Socket s : vec) {
			if (s != socket) {
				PrintWriter pw = new PrintWriter(s.getOutputStream());
				pw.println(msg);
				pw.flush();
			}
		}
	}
}