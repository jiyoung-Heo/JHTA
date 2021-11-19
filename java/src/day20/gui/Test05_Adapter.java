package day20.gui;

import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Test05_Adapter {
	public static void main(String[] args) {
		new MyFrame05();
	}
}

class MyFrame05 extends JFrame {
	public MyFrame05() {
		setSize(500, 500);
		setVisible(true);
		// 어뎁터 클래스 메소드 오버라이딩해둔다.
		// 클래스에 해당 클래스를 상속받아 원하는 메소드를 오버라이딩없이 구현하려고 만든다.
		// 상속시키려는 목적이단.
		abstract class MyAddapt implements WindowListener {
			@Override
			public void windowOpened(WindowEvent e) {
			}

			@Override
			public void windowClosing(WindowEvent e) {
			}

			@Override
			public void windowClosed(WindowEvent e) {
			}

			@Override
			public void windowIconified(WindowEvent e) {
			}

			@Override
			public void windowDeiconified(WindowEvent e) {
			}

			@Override
			public void windowActivated(WindowEvent e) {
			}

			@Override
			public void windowDeactivated(WindowEvent e) {
			}

		}
		class MyListener extends MyAddapt {

			@Override
			public void windowClosing(WindowEvent e) {
				JOptionPane.showMessageDialog(MyFrame05.this, "프로그램을 종료합니다");
				System.exit(0);
			}

		}
		MyListener listener = new MyListener();
		this.addWindowListener(listener);
	}
}
