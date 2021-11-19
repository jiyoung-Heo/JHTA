package day20.gui;

import java.awt.BorderLayout;
import java.util.Calendar;
import java.util.Date;

import javax.swing.JFrame;
import javax.swing.JLabel;

//시간출력되게 쓰레드사용
public class Test03_Thread {
	public static void main(String[] args) {
		new MyFrame03();
	}
}

class MyFrame03 extends JFrame {
	JLabel lblTime = new JLabel("여기에 시간이 출력됨니다.");
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
				time = cal.get(Calendar.YEAR) + "년" + (cal.get(Calendar.MONTH) + 1) + "월"
						+ cal.get(Calendar.DAY_OF_MONTH) + "일" + cal.get(Calendar.HOUR) + "시" + cal.get(Calendar.MINUTE)
						+ "분" + cal.get(Calendar.SECOND) + "초";
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