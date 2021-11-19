package day14.io;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

/*
 * 1. 키보드로 학생번호, 국어, 영어점수를 입력받아 student.data파일로 저장하세요
 * 2. student.data파일에 저장된 학생정보를 읽어와서 총점, 평균 구해서 화면에 출력해보세요
 * -->
 */
public class Test11_Quiz {

	public static void main(String[] args) {
		DataInputStream dis = null;
		Scanner sc = new Scanner(System.in);
		try {
			DataOutputStream dos = new DataOutputStream(new FileOutputStream("student.data"));
			dis = new DataInputStream(new FileInputStream("student.data"));
			for (int i = 0; i < 3; i++) {
				System.out.println("학생번호를 입력하세요");
				int num = sc.nextInt();
				System.out.println("국어점수를 입력하세요");
				int kor = sc.nextInt();
				System.out.println("영어점수를 입력하세요");
				int eng = sc.nextInt();
				dos.writeInt(num);
				dos.writeInt(kor);
				dos.writeInt(eng);
			}
			dos.close();
			System.out.println("저장완료!\n");
			int resultnum = 0;
			int resultkor = 0;
			int resulteng = 0;

			for (;;) {
				resultnum = dis.readInt();
				resultkor = dis.readInt();
				resulteng = dis.readInt();
				int sum = resultkor + resulteng;
				System.out.println(resultnum + "학생의 점수");
				System.out.println("총점: " + sum + "평균: " + sum / 2.0);
			}
//			while (true) {
//				resultnum = dis.readInt();
//				resultkor = dis.readInt();
//				resulteng = dis.readInt();
//				if (resultnum == 0) {
//					break;
//				}
//				int sum = resultkor + resulteng;
//				System.out.println(resultnum + "학생의 점수");
//				System.out.println("총점: " + sum + "평균: " + sum / 2.0);
//			}

//			dis.close();
		} catch (EOFException e) {
			System.out.println("파일읽기 완료");
			try {
				if (dis != null)
					dis.close();

			} catch (IOException e2) {
				System.out.println(e2.getMessage());
			}
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}
}
