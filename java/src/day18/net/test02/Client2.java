package day18.net.test02;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

//Ŭ���̾�Ʈ ���α׷�
public class Client2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
//			Socket socket = new Socket("127.0.0.1", 3001);
			Socket socket = new Socket("localhost", 3001);
			System.out.println("������ ���� ����!");
			System.out.print("������ ���� �޼��� �Է�>>");
			String msg = sc.next();
			// printwriter���
			PrintWriter pw = new PrintWriter(socket.getOutputStream());
			// �ڵ� �÷���
//			PrintWriter pw = new PrintWriter(socket.getOutputStream(),true);
			pw.println(msg);
			pw.flush();
			System.out.println("������ �޼��� ������ �Ϸ�");

//			outputsteam���
//			OutputStream out = socket.getOutputStream();
//			out.write(msg.getBytes());
//			out.flush();
//			System.out.println("������ �޼��� ���ۿϷ�");
//			socket.close();

		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}
}