package day15.file;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

/*
 * 1. 디렉토리 명을 입력받아 해당 디렉토리의 파일목록이 보여지도록 해보세요
 * 2. 읽어올 파일명 입력받아(텍스트파일명) 파일내용을 화면에 출력해보세요
 * 원하는 디렉토리 입력: c:\java
 * eclipse.ziq
 * ...
 */
public class Test03_Quiz {
	public static void main(String[] args) {
		BufferedReader bf = null;
		Scanner sc = new Scanner(System.in);
		System.out.print("디렉토리 명을 입력하세요: ");
		String path = sc.next();
		File f = new File(path);
		if (f.exists()) {
			String[] a = f.list();
			for (String s : a) {
				System.out.println(s);
			}
			System.out.println("원하는 파일명을 입력하세요: ");
			String fileName = sc.next();
			File inner = new File(f.getAbsoluteFile() + "\\" + fileName);
			try {
				bf = new BufferedReader(new FileReader(inner));
				while (bf.ready()) {
					System.out.println(bf.readLine());
				}
				System.out.println("출력완료되었습니다.");
			} catch (FileNotFoundException e) {
				e.printStackTrace();
				System.out.println("해당 파일을 찾을 수 없습니다.");
			} catch (IOException e) {
				e.printStackTrace();
			}
		} else {
			System.out.println("해당디렉토리가 존재하지 않습니다.");
		}
	}
}
