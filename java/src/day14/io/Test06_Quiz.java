package day14.io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/*
 * 키보드로 학생번호, 국어, 영어점수를 입력받아 student.txt파일로 저장하세요
 * 입력데이터는 3명
 * printwriter
 * ## student.txt
 * 1,100,100
 * 2,80,90
 * 3,50,70
 * 2. student.txt파일에 저장된 학생정보를 읽어와서 총점, 평균 구해서 화면에 출력해보세요
 */
public class Test06_Quiz {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int allSum = 0;
		try {
			BufferedReader br = new BufferedReader(new FileReader("student.txt"));
			PrintWriter pw = new PrintWriter("student.txt");
			for (int i = 0; i < 3; i++) {
				System.out.println("학생번호를 입력하세요");
				int stu = sc.nextInt();
				System.out.println("국어점수를 입력하세요");
				int kor = sc.nextInt();
				System.out.println("영어점수를 입력하세요");
				int eng = sc.nextInt();
				pw.println(stu + "," + kor + "," + eng);
			}
			pw.close();
			System.out.println("파일로 생성완료!");
			while (true) {
				String line = br.readLine();
				if (line == null) {
					break;
				}
				String[] stu = line.split(",");
//				System.out.println(line);
				for (int i = 0; i < stu.length; i++) {
					System.out.print(stu[i] + " ");
				}
				int sum = Integer.parseInt(stu[1]) + Integer.parseInt(stu[2]);
				System.out.println("총점: " + sum + ", 평균: " + sum / 2.0);
				allSum += sum;
			}
			System.out.println("전체합계: " + allSum);
			System.out.println("전체평균: " + allSum / 6.0);
			br.close();
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}

	}
}
