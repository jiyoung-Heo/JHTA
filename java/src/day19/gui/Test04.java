package day19.gui;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

/*
 * [�ڹٿ����� �̺�Ʈ ó��]
 * 1. �̺�Ʈ
 *   - �������󿡼� �߻��Ǵ� �������(���콺 Ŭ��, Ű���� ����, ������ ����,...)
 * 2. �̺�Ʈ ó��
 *   - �̺�Ʈ�� �߻��Ǿ����� ������ �۾��� �����ϴ°�
 *   - �̺�Ʈ ó�� ����
 *   1) �̺�Ʈ������ Ŭ���� ����� - �̺�Ʈ�� �߻��Ǿ��� �� ����� ��� ����
 *   2) �̺�Ʈ������ ��ü �����ϱ�
 *   3) �̺�Ʈ�� �߻��Ǵ� Ÿ�ٰ�ü�� �̺�Ʈ������ �����ϱ�
 */
public class Test04 {
	public static void main(String[] args) {
		new MyFrame04();
	}
}

class MyFrame04 extends JFrame {
	JButton btn1 = new JButton("��ư1");
	JButton btn2 = new JButton("��ư2");
	JLabel lbl = new JLabel("���⿡ ��µ˴ϴ�.");
//	FlowLayout layout = new FlowLayout();

	public MyFrame04() {
		setLayout(new FlowLayout());
		add(btn1);
		add(btn2);
		add(lbl);
//		setLayout(layout);
		setSize(400, 200);
		setVisible(true);
		// �׼Ǹ����ʰ�ü ����
		MyActionListener listner = new MyActionListener();
		// ��ư�� �׼Ǹ����� �����ϱ�
		btn1.addActionListener(listner);
		btn2.addActionListener(listner);
	}

	// ��ư�� Ŭ������ �� ����Ǿ�� �� ����� ������ �̺�Ʈ������ Ŭ���� �����
	class MyActionListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			// e.getSource(): �̺�Ʈ�� �߻��� ��ü
			if (e.getSource() == btn1) {
				// ��ư�� Ŭ�������� ����Ǿ�� �� ��� ����
//			System.out.println("��ư�� Ŭ���߾��");
				lbl.setText("��ư1�� Ŭ���߱���!!!");
			} else if (e.getSource() == btn2) {
				lbl.setText("��ư2�� Ŭ���߱���!!!");

			}
		}
	}
}