package day15.file;

import java.io.File;

public class Test01_File {
	public static void main(String[] args) {
		File f = new File("D:\\hta_JAVA\\aa");
		if (f.exists()) {
			System.out.println("�����ϴ� ���丮�Դϴ�..");
			if (f.delete()) {
				f.delete();
				System.out.println("������������");
			} else {
				System.out.println("������������");// �����ȿ������������� �������� �����Ѵ�.
			}
		} else {
			f.mkdirs();// ���丮�����
			System.out.println("������ �����Ǿ����ϴ�.");
		}
//		File f1 = new File("D:\\hta_JAVA\\�ڷ�\\eclipse-jee-2020-12-R-win32-x86_64.zip");
//		long filesize = f1.length();// ����ũ�ⱸ�ϱ�
//		System.out.println(f1.getName() + "������ ũ��, " + filesize + "bytes");
	}
}
