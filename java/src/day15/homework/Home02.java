package day15.homework;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

//2. ���Ͽ� ����� ��� ȸ�������� �о�� ȭ�鿡 ����ϱ�
public class Home02 {
	public static void main(String[] args) {
		try {
			// br��ü ����
			BufferedReader br = new BufferedReader(new FileReader("D:\\hta_JAVA\\bb\\hi.txt"));
			// br�� ������ �� ������
			while (br.ready()) {
				// readLine ���ش�.
				System.out.println(br.readLine());
			}
			// ����ó��
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
