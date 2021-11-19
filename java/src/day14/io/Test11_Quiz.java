package day14.io;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

/*
 * 1. Ű����� �л���ȣ, ����, ���������� �Է¹޾� student.data���Ϸ� �����ϼ���
 * 2. student.data���Ͽ� ����� �л������� �о�ͼ� ����, ��� ���ؼ� ȭ�鿡 ����غ�����
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
				System.out.println("�л���ȣ�� �Է��ϼ���");
				int num = sc.nextInt();
				System.out.println("���������� �Է��ϼ���");
				int kor = sc.nextInt();
				System.out.println("���������� �Է��ϼ���");
				int eng = sc.nextInt();
				dos.writeInt(num);
				dos.writeInt(kor);
				dos.writeInt(eng);
			}
			dos.close();
			System.out.println("����Ϸ�!\n");
			int resultnum = 0;
			int resultkor = 0;
			int resulteng = 0;

			for (;;) {
				resultnum = dis.readInt();
				resultkor = dis.readInt();
				resulteng = dis.readInt();
				int sum = resultkor + resulteng;
				System.out.println(resultnum + "�л��� ����");
				System.out.println("����: " + sum + "���: " + sum / 2.0);
			}
//			while (true) {
//				resultnum = dis.readInt();
//				resultkor = dis.readInt();
//				resulteng = dis.readInt();
//				if (resultnum == 0) {
//					break;
//				}
//				int sum = resultkor + resulteng;
//				System.out.println(resultnum + "�л��� ����");
//				System.out.println("����: " + sum + "���: " + sum / 2.0);
//			}

//			dis.close();
		} catch (EOFException e) {
			System.out.println("�����б� �Ϸ�");
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
