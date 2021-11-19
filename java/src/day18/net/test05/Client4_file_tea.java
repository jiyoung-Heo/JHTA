package day18.net.test05;

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

public class Client4_file_tea {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		try {
			Socket socket = new Socket("localhost", 4000);
			System.out.println("�������Ӽ���!");
			System.out.println("���� ���ϸ� �Է�");
			String file = scan.nextLine();
			// c:\\java\\a.jpg
			File f = new File(file);
			if (!f.exists()) {
				System.out.println("�������� �ʴ� �����Դϴ�..");
				return;
			}
			// Ŭ���̾�Ʈ�� ������ �����ϱ� ���� ��Ʈ����ü ����
			DataOutputStream dos = new DataOutputStream(socket.getOutputStream());
			// ���� ���� ���ϸ� ������ ������
			dos.writeUTF(f.getName());
			dos.flush();
			// ���Ͽ��� ������ �о�� ������
			FileInputStream fis = new FileInputStream(f);
			byte[] b = new byte[1000];
			while (true) {
				int n = fis.read(b);
				if (n == -1)
					break;
				dos.write(b, 0, n);
			}
			fis.close();
			dos.close();
			socket.close();
			System.out.println("�������ۿϷ�!");
		} catch (IOException ie) {
			System.out.println(ie.getMessage());
		}
	}
}
