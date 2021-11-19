package day19.gui;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Test02_frame {
	public static void main(String[] args) {
		JFrame frm = new JFrame("첫번째프레임");
		frm.add(new JButton("버튼1"));
		frm.setSize(300, 300);
		frm.setVisible(true);
	}
}
