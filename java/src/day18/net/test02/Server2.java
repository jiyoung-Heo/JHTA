package day18.net.test02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

//�������α׷�
public class Server2 {
	public static void main(String[] args) {
		try {
			ServerSocket server = new ServerSocket(3001);
			System.out.println("��������~");
			Socket socket = server.accept();
			InetAddress a = socket.getInetAddress();
			String clientIP = a.getHostAddress();
			System.out.println("Ŭ���̾�Ʈ�� �����߾��...[" + clientIP + "]");

			BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			String msg = br.readLine();
			System.out.println("Ŭ���̾�Ʈ�޼���>>" + msg);

//			inputStream ���
//			InputStream in = socket.getInputStream();
//			// ����ȼ������κ��� ���۵� �����͸� �о�� b�迭�� �����ϱ�
//			byte[] b = new byte[512];
//			int n = in.read(b);
//			// �迭�� String���� �����ϱ�
//			String s = new String(b, 0, n);
//			// �����̺����� �޼��� ����ϱ�
//			System.out.println(s);
//			// �������
//			in.close();
//			socket.close();
//			server.close();

			br.close();
			socket.close();
			socket.close();

		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}
}
