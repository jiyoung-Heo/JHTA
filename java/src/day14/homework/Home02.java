package day14.homework;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

//2.�Ʒ��� ���� eng.txt������ ������ ������ �о�� �Ʒ��� ���� �۾��� 
//�̷�������� ���α׷��� �ۼ��� ������.
//## ���� eng.txt
//love,����ϴ�
//apple,���
//yellow,���
//....
//
//##���α׷�
//����ܾ�:apple
//apple�� ��:���
public class Home02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			// eng.txt.������ ���۸� ���� �о�� br��ü�� �����Ѵ�.
			BufferedReader br = new BufferedReader(new FileReader("eng.txt"));
			// �ϴ� line�� �ʱ�ȭ���ش�.
			String line = "";
			while (true) {
				// .ready(): �ڿ� �� �о��� �� �ִ�? booleanŸ�԰������ ������ �޼ҵ��̴�.
				while (br.ready()) {
					// ���� �ڿ� �� ������ ������ StringŸ���� .readLine���� ������ �޾ƿ´�.
					// �޾ƿͼ� line�� �߰����ش�.��)love,����Ѵ� �о����
					line += br.readLine();
					// line�� ,�� �߰����ش� --> ��������� love,����Ѵ�,apple,��� ... �̷������� line�� �����.
					line += ",";
				}
				// ���� �о�°� ��� line���� null�̸� while�� ������ ������ �Ѵ�.(�б�����)
				if (line == null) {
					break;
				}
				// ,�� �������� �߶� ������ spl�迭�� �־��ش�. �׷��� �ڸ��� �Ǹ�
				// 0,2,4...��° �迭�� ��� �������, �� 1���迭���� 0��°��� ���� ���� �������/ ==>¦���迭���� ����, Ȧ���迭���� ����
				// �ִ°�
				String[] spl = line.split(",");
				System.out.println("����ܾ �Է��ϼ���. ����:0");
				// �˻��� ����ܾ �Է¹޴´�.
				String read = sc.next();
				// ���� 0�� �ԷµǸ� �����Ų��.
				if (read.equals("0")) {
					System.out.println("�����մϴ�.");
					break;
				}
				// cnt���� �ʱ�ȭ���ش�.
				int cnt = 0;
				for (int i = 0; i < spl.length; i += 2) {
					// for������ 0,2,4...��° spl�迭�� ��(����� �����)�� �˻��� ����ܾ�� �����ش�.
					if (spl[i].equals(read)) {
						// ���� �����ϴٸ� spl[i+1](i��(����)�� ���� �� ����Ǿ��ִ°� �� ��½����ش�.
						System.out.println(read + "�� ��: " + spl[i + 1]);
						// ����̵Ǿ��ٸ� cnt�� �ϳ� �����ش�.
						cnt++;
						break;
					}
				}
				// ���� cnt�� �������� �ʾҴٸ� ��������ܾ �����ٴ� ���̹Ƿ� �ش� sysout���
				if (cnt == 0) {
					System.out.println("�ش��ϴ� �ܾ �����ϴ�.");
				}
			}
			// br ��� ����
			br.close();
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}
}
