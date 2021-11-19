package day14.homework;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

//1.����ܾ�� ���� Ű����� �Է¹޾� PrintWriter�� ����ؼ� ���Ϸ� ������ ������.
//## ���� eng.txt
//love,����ϴ�
//apple,���
//yellow,���
//
//"0"�Է��ϸ� ����
public class Home01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		PrintWriter pw = null;
		try {
			// PrintWriterŬ������ ��ü pw�� �������ش�.
			pw = new PrintWriter("eng.txt");
			while (true) {
				// �Է¹ޱ�(Scanner�� ���� �Է�)
				System.out.println("����ܾ �Է��ϼ���. 0�� �Է��ϸ� ����˴ϴ�.");
				// ���� �ܾ �Է� �޴´�.
				String eng = sc.next();
				// ���࿡ �Է¹��� �ܾ 0�̶�� ���Ͽ� �Է��ϴ°��� ������Ų��.
				if (eng.equals("0")) {
					System.out.println("�Է��� �����մϴ�.");
					// break�� ���� while���� �������� �Է��� ������.
					break;
				}
				System.out.println(eng + "�� ���� �Է��ϼ���");
				// ����ܾ��� ���� �Է¹޴´�.
				String kor = sc.next();

				// ���Ͽ� ����
				// �Է¹��� �ܾ�� ���� �ܾ�,�� �� ������ �����ش�. ln�̹Ƿ� ���� ����ó�� ����.
				pw.println(eng + "," + kor);
				pw.flush();
			}
		} catch (IOException e) {
			// ������ ��� ������ ��θ� �˷��ִ� �޼ҵ�
			e.printStackTrace();
			// �����޼�����½�Ű��
			System.out.println(e.getMessage());
		} finally {
			// ������ �߻��ϴ� ���ϴ� �����Ű�� finally�� ����
			// eng.txt�� ������� �������(������ ���������) pw��ü�� �ݾƼ� ���Ͽ� ���°��� ���������� ��������ش�.
			if (pw != null) {
				pw.close();
			}
		}
	}
}