package day19.gui;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Test03 {
	public static void main(String[] args) {
		new MyFrame03();
	}
}

class MyFrame03 extends JFrame {
	JButton btn1 = new JButton("��ư1");
	JButton btn2 = new JButton("��ư2");

	public MyFrame03() {
		setLayout(null);// ���̾ƿ��Ŵ��� ������
		btn1.setSize(100, 50);// ���μ��α��̼���
		btn1.setLocation(10, 50);
		btn2.setBounds(120, 50, 100, 50);// x��ǥ, y��ǥ ��ư����, ���α��̼���
		add(btn1);
		add(btn2);
		setSize(400, 300);
		setVisible(true);
	}
}