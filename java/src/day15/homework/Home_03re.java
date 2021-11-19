package day15.homework;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
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
public class Home_03re {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("������ ������ �Է��ϼ���");
		String ori = sc.next();
		System.out.println("����� ������ �Է��ϼ���");
		String dest = sc.next();
		File orif = new File(ori);
		File destf = new File(dest);
		Home_03re make = new Home_03re();
		destf.mkdir();
		make.copy(orif, destf);
	}

	public void copy(File orif, File destf) {
		File[] orin = orif.listFiles();
		for (File file : orif.listFiles()) {
			if (file.isDirectory()) {
				File newdest = new File(destf + "\\" + file.getName());
				newdest.mkdir();
				copy(file, newdest);
			} else {
				// ������. �����ϱ�
				try {
					BufferedReader br = new BufferedReader(new FileReader(file));
					BufferedWriter bw = new BufferedWriter(new FileWriter(destf + "\\" + file.getName()));
//					PrintWriter pw = new PrintWriter(destf + "\\" + file.getName());
//					char[] cha = new char[1024];
//					int re = 0;
//					if ((re = br.read(cha)) != -1) {
//						String a = new String(cha, 0, re);
//						pw.println(a);
//					}

					char[] cha = new char[1024];
					int re = 0;
					if ((re = br.read(cha)) != -1) {
						bw.write(cha, 0, re);
					}
					br.close();
					bw.close();
				} catch (FileNotFoundException e) {
					e.printStackTrace();
				} catch (IOException e) {
					e.printStackTrace();
				}

			}
		}
	}
}
