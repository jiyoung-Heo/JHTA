package day14.io;

import java.io.FileOutputStream;
import java.io.PrintWriter;

public class Test05_PrintWriter {
	public static void main(String[] args) throws Exception {
		// public PrintWriter(OUtputStream out)
//		PrintWriter pw = new PrintWriter(System.out);
//		pw.println("�ȳ��ϼ���");
//		pw.println("�ݰ����ϴ�");
//		pw.close();
		PrintWriter pw = new PrintWriter(new FileOutputStream("hello.txt"));
		pw.println("�ȳ��ϼ���");
		pw.println("�ݰ����ϴ�");
		pw.close();
	}
}
