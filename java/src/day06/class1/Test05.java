package day06.class1;

import java.util.Scanner;

class Font {
	private String fontName;// 글꼴체
	private int fontSize;// 글꼴크기

	public Font() {
		fontName = "궁서";
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
		System.out.println("글꼴체: " + fontName);
		System.out.println("글꼴크기: " + fontSize);
		System.out.println("위의 설정된 경로로 [" + text + "]를 출력합니다.");
	}
}

public class Test05 {
	public static void main(String[] args) {
		// font 객체를 생성하고 font 정보를 설정 후 (글꼴체, 글꼴크기) text가 출력되도록 해보세요
//		Font ft = new Font();
		Scanner sc = new Scanner(System.in);
//		System.out.println("입력하세요");
		Font f1 = new Font("궁서체", 20);
//		ft.setFontName(sc.next());
//		ft.setFontSize(sc.nextInt());
		f1.printInfo("안녕 자바!");
	}
}
