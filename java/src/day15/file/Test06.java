package day15.file;

import java.io.File;

public class Test06 {
	public static void main(String[] args) {
		File f = new File("D:\\hta_JAVA\\aa");
		if (removeDir(f)) {
			System.out.println("������������");
		} else {
			System.out.println("������������");
		}
	}

	public static boolean removeDir(File f) {
		File[] list = f.listFiles();
		// �ڽ� ������ ���� ���� ���丮 ����
		for (File f1 : list) {
			if (f1.isFile()) {// �����̸� ����
				f1.delete();
			} else {// �����̸� ���͸޼ҵ�ȣ���ؼ� �������� ��� ����
				removeDir(f1);
			}
		}
		return f.delete();// �ڽ����� ����
	}
}