package day18.net.test05;

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

public class Client5_CopyFile_Self {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			Socket socket = new Socket("localhost", 5001);
			System.out.println("������ ���ٿϷ��߽��ϴ�...");
			System.out.print("���� ���� ���丮 �Է�: ");
			String ori = sc.next();
			File reuse = new File(ori);
			if (reuse.exists() == false) {
				System.out.println("�߸��� ���� ����Դϴ�.");
			}
			DataOutputStream dos = new DataOutputStream(socket.getOutputStream());
			dos.writeUTF(reuse.getName());
			dos.flush();
			FileInputStream fis = new FileInputStream(ori);
			byte[] sep = new byte[1024];
			while (true) {
				int n = fis.read(sep);
				if (n == -1) {
					break;
				}
				dos.write(sep, 0, n);
			}
			dos.close();
			fis.close();
			socket.close();
			System.out.println("�������ۿϷ�");
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}

	}
}
