package day20.gui;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Test06_Adapter {
	public static void main(String[] args) {
		new MyFrame06();
	}
}

class MyFrame06 extends JFrame {
	public MyFrame06() {
		setSize(500, 500);
		setVisible(true);
		/*
		 * 어댑터클래스-> 이멘트리스너(인터페이스)를 상속받아 모든 추상메소드를 오버라이딩해놓은 클래스
		 */
		class MyAdapter extends WindowAdapter {
			@Override
			public void windowClosing(WindowEvent e) {
				JOptionPane.showMessageDialog(MyFrame06.this, "프로그램을 종료합니다");
				System.exit(0);
			}
		}
		MyAdapter adapter = new MyAdapter();
		this.addWindowListener(adapter);
	}
}