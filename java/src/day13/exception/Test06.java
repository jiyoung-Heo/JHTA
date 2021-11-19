package day13.exception;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * - �ڹٿ��� �ΰ��� ������ exception�� �ִ�.
 * 1) ChechedException
 *   - RuntimeException�� ��ӹ��� ���� ����Ŭ����
 *   - �ݵ�� try~catch���� ����ó���� �ؾ� �ϸ� ����ó���� ���� ������ �����Ͻÿ� ������ �߻��ȴ�.
 *   ��) IOException, SQLException,..
 * 2) UnCheckedException
 *   - RuntimeException�� ��ӹ��� ���� Ŭ����
 *   - try~catch���� ����ó���� ���� �ʾƵ� �����Ͻ� ������ �߻����� ������ ���α׷��Ӱ� ���������� ����ó���� �Ѵ�.
 *   ��) NumberFormatException, ArithemeticException,...
 */
public class Test06 {
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("�� ������ �Է��ϼ���");
		// public String readline() throws IOException
		try {
			String line = br.readLine();
			System.out.println("�Էµ� ����: " + line);

		} catch (IOException e) {
			System.out.println("�����Դϴ�. �ٽ� �Է��ϼ���");
			System.out.println("��������: " + e.getMessage());
		}
	}
}
