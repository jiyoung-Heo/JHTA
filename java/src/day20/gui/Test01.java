package day20.gui;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Test01 {
	public static void main(String[] args) {
		new MyFrame01();
	}
}

class MyFrame01 extends JFrame {
	JButton btn1 = new JButton("��ư1");
	JButton btn2 = new JButton("��ư2");
	JButton btn3 = new JButton("��ư3");
	JButton btn4 = new JButton("��ư4");
	JButton btn5 = new JButton("��ư5");
	JButton btn6 = new JButton("��ư6");
	JPanel panel = new JPanel();

	public MyFrame01() {
		// �������ϼ��� 5������������ �����ִ·��̾ƿ�
		setLayout(new BorderLayout());
		panel.setLayout(new GridLayout(1, 2));
		panel.add(btn1);
		panel.add(btn6);
		add(panel, BorderLayout.NORTH);
//		add(btn6, BorderLayout.NORTH);
		add(btn2, BorderLayout.CENTER);
		add(btn3, BorderLayout.SOUTH);
		add(btn4, BorderLayout.EAST);
		add(btn5, BorderLayout.WEST);

		setSize(500, 500);
		setVisible(true);
	}
}