package day18.net.test03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

/*
 * ���� ���α׷�
 * - Ŭ���̾�Ʈ�� �����ϸ� �޼��� ������
 * - Ŭ���̾�Ʈ�� ������ �޼��� ���
 * Ŭ���̾�Ʈ ���α׷�
 * - �������� ������ �޼��� ����ϰ� �������� �޼��� ������
 */
public class Test03_Quiz {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ServerSocket server = null;
		try {
			server = new ServerSocket(4000);
			System.out.println("������ ���Ƚ��ϴ�.(��������)");
			Socket socket = server.accept();
			System.out.println("Ŭ���̾�Ʈ�� ����Ǿ����ϴ�.");
			// Ŭ���̾�Ʈ�� �޼����� ������ ���� ��Ʈ��
			PrintWriter go = new PrintWriter(socket.getOutputStream());
			// Ŭ���̾�Ʈ�� �޼��� ������
			System.out.print("Ŭ���̾�Ʈ�� ���� �޼����� �Է��ϼ���: ");
			String msg = sc.next();
			go.println(msg);
			go.flush();

			// Ŭ���̾�Ʈ���� ���� �޼����� �ޱ� ���� ��Ʈ��
			BufferedReader read = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			// Ŭ���̾�Ʈ���� �޼��� �ޱ�
			String in = read.readLine();
			System.out.println("Ŭ���̾�Ʈ���� ������ �޼���>>" + in);

			server.close();
			socket.close();
			go.close();
			read.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
