package day18.net.test05;

import java.io.DataInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/*
 * �����������α׷� �����
 * 
 * 1. ���� 
 *   - Ŭ���̾�Ʈ�� ������ ������ ������ �����Ѵ�.
 *   
 * 2. Ŭ���̾�Ʈ
 *   - ������ ������ ������.
 * 
 */
public class Server4_file_tea {
	public static void main(String[] args) {
		try {
			ServerSocket server = new ServerSocket(4000);
			System.out.println("��������.......");
			Socket socket = server.accept();
			System.out.println("Ŭ���̾�Ʈ ����!");
			DataInputStream dis = new DataInputStream(socket.getInputStream());
			// Ŭ���̾�Ʈ�� ���ϸ��� ������ ���� ���ϸ�
			String fileName = dis.readUTF();
			String uploadPath = "c:\\upload";
			File f = new File(uploadPath);
			if (!f.exists()) {// ���ε��� ���丮�� �������� ������
				f.mkdirs();// ���丮 �����ϱ�
			}
			// Ŭ���̾�Ʈ�� ������ ���ϸ�� ������ �̸����� ������ �����Ͽ� ���۵� ������ �����ϱ�
			FileOutputStream fos = new FileOutputStream(uploadPath + "\\" + fileName);
			byte[] b = new byte[1000];
			while (true) {
				// Ŭ���̾�Ʈ�� ������ �����͸� �о��
				int n = dis.read(b);
				if (n == -1)
					break;
				// ���Ͽ� �����ϱ�
				fos.write(b, 0, n);
			}
			fos.close();
			dis.close();
			socket.close();
			System.out.println("�������� �Ϸ�!");
			server.close();
		} catch (IOException ie) {
			System.out.println(ie.getMessage());
		}
	}
}
