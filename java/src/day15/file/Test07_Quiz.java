package day15.file;

import java.io.File;

// ������ ũ�⸦ ���� ������
public class Test07_Quiz {
	public static void main(String[] args) {
		File f = new File("C:\\����");
//		System.out.println(size(f));
		System.out.println("���丮ũ��: " + size(f) + "size");
	}

	public static long size(File f) {
		File[] list = f.listFiles();
		long sum = 0;
		for (File roop : list) {
			if (roop.isFile()) {
				sum += roop.length();
			} else {
				sum += size(roop);
			}
		}
		return sum;
	}
}
