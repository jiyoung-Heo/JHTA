package day13.homework;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Home02 {
	public static void main(String[] args) {
		try {
			// test.txt������ ���� �� �ִ� FileReader��ü�� �����.
			FileReader fr = new FileReader("test.txt");
			// upper_test.txt���Ͽ� �빮�ڸ� �־� �� FileWriter��ü�� �����.
			FileWriter fw = new FileWriter("upper_test.txt");
			while (true) {
				// test.txt���� ��ü�� fr�� �� character�� �о a�� �־��ش�.
				int a = fr.read();
				// ���� a�� -1(�� ������ ���� �� ������ �����)�̸� �о���°� �������ش�.
				if (a == -1) {
					break;
				}
				// ���� ����� a���� �ҹ��ڶ�� �빮�ڰ����� ��ȯ���ش�.(�ƽ�Ű�ڵ�� �ҹ��ڿ��� 32�� ���� �ش�빮�ڰ��̴�.)
				if ('a' <= a && 'z' >= a) {
					fw.write((char) (a - 32));
				} else {
					fw.write((char) a);
				}
			}
			// ������ �Ϸ�Ǹ� FileReader��ü�� FileWriter��ü�� �ݾ��ش�.
			fr.close();
			fw.close();
			// ����ó��
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}

	}
}
//2. ���α׷��� �����ϸ� test.txt������ ��� ������ �빮�ڷ� 
//��ȯ�� upper_test.txt���Ͽ� ����ǵ��� ����� ������.
//## test.txt
//hello!
//my name is hong gil dong.
//
//==> ���α׷� ������ upper_test.txt���Ͽ� �Ʒ�ó�� ����ȴ�.
//HELLO!
//MY NAME IS HONG GIL DONG.