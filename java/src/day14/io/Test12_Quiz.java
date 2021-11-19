package day14.io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

/*
 * Ű����� �о�� �ؽ�Ʈ���ϸ��� �Է¹޾� �ش� ������ ȭ�鿡 ����غ�����
 * ��) �ҷ������ϸ�
 * c:\java1\�Ƹ���.txt
 * [ȭ�鿡 ��µǴ� ����]
 * �Ƹ��� �Ƹ��� �ƶ󸮿�
 * �Ƹ��� ���� �Ѿ��...
 * ���� ������ ���ô� ����...
 */
public class Test12_Quiz {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("�ּҸ� �Է����ּ���");
		String arr = sc.next();
		try {
			BufferedReader br = new BufferedReader(new FileReader(arr));
			while (true) {
				String line = br.readLine();
				if (line == null) {
					break;
				}
				System.out.println(line);
			}
			br.close();
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}

	}
}
