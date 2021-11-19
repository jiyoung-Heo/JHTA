package day14.homework;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Home02withTS {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Map<String, String> map = new HashMap<>();
		try (BufferedReader br = new BufferedReader(new FileReader("eng.txt"))) {
			// �б�
			String line = "";
			while ((line = br.readLine()) != null) {
				String[] spl = line.split(",");
				map.put(spl[0], spl[1]);
			}

			// ã��
			while (true) {
				System.out.println("����ܾ �Է��ϼ���. ����:0");
				String read = sc.next();
				String value = map.get(read);

				if (read.equals("0")) {
					System.out.println("�����մϴ�.");
				}

				if (value == null) {
					System.out.println("�ش��ϴ� �ܾ �����ϴ�.");
				} else {
					System.out.println(read + "�� ��: " + value);
				}

			}
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
		sc.close();
	}
}

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