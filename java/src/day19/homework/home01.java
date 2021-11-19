package day19.homework;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class home01 {
	public static void main(String[] args) {
		new MyFrame();
	}
}

class MyFrame extends JFrame {
	JTextField num = new JTextField();
	JTextField kor = new JTextField();
	JTextField eng = new JTextField();
	JButton save = new JButton("����");
	JButton exit = new JButton("����");

	public MyFrame() {
		super("�����������α׷�");
		// ���̾ƿ��� GridLayout���� ��ä���� ����
		setLayout(new GridLayout(4, 2));
		add(new JLabel("��ȣ"));
		add(num);
		add(new JLabel("��������"));
		add(kor);
		add(new JLabel("��������"));
		add(eng);
		// �����ư
		add(save);
		// �����ư
		add(exit);
		// �����ӻ���������
		setSize(400, 300);
		setVisible(true);
		// myActionlistnerŬ������ ��ü�� ����
		myActionListener listner = new myActionListener();
		// listner��ü�� ����, �����ư ����
		save.addActionListener(listner);
		exit.addActionListener(listner);
	}

	class myActionListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			// �����ϱ�
			if (e.getSource() == save) {
				// save���� �޼ҵ带 ���� ��������
				saveFile();
//				saveFile2();
				// ����Ϸ�� �� ��ȣ, ��������, �������� �Է��ߴ� ���� ��ĭ���� �ʱ�ȭ������.
				num.setText("");
				kor.setText("");
				eng.setText("");
				// �����ߴٴ� �˸��� kor������Ʈ ���� �߰��ϴ� �޼ҵ�
				JOptionPane.showMessageDialog(MyFrame.this, "�����߽��ϴ�.");
			}
			// �����ϱ�
			if (e.getSource() == exit) {
				// �ý��� ����
				JOptionPane.showMessageDialog(MyFrame.this, "�ý����� �����մϴ�.");
				System.exit(0);
			}
		}
	}

	// ������ ����ϴ� �޼ҵ�
	public void saveFile() {
		try {
			// student.txt ������ �����. true�� ����� �̸� �����ִ����� ����������ʰ� �ؿ� �߰����ش�.
			FileWriter fw = new FileWriter("student.txt", true);
			// kor�� eng�� intŸ������ ��ȯ���������ش�.
			int savekor = Integer.parseInt(kor.getText());
			int saveeng = Integer.parseInt(eng.getText());
			// �հ�� ����� ���Ѵ�.
			int sum = savekor + saveeng;
			double ave = sum / 2.0;
			// ��� ���ļ� String������ �����Ѵ�.
			String all = num.getText() + ", " + kor.getText() + ", " + eng.getText() + ", " + String.valueOf(sum) + ", "
					+ String.valueOf(ave);
			// FileWriter�� ���� String���� ���� ���پ� �����Ѵ�. �����Ŀ��� ������ �Ѵ�.
			fw.write(all + "\n");
			// fw�� �ݾ��ָ� �÷����� ���ش�.
			fw.close();
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}

//	**printwriter, fileoutputStream�� �̿��� ���Ͽ� �����ϱ�.**
//	public void saveFile2() {
//		try {
//			PrintWriter pw = new PrintWriter(new FileOutputStream("student2.txt", true));
//			int savekor = Integer.parseInt(kor.getText());
//			int saveeng = Integer.parseInt(eng.getText());
//			int sum = savekor + saveeng;
//			double ave = sum / 2.0;
//			String all = num.getText() + ", " + kor.getText() + ", " + eng.getText() + ", " + String.valueOf(sum) + ", "
//					+ String.valueOf(ave);
//			pw.println(all);
//			pw.close();
//		} catch (FileNotFoundException e) {
//			e.printStackTrace();
//		}
//	}
}
