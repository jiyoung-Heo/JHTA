package day18.net.test06.self;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class Client1 {
	public static void main(String[] args) {
		Socket socket = null;
		try {
			socket = new Socket("localhost", 4000);
			System.out.println("서버에 접속했습니다...");
			new CSendThread(socket).start();
			new CGetThread(socket).start();
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}
}

class CSendThread extends Thread {
	Socket socket;
	Scanner sc = new Scanner(System.in);

	public CSendThread(Socket socket) {
		this.socket = socket;
	}

	@Override
	public void run() {
		try {
			// 서버에 메세지를 보내기 위한 스트림(자동으로 flush되도록 지정)
			PrintWriter pw = new PrintWriter(socket.getOutputStream(), true);
			System.out.print("아이디: ");
			String name = sc.next();
			pw.write(name);
			while (true) {
				String msg = sc.nextLine();
				if (msg.equals("exit")) {
					break;
				}
				pw.println(msg);
			}
			pw.close();
			socket.close();
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}

	}
}

class CGetThread extends Thread {
	Socket socket;
	Scanner sc = new Scanner(System.in);

	public CGetThread(Socket socket) {
		this.socket = socket;
	}

	@Override
	public void run() {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			String name = br.readLine();
			System.out.println(name + "님 입장하셨습니다.");
			while (true) {
				String msg = br.readLine();
				if (msg == null) {
					System.out.println("서버와의 접속이 끊겼습니다..");
					break;
				}
				System.out.println(name + ">>" + msg);
			}
			br.close();
			socket.close();
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}
}
