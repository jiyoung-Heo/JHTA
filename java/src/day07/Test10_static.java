package day07;

public class Test10_static {
	public static void main(String[] args) {
		MyBook mb1 = new MyBook("java1", 5);
		mb1.printInfo();
		System.out.println("ÃÑÆÇ¸Å°¹¼ö: " + MyBook.getTotCnt());
		MyBook mb2 = new MyBook("jsp", 10);
		mb2.printInfo();
		System.out.println("ÃÑÆÇ¸Å°¹¼ö: " + MyBook.getTotCnt());
	}
}

class MyBook {
	private String title;// µµ¼­Á¦¸ñ
	private int cnt;// ÆÇ¸Å°¹¼ö
	private static int totCnt;// µµ¼­ ÃÑÆÇ¸Å°¹¼ö

	public MyBook(String title, int cnt) {
		this.title = title;
		this.cnt = cnt;
		totCnt += cnt;
	}

	public static int getTotCnt() {
		return totCnt;
	}

	public void printInfo() {
		System.out.println("µµ¼­¸í: " + title);
		System.out.println("ÆÇ¸Å°¹¼ö: " + cnt);
	}
}