package day18.net.test06;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;
import java.util.Vector;

/*
 * 클라이언트가 접속하면 닉네임을 입력하고
 * 메시지에 닉네임이 보여지도록 코드를 수정해 보세요.
 * 새로운 사람이 접속하면 xxx님이 입장하셨습니다. 라고 출력되도록..
 * 
 * 길동이 님이 입장하셨습니다.
 * 길동이>>반가워~
 * 
 */
//키보드로 exit입력하면 Serversocket을 종료하고 프로그램 종료하기
public class multiChat {
	public static void main(String[] args) {
		ServerSocket server = null;
		Vector<Socket> vec = new Vector<>();
		try {
			server = new ServerSocket(4000);
			// exid입력시 종료하는 스레드 실행
			new end(server, vec).start();
			while (true) {
				System.out.println("서버 실행중...");
				Socket socket = server.accept();
				System.out.println("클라이언트가 접속했습니다....");
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

class end extends Thread {
	Scanner sc = new Scanner(System.in);
	ServerSocket server;
	Vector<Socket> vec;

	public end(ServerSocket server, Vector<Socket> vec) {
		this.server = server;
		this.vec = vec;
	}

	@Override
	public void run() {
		String end = sc.next();
		if (end.equals("exit")) {
			System.out.println("프로그램을 종료합니다.");
			try {
				for (Socket s : vec) {
					s.close();
				}
				server.close();
//				System.exit(0);
			} catch (IOException e) {
				System.out.println(e.getMessage());
			}
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
			String nickName = br.readLine();
			sendMsg("[" + nickName + "]님이 입장하셨습니다.");
			while (true) {
				String msg = br.readLine();
				if (msg == null) {
					System.out.println("사용자가 접속을 종료하였습니다.");
					sendMsg("[" + nickName + "]님이 퇴장하셨습니다.");
					vec.remove(socket);
					socket.close();
					break;
				}
				sendMsg(nickName + ">>" + msg);
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