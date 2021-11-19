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
	// 여러줄 쓸수있는 JTextArea
	// 한줄씩쓰는건 JTextField
	JTextArea text = new JTextArea();
	JPanel panel = new JPanel();
	JButton btn1 = new JButton("저장");
	JButton btn2 = new JButton("열기");

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
				String txt = text.getText();// 텍스트에어리어에 입력된 문자열
				// 입력할 수 있는 팝업 띄우기. text1.txt가 디폴트값으로 들어가있음
				String fileName = JOptionPane.showInputDialog("저장할파일명입력", "text1.txt");
				try {
					if (e.getSource() == btn1) {
						// 텍스트에리어에 입력된텍스트를 파일로 저장하기 위한 스트림
						PrintWriter pw = new PrintWriter(fileName);
						// txt를 파일에 출력(저장)하기
						pw.println(txt);
						pw.close();
						JOptionPane.showMessageDialog(MyFrame04.this, "저장완료");
						text.setText("");// 텍스트에리어에 입력된 텍스트 지우기
						text.requestFocus();// 테스트에리어에 포커스 주기
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
					JOptionPane.showMessageDialog(MyFrame04.this, "존재하지 않는 파일입니다.");

				} catch (IOException e2) {
					System.out.println(e2.getMessage());
				}
			}
		};
		btn1.addActionListener(action1);
		btn2.addActionListener(action1);
	}
}