package day14.io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/*
 * Ű����� �л���ȣ, ����, ���������� �Է¹޾� student.txt���Ϸ� �����ϼ���
 * �Էµ����ʹ� 3��
 * printwriter
 * ## student.txt
 * 1,100,100
 * 2,80,90
 * 3,50,70
 * 2. student.txt���Ͽ� ����� �л������� �о�ͼ� ����, ��� ���ؼ� ȭ�鿡 ����غ�����
 */
public class Test06_Quiz {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int allSum = 0;
		try {
			BufferedReader br = new BufferedReader(new FileReader("student.txt"));
			PrintWriter pw = new PrintWriter("student.txt");
			for (int i = 0; i < 3; i++) {
				System.out.println("�л���ȣ�� �Է��ϼ���");
				int stu = sc.nextInt();
				System.out.println("���������� �Է��ϼ���");
				int kor = sc.nextInt();
				System.out.println("���������� �Է��ϼ���");
				int eng = sc.nextInt();
				pw.println(stu + "," + kor + "," + eng);
			}
			pw.close();
			System.out.println("���Ϸ� �����Ϸ�!");
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
				System.out.println("����: " + sum + ", ���: " + sum / 2.0);
				allSum += sum;
			}
			System.out.println("��ü�հ�: " + allSum);
			System.out.println("��ü���: " + allSum / 6.0);
			br.close();
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}

	}
}
