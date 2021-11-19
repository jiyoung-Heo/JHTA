package day15.homework;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

//3. ���丮 �����ϴ� ���α׷��� �ۼ��ϱ�(���� �������..)
//��)
//������ ����
//c:\java
//���纻 ����
//c:\java_copy
//java������ java_copy������ ����� 
public class Home4 {
	public static void main(String[] args) {
		// ������ ���丮�� ����� ���丮�� �Է¹޴´�.
		Scanner sc = new Scanner(System.in);
		System.out.println("������ ���丮�� �Է��ϼ���");
		String oriDir = sc.next();
		System.out.println("����� ���丮�� �Է��ϼ���");
		String finDir = sc.next();
//		File ori = new File("D:\\hta_JAVA\\bb");
//		File dest = new File("D:\\hta_JAVA\\bb2");
		// �Է¹��� ���丮�� ����Ŭ���� ��ü�� �������ش�.
		File ori = new File(oriDir);
		File dest = new File(finDir);
		// ������ ������� ���丮�� ������ش�.
		dest.mkdir();
		// static�� �ƴ�copy�޼ҵ带 �ҷ��������� ��ü�� �����Ѵ�.
		Home4 t = new Home4();
		// copy�޼ҵ带 ȣ���Ѵ�.
		t.copy(ori, dest);
	}

	public void copy(File ori, File dest) {
		// ori.listFiles()�� file�� ori.listfiles() �迭 ������� �־��ش�.
		for (File file : ori.listFiles()) {
			// ���࿡ file�� ���丮�� ���
			if (file.isDirectory()) {
				// ������ ���丮 ������ ������ ������ֱ����� newdir��ü�� ���� ������������ �Է��Ѵ�.
				File newdir = new File(dest + "\\" + file.getName());
				// newdir ���丮�� ������ش�.
				newdir.mkdir();
				// �������丮�� ���ε��丮���� ������ �ִٸ� ������ �߰����ִ� ��͸޼ҵ带 �����.
				// ��� �޼ҵ� ��) copy(file,newdir)�� ���� ����
				// ori.listfiles() �迭 �� 0��°�� �̾ƿ� file�� �Ű������� �����ߴ�.
				// ��͸޼ҵ尡 ����Ǹ� file.listFiles()�� ���ְ� �ǰ�
				// ori�� 0��° file�� .listFiles()�� ���� for���� ���۵ȴ�.
				// (���丮�� ������ ��� ��Ͱ� ���Ƽ� ���� ������ �ִ��� �˻��ϵ��� ®��)
				// �Ű����� newdir�� 45�ٿ��� ������� newdir ����Ŭ������ �����ͼ� ������θ� �߰���
				// ���ο� newdir ����Ŭ������ ������ְ� mkdir() ���ش�.
				// ��������� �������丮�� �����ϴ� ��� ������ ������丮�� ������ְԵȴ�.
				copy(file, newdir);
			} else {
				// ������ ���
				try (BufferedReader br = new BufferedReader(new FileReader(file));
						BufferedWriter bw = new BufferedWriter(new FileWriter(dest + "\\" + file.getName()));) {
					// char�迭�� �����.
					char[] cha = new char[1024];
					// br.read(cha)�� ���� �о�� �迭�� ���� ������ int re�� �ʱ�ȭ���ش�.
					int re = 0;
					// br�� ���� cha �迭�� text�� �о�´�.
					// ���� re==-1�̸� �� ������ ���°Ŵϱ� while���� Ż���Ų��.
					while ((re = br.read(cha)) != -1) {
						// cha�迭�� 0��°���� re��°������ ������ bw.write�� ���� �ۼ����ش�.
						bw.write(cha, 0, re);
					}
				} catch (IOException e) {
					System.out.println(e.getMessage());
				}
			}
		}

	}
}