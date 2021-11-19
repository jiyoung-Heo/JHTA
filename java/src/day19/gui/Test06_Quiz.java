package day19.gui;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

//�� ���� �Է¹޾� �μ��� ����ϱ�
public class Test06_Quiz {
	public static void main(String[] args) {
		new MyFrame06();
	}
}

class MyFrame06 extends JFrame {
	JTextField txtfir = new JTextField(10);
	JTextField txtlast = new JTextField(5);
	JLabel lbl = new JLabel("���� ��µ˴ϴ�.");
	JButton btn = new JButton("�� ���ϱ�");

	public MyFrame06() {
		setLayout(new FlowLayout());
		add(txtfir);
		add(new JLabel("+"));
		add(txtlast);
		add(new JLabel("="));
		add(lbl);
		add(btn);
		setSize(500, 200);
		setVisible(true);

		MyActionListner listner = new MyActionListner();
		btn.addActionListener(listner);
	}

	class MyActionListner implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			String a = txtfir.getText();
			String b = txtlast.getText();
			int c = Integer.parseInt(a) + Integer.parseInt(b);
			// String.value of(c);
			lbl.setText(Integer.toString(c));
		}
	}
}