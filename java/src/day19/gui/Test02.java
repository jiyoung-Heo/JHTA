package day19.gui;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Test02 {
	public static void main(String[] args) {
		new MyFrame02();
	}
}

class MyFrame02 extends JFrame {
	JButton btn1 = new JButton("버튼1");
	JButton btn2 = new JButton("버튼2");
	JButton btn3 = new JButton("버튼3");
	JButton btn4 = new JButton("버튼4");
	FlowLayout layout = new FlowLayout();
//	GridLayout layout = new GridLayout(2, 2);

	public MyFrame02() {
		super("두번째 프레임");
		add(btn1);
		add(btn2);
		add(btn3);
		add(btn4);
		setLayout(layout);// 레이아웃매니저 설정하기
		setSize(300, 300);
		setVisible(true);
	}
}