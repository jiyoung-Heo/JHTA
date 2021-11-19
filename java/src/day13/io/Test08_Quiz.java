package day13.io;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/*
 * �������ϸ�� ����� ���ϸ��� �Է¹޾� ���Ϻ����ϴ� ���α׷��� �ۼ��غ�����
 * ��)
 * �������ϸ��Է� hello.txt
 * ��������ϸ��Է� copy.txt
 * -->hello.txt������ ������ ����� copy.txt���� ����
 * FileReader, FileWriter ���
 */
public class Test08_Quiz {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("���� ���ϸ�");
		String ofg = sc.nextLine();
		System.out.println("����� ���ϸ�");
		String copy = sc.nextLine();
		try {
			// �Է¹��� ���ϸ��� FileReader��ü�� �����Ѵ�.
			FileReader fr = new FileReader(ofg);
			// �Է¹��� ���ϸ��� FileWriter��ü�� �����Ѵ�.
			FileWriter fw = new FileWriter(copy);
			while (true) {
				// fr�� �� character�� �о a�� �־��ش�.
				int a = fr.read();
				// ���� a�� -1(�� ������ ���� �� ������ �����)�̸� �о���°� �������ش�.
				if (a == -1) {
					break;
				}
				// fw�� �о�� a���� �������ش�.(����)
				fw.write((char) a);
			}
			// ������ �Ϸ�Ǹ� FileReader��ü�� FileWriter��ü�� �ݾ��ش�.
			fr.close();
			fw.close();
			System.out.println("����Ϸ�!");
			// ����ó��
		} catch (FileNotFoundException e) {
			System.out.println("������ �������� �ʽ��ϴ�");
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}

	}
}
