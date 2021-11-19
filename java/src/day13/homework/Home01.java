package day13.homework;

import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

//1. �������� ���ڿ��� �Է¹޾� test.txt���Ϸ� �����ϴ� ���α׷��� �ۼ��� ������. 

public class Home01 {
	public static void main(String[] args) {
		// InputStream�� ���� ���ڿ��� �Է¹޴´�.
		InputStream in = System.in;
		// Reader��ü�� �������ش�.
		Reader r = new InputStreamReader(in);
		try {
			// home.txt������ ���� �� �ִ� FileReader��ü�� �����.
			FileWriter fw = new FileWriter("home.text");
			// ���ڿ��� ����� char �迭 ��ü cbuf�� �����.
			char[] cbuf = new char[100];
			// �������ڿ��� �Է¹޴´�.
			System.out.println("���� ���ڿ��� �Է��ϼ���");
			int eng = r.read(cbuf);
			// ���� ��� ���ڿ��� abc�ϰ�� cbuf�� ����Ȱ��� a,b,c,\r,\n�̴�.
			// ���� for���� eng-2��ŭ �ݺ��Ͽ� a,b,c���� ȣ��ǰ� �Ѵ�.
			/*
			 * <eng-2�� �� ����!!!!!!> r.read(cbuf) �� abc+ ���͸� ġ�� read�� �ް� �Ǵ� ���� a,b,c, �׸���
			 * �����̴�. ���ʹ� ������������ \n, �����쿡���� \r\n �̴�. �׷��� �о�� ���� �迭�� ó���ϸ�
			 * cbuf[0]=a,...cbuf[3]=\r, cbuf[4]=\n �̴�. cbuf[3]�� cbuf[4]�� if���� ������ ��������
			 * ���ϱ⶧���� fw�� �Էµ��� �ʰ� else�� ������ �Ǵµ� else�� ��� ��� �Է����ּ��䰡 ��µǹǷ� abc�� ����� �� ���
			 * �Է����ּ��䰡 ��µǰ� �ȴ�.(�̷��� ������ �ʱ� ���� -2�Ѵ�.) ���� cbuf[3],[4]�� ������ ���鸸 ���� �����༭ else��
			 * sysout�� ��µǴ°�츦 �����ؾ��Ѵ�. ���࿡ else�� �Ⱦ��� -2 ���ص� ���������� ����� �ȴ�~~!
			 */
			for (int j = 0; j < eng - 2; j++) {
				// ���� cbuf[j]���� ���ĺ��̰ų� ������ ��� fw��ü�� �ش� ĳ���͸� ���ش�.
				if (Character.isAlphabetic(cbuf[j]) || cbuf[j] == ' ') {
					fw.write(cbuf[j]);
					// ���� �ƴ϶�� ��� �Է��϶�� ����ϰ� �����Ѵ�.
				} else {
					System.out.println("��� �Է����ּ���.");
					break;
				}
			}
			// fw�� �����ִ� �������� �����ش�.
			fw.flush();
			// FileWriter��ü fw�� �ݾ��ش�.
			fw.close();
			// ����ó��
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}
}
