package day06.class1;

import java.util.Scanner;

class Font {
	private String fontName;// �۲�ü
	private int fontSize;// �۲�ũ��

	public Font() {
		fontName = "�ü�";
		fontSize = 12;
	}

	public Font(String fontName, int fontSize) {
		this.fontName = fontName;
		this.fontSize = fontSize;
	}

	public void setFontName(String fontName) {
		this.fontName = fontName;
	}

	public void setFontSize(int fontSize) {
		this.fontSize = fontSize;
	}

	public void printInfo(String text) {
		System.out.println("�۲�ü: " + fontName);
		System.out.println("�۲�ũ��: " + fontSize);
		System.out.println("���� ������ ��η� [" + text + "]�� ����մϴ�.");
	}
}

public class Test05 {
	public static void main(String[] args) {
		// font ��ü�� �����ϰ� font ������ ���� �� (�۲�ü, �۲�ũ��) text�� ��µǵ��� �غ�����
//		Font ft = new Font();
		Scanner sc = new Scanner(System.in);
//		System.out.println("�Է��ϼ���");
		Font f1 = new Font("�ü�ü", 20);
//		ft.setFontName(sc.next());
//		ft.setFontSize(sc.nextInt());
		f1.printInfo("�ȳ� �ڹ�!");
	}
}
