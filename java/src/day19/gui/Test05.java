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
	JButton btn1 = new JButton("Ȯ��");
	JLabel lbl = new JLabel("���⿡ ��µ˴ϴ�.");

	public MyFrame05() {
		setLayout(new FlowLayout());
		add(new JLabel("�̸��Է�: "));
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
			// �Էµ� �ؽ�Ʈ ������
//			String n = txtName.getText();
			lbl.setText(txtName.getText() + "�Դϴ�");
		}
	}
}