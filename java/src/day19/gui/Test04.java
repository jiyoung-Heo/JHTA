package day19.gui;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

/*
 * [자바에서의 이벤트 처리]
 * 1. 이벤트
 *   - 윈도위상에서 발생되는 여러사건(마우스 클릭, 키보드 누름, 윈도우 닫힘,...)
 * 2. 이벤트 처리
 *   - 이벤트가 발생되었을때 실행할 작업을 구현하는것
 *   - 이벤트 처리 순서
 *   1) 이벤트리스너 클래스 만들기 - 이벤트가 발생되었을 때 실행될 기능 구현
 *   2) 이벤트리스너 객체 생성하기
 *   3) 이벤트가 발생되는 타겟객체에 이벤트리스너 연결하기
 */
public class Test04 {
	public static void main(String[] args) {
		new MyFrame04();
	}
}

class MyFrame04 extends JFrame {
	JButton btn1 = new JButton("버튼1");
	JButton btn2 = new JButton("버튼2");
	JLabel lbl = new JLabel("여기에 출력됩니다.");
//	FlowLayout layout = new FlowLayout();

	public MyFrame04() {
		setLayout(new FlowLayout());
		add(btn1);
		add(btn2);
		add(lbl);
//		setLayout(layout);
		setSize(400, 200);
		setVisible(true);
		// 액션리스너객체 생상
		MyActionListener listner = new MyActionListener();
		// 버튼에 액션리스너 연결하기
		btn1.addActionListener(listner);
		btn2.addActionListener(listner);
	}

	// 버튼을 클릭했을 때 실행되어야 할 기능을 구현한 이벤트리스너 클래스 만들기
	class MyActionListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			// e.getSource(): 이벤트가 발생된 객체
			if (e.getSource() == btn1) {
				// 버튼을 클릭했을때 실행되어야 할 기능 구현
//			System.out.println("버튼을 클릭했어요");
				lbl.setText("버튼1을 클릭했군요!!!");
			} else if (e.getSource() == btn2) {
				lbl.setText("버튼2을 클릭했군요!!!");

			}
		}
	}
}