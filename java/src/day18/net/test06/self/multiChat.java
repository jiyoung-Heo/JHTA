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
				System.out.println("���� ������...");
				Socket socket = server.accept();
				System.out.println("Ŭ���̾�Ʈ�� �����߽��ϴ�....");
				System.out.print("���̵� �Է��ϼ���: ");
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
			while (true) {
				String msg = br.readLine();
				if (msg == null) {
					System.out.println("����ڰ� ������ �����Ͽ����ϴ�.");
					break;
				}
				sendMsg(msg);
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