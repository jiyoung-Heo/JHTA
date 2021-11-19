package day18.net.test01;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

/*
 * [�������α׷�]
 * 1. ServerSocket ����(��Ʈ��ȣ ����)
 * 2. accept�޼ҵ带 ȣ��(Ŭ���̾�Ʈ ���Ӵ��-> ���-> �����͸� �ۼ����� ���˰�ü ����)
 * 3. socket��ü�� ���� ������ �ְ�ޱ� (io��Ʈ�� ���)
 * 4. ��������(���ϴݱ�)
 */
public class Server1 {
	public static void main(String[] args) {
		ServerSocket server = null;
		try {
			server = new ServerSocket(3000);
			System.out.println("���� ������...");
			Socket socket = server.accept();
			System.out.println("Ŭ���̾�Ʈ�� �����߽��ϴ�...");
			// ����� �������κ��� �����͸� �о���� ���� �Է½�Ʈ����ü ������

			InputStream in = socket.getInputStream();
			// ����ȼ������κ��� ���۵� �����͸� �о�� b�迭�� �����ϱ�
			byte[] b = new byte[512];
			int n = in.read(b);
			// �迭�� String���� �����ϱ�
			String s = new String(b, 0, n);
			// �����̺����� �޼��� ����ϱ�
			System.out.println(s);
			// �������
			in.close();
			socket.close();
			server.close();

		} catch (IOException e) {
			e.getStackTrace();
		}

	}
}
