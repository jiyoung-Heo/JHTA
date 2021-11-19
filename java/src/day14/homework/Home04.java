package day14.homework;

import java.io.DataInputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;

//4. ���Ͽ� ����� �л� ���������� ȭ�鿡 ����� ������.(DataInputStream ���)
public class Home04 {
	public static void main(String[] args) {
		DataInputStream dis = null;
		try {
			// stu.data�� ����ϱ����� ��ü dis�� �����.
			dis = new DataInputStream(new FileInputStream("stu.data"));
			// num, name, kor, grade ���� �ʱ�ȭ���ش�.
			int num = 0;
			String name = "";
			int kor = 0;
			char grade = 0;
			// for�� ���ѷ����� ���鼭 ��½����ٰŴ�
			for (;;) {
				// dis�� ���� stu.data�� �ִ� ���� intŸ��ũ�⸸ŭ �����ͼ� num�� �������ش�.
				num = dis.readInt();
				// dis�� ���� stu.data�� �ִ� ���� StringŸ��ũ�⸸ŭ �����ͼ� name�� �������ش�.
				name = dis.readUTF();
				// dis�� ���� kor�� �����Ѵ�.
				kor = dis.readInt();
				// dis�� ���� stu.data�� �ִ� ���� charŸ��ũ�⸸ŭ �����ͼ� grade�� �������ش�.
				grade = dis.readChar();
				// �������� ���Ͽ� ���ٷ� ������ش�.
				System.out.println("�л���ȣ:" + num + " �̸�:" + name + " ����:" + kor + "�� ����:" + grade);
			}
			// for������ ��� ������ �о���ٰ� ���̻� ������ ������ EOFException�� �߻��Ѵ�. ���� ����ó���� ������Ѵ�.
		} catch (EOFException e) {
			try {
				if (dis != null) {
					System.out.println("���� �� �о����");
					dis.close();
				}
			} catch (IOException e2) {
				System.out.println(e2.getMessage());
			}
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}
}
