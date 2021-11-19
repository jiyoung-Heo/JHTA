package day18.net.test03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class Test03_Quiz_Client {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Socket socket = null;
		try {
			socket = new Socket("localhost", 4000);
			System.out.println("...������ ���� ����...");
			// �������� ���� �޼����� �ޱ����� ��Ʈ��
			BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			// �������� �޼��� �ޱ�
			String in = br.readLine();
			System.out.println("�������� ������ �޼���>>>" + in);

			// ������ �޼����� ���������� ��Ʈ��
			PrintWriter rego = new PrintWriter(socket.getOutputStream());
			// ������ �޼��� ������
			System.out.print("������ ���� �޼����� �Է��ϼ���: ");
			String out = sc.next();
			rego.println(out);
			rego.flush();
			System.out.println("������ ������ ���� �Ϸ�~");

			socket.close();
			br.close();
			rego.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
