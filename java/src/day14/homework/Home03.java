package day14.homework;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

//3. �л���ȣ,�̸�,���������Է¹޾� ��������ؼ� DataOutputStream�̿��ؼ� ���Ϸ� �����ϼ���.
//(���Ͽ� �л���ȣ,�̸�,����,��������)
public class Home03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			// stu.data�� �Է¹������� �����ϱ����� dos��ü�� �����Ѵ�.
			DataOutputStream dos = new DataOutputStream(new FileOutputStream("stu.data"));
			while (true) {
				System.out.println("�л���ȣ�� �Է��ϼ���. 0�� �Է��ϸ� ����˴ϴ�.");
				// �л��� ��ȣ�� �Է¹޴´�.
				int num = sc.nextInt();
				// ���� �Է¹��� �л���ȣ�� 0�̶�� while���� ����������.
				if (num == 0) {
					break;
				}
				System.out.println("�̸��� �Է��ϼ���");
				// �̸��� �Է¹޴´�.
				String name = sc.next();
				// ���������� �Է¹޴´�.
				System.out.println("���������� �Է��ϼ���");
				int kor = sc.nextInt();
				// grade ���� �ʱ�ȭ�����ش�.
				char grade = ' ';
				// �Է¹��� ���������� 90�� �̻��̸� A , 80~89�� B, 70~79�� C�� ����� charŸ�� grade�� �������ش�.
				if (kor >= 90) {
					grade = 'A';
				} else if (kor >= 80 && kor < 90) {
					grade = 'B';
				} else if (kor >= 70 && kor < 80) {
					grade = 'C';
				} else {
					grade = 'D';
				}
				// stu.data�� intŸ��ũ���� ������ num�� ���ְ�, StringŸ��ũ���� ������ name��, charŸ�� ũ���ǰ����� grade��
				// ����.
				dos.writeInt(num);
				dos.writeUTF(name);
				dos.writeInt(kor);
				dos.writeChar(grade);
			}
			// �ݱ�
			dos.close();
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}
}
