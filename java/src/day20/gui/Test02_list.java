package day20.gui;

import java.awt.BorderLayout;
import java.awt.List;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Test02_list {
	public static void main(String[] args) {
		new MyFrame02();
	}
}

class MyFrame02 extends JFrame {
	JTextField txtName = new JTextField(20);
	JButton btn1 = new JButton("���");
	JButton btn2 = new JButton("����");
	List list = new List();
	JPanel panel = new JPanel();

	public MyFrame02() {
		list.add("�̸�");
		list.add("ȫ�浿");
		list.add("�̱���");
		panel.add(txtName);
		panel.add(btn1);
		panel.add(btn2);
		setLayout(new BorderLayout());
		add(panel, BorderLayout.NORTH);
		add(list, BorderLayout.CENTER);
		setSize(500, 500);
		setVisible(true);

		MyactionListener mal = new MyactionListener();
		btn1.addActionListener(mal);
		// ���ٽ��̿��غ���
//		btn1.addActionListener(e->{
//			String name = txtName.getText();
//			list.add(name);
//			txtName.setText("");
//			txtName.requestFocus();
//		});
	}

	class MyactionListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			if (e.getSource() == btn1) {
				list.add(txtName.getText());
				txtName.setText("");
				txtName.requestFocus();
			}
			if (e.getSource() == btn2) {
				if (list.getSelectedIndex() == -1) {
					JOptionPane.showMessageDialog(MyFrame02.this, "������ �׸��� �������ּ���");
				}
//				�����ϱ�
//				list.remove();
			}

		}
	}
//	ActionListener listner(e-> {
//			if (e.getSource() == btn1) {
//				list.add(txtName.getText());
//				txtName.setText("");
//				txtName.requestFocus();
//			}
//	}
}