package day18.net.test06;

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
			System.out.println("������ �����߽��ϴ�...");
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
			// ������ �޼����� ������ ���� ��Ʈ��(�ڵ����� flush�ǵ��� ����)
			PrintWriter pw = new PrintWriter(socket.getOutputStream(), true);
			System.out.println("�г����� �Է��ϼ���");
			String nickName = sc.nextLine();
			pw.println(nickName);
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

	public CGetThread(Socket socket) {
		this.socket = socket;
	}

	@Override
	public void run() {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			while (true) {
				String msg = br.readLine();
				if (msg == null) {
					System.out.println("�������� ������ ������ϴ�..");
					System.exit(0);
					break;
				}
//				 �޼����� ȭ�鿡 ����ϱ�
				System.out.println(msg);
			}
			br.close();
			socket.close();
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}
}
