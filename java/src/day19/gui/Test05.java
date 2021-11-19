package day19.gui;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Test05 {
	public static void main(String[] args) {
		new MyFrame05();
	}
}

class MyFrame05 extends JFrame {
	JTextField txtName = new JTextField(10);
	JButton btn1 = new JButton("확인");
	JLabel lbl = new JLabel("여기에 출력됩니다.");

	public MyFrame05() {
		setLayout(new FlowLayout());
		add(new JLabel("이름입력: "));
		add(txtName);
		add(btn1);
		add(lbl);
		setSize(400, 200);
		setVisible(true);
		MyActionListener listner = new MyActionListener();
		btn1.addActionListener(listner);
	}

	class MyActionListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			// 입력된 텍스트 얻어오기
//			String n = txtName.getText();
			lbl.setText(txtName.getText() + "입니다");
		}
	}
}