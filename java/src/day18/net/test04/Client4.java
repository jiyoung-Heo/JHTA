package day18.net.test04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class Client4 {
	public static void main(String[] args) {
		Socket socket = null;
		try {
			socket = new Socket("localhost", 3003);
			System.out.println("���� ���� ����!");
			ClientSend cs = new ClientSend(socket);
			cs.start();
			ClientRead cr = new ClientRead(socket);
			cr.start();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

class ClientRead extends Thread {
	Socket socket = null;

	public ClientRead(Socket socket) {
		this.socket = socket;
	}

	@Override
	public void run() {
		BufferedReader br;
		try {
			br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			while (true) {
				// ������ ������ �޼��� �о����
				String msg = br.readLine();
				if (msg == null) {
					System.out.println("���̻� �������� �����͸� �о�� �� �����..");
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

class ClientSend extends Thread {
	Scanner sc = new Scanner(System.in);
	Socket socket = null;

	public ClientSend(Socket socket) {
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
