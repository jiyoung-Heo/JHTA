package day20.gui;

import java.awt.BorderLayout;
import java.util.Calendar;
import java.util.Date;

import javax.swing.JFrame;
import javax.swing.JLabel;

//�ð���µǰ� ��������
public class Test03_Thread {
	public static void main(String[] args) {
		new MyFrame03();
	}
}

class MyFrame03 extends JFrame {
	JLabel lblTime = new JLabel("���⿡ �ð��� ��µʴϴ�.");
	String time = "";

	public MyFrame03() {
		setLayout(new BorderLayout());
		add(lblTime, BorderLayout.NORTH);
		setSize(300, 300);
		setVisible(true);
		new Time().start();
	}

	class Time extends Thread {

		@Override
		public void run() {
			while (true) {
				Date date = new Date();
				Calendar cal = Calendar.getInstance();
				time = cal.get(Calendar.YEAR) + "��" + (cal.get(Calendar.MONTH) + 1) + "��"
						+ cal.get(Calendar.DAY_OF_MONTH) + "��" + cal.get(Calendar.HOUR) + "��" + cal.get(Calendar.MINUTE)
						+ "��" + cal.get(Calendar.SECOND) + "��";
				try {
					Thread.sleep(1_000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				lblTime.setText(time);
			}
		}
	}

}