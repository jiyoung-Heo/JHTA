package day13.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

/*
 * 파일복사 프로그램을 입력하세요
 */
public class Test09_Quiz {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("원본파일명 입력하세요");
		String ori = sc.next();
		System.out.println("복사될파일명 입력하세요");
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
			System.out.println("파일명이 일치하지 않습니다.");
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}
}
