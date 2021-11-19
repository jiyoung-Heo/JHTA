package day13.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

/*
 * ���Ϻ��� ���α׷��� �Է��ϼ���
 */
public class Test09_Quiz {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("�������ϸ� �Է��ϼ���");
		String ori = sc.next();
		System.out.println("��������ϸ� �Է��ϼ���");
		String copy = sc.next();
		try {
			FileInputStream fis = new FileInputStream(ori);
			FileOutputStream fos = new FileOutputStream(copy);
			while (true) {
				int a = fis.read();
				if (a == -1) {
					break;
				}
				fos.write((char) a);
			}
			fis.close();
			fos.close();

		} catch (FileNotFoundException e) {
			System.out.println("���ϸ��� ��ġ���� �ʽ��ϴ�.");
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}
}
