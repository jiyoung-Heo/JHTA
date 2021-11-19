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
		// ��� Ŭ���� �޼ҵ� �������̵��صд�.
		// Ŭ������ �ش� Ŭ������ ��ӹ޾� ���ϴ� �޼ҵ带 �������̵����� �����Ϸ��� �����.
		// ��ӽ�Ű���� �����̴�.
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
				JOptionPane.showMessageDialog(MyFrame05.this, "���α׷��� �����մϴ�");
				System.exit(0);
			}

		}
		MyListener listener = new MyListener();
		this.addWindowListener(listener);
	}
}
