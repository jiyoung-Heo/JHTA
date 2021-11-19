package day07;

public class Test10_static {
	public static void main(String[] args) {
		MyBook mb1 = new MyBook("java1", 5);
		mb1.printInfo();
		System.out.println("���ǸŰ���: " + MyBook.getTotCnt());
		MyBook mb2 = new MyBook("jsp", 10);
		mb2.printInfo();
		System.out.println("���ǸŰ���: " + MyBook.getTotCnt());
	}
}

class MyBook {
	private String title;// ��������
	private int cnt;// �ǸŰ���
	private static int totCnt;// ���� ���ǸŰ���

	public MyBook(String title, int cnt) {
		this.title = title;
		this.cnt = cnt;
		totCnt += cnt;
	}

	public static int getTotCnt() {
		return totCnt;
	}

	public void printInfo() {
		System.out.println("������: " + title);
		System.out.println("�ǸŰ���: " + cnt);
	}
}