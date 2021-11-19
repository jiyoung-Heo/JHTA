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
		 * �����Ŭ����-> �̸�Ʈ������(�������̽�)�� ��ӹ޾� ��� �߻�޼ҵ带 �������̵��س��� Ŭ����
		 */
		class MyAdapter extends WindowAdapter {
			@Override
			public void windowClosing(WindowEvent e) {
				JOptionPane.showMessageDialog(MyFrame06.this, "���α׷��� �����մϴ�");
				System.exit(0);
			}
		}
		MyAdapter adapter = new MyAdapter();
		this.addWindowListener(adapter);
	}
}