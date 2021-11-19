package day18.net.test04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server4 {
	public static void main(String[] args) {
		ServerSocket server = null;
		Socket socket = null;
		try {
			server = new ServerSocket(3003);
			System.out.println("���� ������...");
			socket = server.accept();
			System.out.println("Ŭ���̾�Ʈ ����...");
			ServerSend ss = new ServerSend(socket);
			ss.start();
			ServerRead sr = new ServerRead(socket);
			sr.start();
		} catch (IOException e) {
			e.getMessage();
		}
	}
}

class ServerRead extends Thread {
	Socket socket = null;

	public ServerRead(Socket socket) {
		this.socket = socket;
	}

	@Override
	public void run() {
		BufferedReader br = null;
		try {
			br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			while (true) {
				String msg = br.readLine();
				if (msg == null) {
					System.out.println("���̻� Ŭ���̾�Ʈ���� �����͸� �о�� �� �����");
					break;
				}
				System.out.println("�����޼���: " + msg);
			}
			br.close();
			socket.close();
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}
}

class ServerSend extends Thread {
	Scanner sc = new Scanner(System.in);
	Socket socket = null;

	public ServerSend(Socket socket) {
		this.socket = socket;
	}

	@Override
	public void run() {
		PrintWriter send;
		try {
			send = new PrintWriter(socket.getOutputStream());
			while (true) {
//				System.out.print("�����޼���: ");
				String msg = sc.nextLine();
				if (msg.equals("exit")) {
					break;
				}
				send.println(msg);
				send.flush();
			}
			send.close();
			socket.close();
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}
}
