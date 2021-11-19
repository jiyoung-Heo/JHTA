package day15.homework;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

//3. 디렉토리 복사하는 프로그램을 작성하기(조금 어려워요..)
//예)
//복사할 폴더
//c:\java
//복사본 폴더
//c:\java_copy
//java폴더가 java_copy폴더에 복사됨 
public class Home_03re {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("복사할 폴더를 입력하세요");
		String ori = sc.next();
		System.out.println("복사될 폴더를 입력하세요");
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
				// 파일임. 복사하기
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
