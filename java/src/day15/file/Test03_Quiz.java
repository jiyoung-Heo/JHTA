package day15.file;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

/*
 * 1. ���丮 ���� �Է¹޾� �ش� ���丮�� ���ϸ���� ���������� �غ�����
 * 2. �о�� ���ϸ� �Է¹޾�(�ؽ�Ʈ���ϸ�) ���ϳ����� ȭ�鿡 ����غ�����
 * ���ϴ� ���丮 �Է�: c:\java
 * eclipse.ziq
 * ...
 */
public class Test03_Quiz {
	public static void main(String[] args) {
		BufferedReader bf = null;
		Scanner sc = new Scanner(System.in);
		System.out.print("���丮 ���� �Է��ϼ���: ");
		String path = sc.next();
		File f = new File(path);
		if (f.exists()) {
			String[] a = f.list();
			for (String s : a) {
				System.out.println(s);
			}
			System.out.println("���ϴ� ���ϸ��� �Է��ϼ���: ");
			String fileName = sc.next();
			File inner = new File(f.getAbsoluteFile() + "\\" + fileName);
			try {
				bf = new BufferedReader(new FileReader(inner));
				while (bf.ready()) {
					System.out.println(bf.readLine());
				}
				System.out.println("��¿Ϸ�Ǿ����ϴ�.");
			} catch (FileNotFoundException e) {
				e.printStackTrace();
				System.out.println("�ش� ������ ã�� �� �����ϴ�.");
			} catch (IOException e) {
				e.printStackTrace();
			}
		} else {
			System.out.println("�ش���丮�� �������� �ʽ��ϴ�.");
		}
	}
}
