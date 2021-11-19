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
 * Ŭ���̾�Ʈ�� �����ϸ� �г����� �Է��ϰ�
 * �޽����� �г����� ���������� �ڵ带 ������ ������.
 * ���ο� ����� �����ϸ� xxx���� �����ϼ̽��ϴ�. ��� ��µǵ���..
 * 
 * �浿�� ���� �����ϼ̽��ϴ�.
 * �浿��>>�ݰ���~
 * 
 */
//Ű����� exit�Է��ϸ� Serversocket�� �����ϰ� ���α׷� �����ϱ�
public class multiChat {
	public static void main(String[] args) {
		ServerSocket server = null;
		Vector<Socket> vec = new Vector<>();
		try {
			server = new ServerSocket(4000);
			// exid�Է½� �����ϴ� ������ ����
			new end(server, vec).start();
			while (true) {
				System.out.println("���� ������...");
				Socket socket = server.accept();
				System.out.println("Ŭ���̾�Ʈ�� �����߽��ϴ�....");
				// Ŭ���̾�Ʈ�� ����� ������ Vector�� ����
				vec.add(socket);
				// �����͸� �����ϴ� ������ ����
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
			System.out.println("���α׷��� �����մϴ�.");
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
			// Ŭ���̾�Ʈ�� �޼����� ������ ������ �޼����� �ٸ� Ŭ���̾�Ʈ�鿡�� ������
			BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			String nickName = br.readLine();
			sendMsg("[" + nickName + "]���� �����ϼ̽��ϴ�.");
			while (true) {
				String msg = br.readLine();
				if (msg == null) {
					System.out.println("����ڰ� ������ �����Ͽ����ϴ�.");
					sendMsg("[" + nickName + "]���� �����ϼ̽��ϴ�.");
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
		// �ٸ�Ŭ���̾�Ʈ�鿡�� �޼��� ������
		for (Socket s : vec) {
			if (s != socket) {
				PrintWriter pw = new PrintWriter(s.getOutputStream());
				pw.println(msg);
				pw.flush();
			}
		}
	}
}