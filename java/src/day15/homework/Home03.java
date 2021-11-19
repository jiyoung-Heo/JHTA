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
public class Home03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("������ ���丮�� �Է��ϼ���");
		String oriDir = sc.next();
		System.out.println("����� ���丮�� �Է��ϼ���");
		String finDir = sc.next();
//		File ori = new File("D:\\hta_JAVA\\bb");
//		File dest = new File("D:\\hta_JAVA\\bb2");
		File ori = new File(oriDir);
		File dest = new File(finDir);
		dest.mkdir();
		Home03 t = new Home03();
		t.copy(ori, dest);
	}

	public void copy(File ori, File dest) {
		for (File file : ori.listFiles()) {
			if (file.isDirectory()) {
				File newdir = new File(dest + "\\" + file.getName());
				newdir.mkdir();
				copy(file, newdir);

			} else {
				try {
					BufferedReader br = new BufferedReader(new FileReader(file));
					BufferedWriter bw = new BufferedWriter(new FileWriter(dest + "\\" + file.getName()));
					while (br.ready()) {
						String write = br.readLine();
						bw.write(write);
						bw.write("\n");
					}
					bw.close();
					br.close();
				} catch (IOException e) {
					System.out.println(e.getMessage());
				}
			}
		}

	}
}