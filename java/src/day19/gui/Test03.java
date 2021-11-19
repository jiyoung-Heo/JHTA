package day19.gui;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Test03 {
	public static void main(String[] args) {
		new MyFrame03();
	}
}

class MyFrame03 extends JFrame {
	JButton btn1 = new JButton("버튼1");
	JButton btn2 = new JButton("버튼2");

	public MyFrame03() {
		setLayout(null);// 레이아웃매니저 사용안함
		btn1.setSize(100, 50);// 가로세로길이설정
		btn1.setLocation(10, 50);
		btn2.setBounds(120, 50, 100, 50);// x좌표, y좌표 버튼가로, 세로길이설정
		add(btn1);
		add(btn2);
		setSize(400, 300);
		setVisible(true);
	}
}