package day18.net.test01;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

/*
 * [Ŭ���̾�Ʈ ���α׷�]
 * 1. ���������ϱ�(Socket��ü - ���� ip�ּ�, prot��ȣ)
 * 2. Socket��ü�� ���� ������ �ְ�ޱ�(io��Ʈ�� ���)
 * 3. ��������(���ϴݱ�)
 */
public class Client1 {
	public static void main(String[] args) {
		Socket socket = null;
		try {
			socket = new Socket("192.168.0.19", 3000);
			System.out.println("������ ���Ӽ���!");

			String msg = "�ݰ����� ����~";
			OutputStream out = socket.getOutputStream();
			out.write(msg.getBytes());
			out.flush();
			System.out.println("������ �޼��� ���ۿϷ�");
			socket.close();

		} catch (UnknownHostException e) {
			System.out.println(e.getMessage());
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}
}
