package day18.net.test05;

import java.io.DataInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/*
 * �����������α׷������
 * 1. ����
 * - Ŭ���̾�Ʈ�� ������ ������ ������ �����Ѵ�.
 * 2. Ŭ���̾�Ʈ
 * - ������ ������ ������.
 */
public class Server5_CopyFile_Self {
	public static void main(String[] args) {
		try {
			ServerSocket server = new ServerSocket(5001);
			System.out.println("������ ���Ƚ��ϴ�...");
			Socket socket = server.accept();
			System.out.println("Ŭ���̾�Ʈ�� �����߽��ϴ�...");
			DataInputStream dis = new DataInputStream(socket.getInputStream());
			String filename = dis.readUTF();
			String uploadPath = "c:\\upload";
			File serverFile = new File(uploadPath);
			if (serverFile.exists() == false) {
				serverFile.mkdirs();
			}
			FileOutputStream fos = new FileOutputStream(uploadPath + "\\" + filename);
			byte[] sep = new byte[1024];
			while (true) {
				int n = dis.read(sep);
				if (n == -1) {
					break;
				}
				fos.write(sep, 0, n);
			}
			dis.close();
			fos.close();
			socket.close();
			System.out.println("�������� �Ϸ�!");
			server.close();
		} catch (IOException e) {
			e.getStackTrace();
			System.out.println(e.getMessage());
		}
	}
}
