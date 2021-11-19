package day20.gui;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class Test04_File {
	public static void main(String[] args) {
		new MyFrame04();
	}
}

class MyFrame04 extends JFrame {
	// ������ �����ִ� JTextArea
	// ���پ����°� JTextField
	JTextArea text = new JTextArea();
	JPanel panel = new JPanel();
	JButton btn1 = new JButton("����");
	JButton btn2 = new JButton("����");

	public MyFrame04() {
		setLayout(new BorderLayout());
		panel.add(btn1);
		panel.add(btn2);
		add(panel, BorderLayout.SOUTH);
		add(new JScrollPane(text), BorderLayout.CENTER);
		setSize(500, 500);
		setVisible(true);
		ActionListener action1 = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String txt = text.getText();// �ؽ�Ʈ���� �Էµ� ���ڿ�
				// �Է��� �� �ִ� �˾� ����. text1.txt�� ����Ʈ������ ������
				String fileName = JOptionPane.showInputDialog("���������ϸ��Է�", "text1.txt");
				try {
					if (e.getSource() == btn1) {
						// �ؽ�Ʈ����� �Էµ��ؽ�Ʈ�� ���Ϸ� �����ϱ� ���� ��Ʈ��
						PrintWriter pw = new PrintWriter(fileName);
						// txt�� ���Ͽ� ���(����)�ϱ�
						pw.println(txt);
						pw.close();
						JOptionPane.showMessageDialog(MyFrame04.this, "����Ϸ�");
						text.setText("");// �ؽ�Ʈ����� �Էµ� �ؽ�Ʈ �����
						text.requestFocus();// �׽�Ʈ����� ��Ŀ�� �ֱ�
					}
					if (e.getSource() == btn2) {
						String copy = "";
						BufferedReader br = new BufferedReader(new FileReader(fileName));
						while (br.ready()) {
//							copy += br.readLine() + "\n";
							String line = br.readLine();
							text.append(line + "\n");
						}
//						text.setText(copy);
					}
				} catch (FileNotFoundException e3) {
					JOptionPane.showMessageDialog(MyFrame04.this, "�������� �ʴ� �����Դϴ�.");

				} catch (IOException e2) {
					System.out.println(e2.getMessage());
				}
			}
		};
		btn1.addActionListener(action1);
		btn2.addActionListener(action1);
	}
}