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
	JButton save = new JButton("저장");
	JButton exit = new JButton("종료");

	public MyFrame() {
		super("성적관리프로그램");
		// 레이아웃은 GridLayout으로 꽉채워서 만듬
		setLayout(new GridLayout(4, 2));
		add(new JLabel("번호"));
		add(num);
		add(new JLabel("국어점수"));
		add(kor);
		add(new JLabel("영어점수"));
		add(eng);
		// 저장버튼
		add(save);
		// 종료버튼
		add(exit);
		// 프레임사이즈지정
		setSize(400, 300);
		setVisible(true);
		// myActionlistner클래스의 객체를 생성
		myActionListener listner = new myActionListener();
		// listner객체와 저장, 종료버튼 연동
		save.addActionListener(listner);
		exit.addActionListener(listner);
	}

	class myActionListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			// 저장하기
			if (e.getSource() == save) {
				// save파일 메소드를 통해 저장해줌
				saveFile();
//				saveFile2();
				// 저장완료된 후 번호, 국어점수, 영어점수 입력했던 곳을 빈칸으로 초기화시켜줌.
				num.setText("");
				kor.setText("");
				eng.setText("");
				// 저장했다는 알림이 kor컴포넌트 위에 뜨게하는 메소드
				JOptionPane.showMessageDialog(MyFrame.this, "저장했습니다.");
			}
			// 종료하기
			if (e.getSource() == exit) {
				// 시스템 종료
				JOptionPane.showMessageDialog(MyFrame.this, "시스템을 종료합니다.");
				System.exit(0);
			}
		}
	}

	// 저장을 담당하는 메소드
	public void saveFile() {
		try {
			// student.txt 파일을 만든다. true를 쓸경우 미리 쓰여있던것이 덮어써지지않고 밑에 추가해준다.
			FileWriter fw = new FileWriter("student.txt", true);
			// kor와 eng를 int타입으로 변환해저장해준다.
			int savekor = Integer.parseInt(kor.getText());
			int saveeng = Integer.parseInt(eng.getText());
			// 합계와 평균을 구한다.
			int sum = savekor + saveeng;
			double ave = sum / 2.0;
			// 모두 합쳐서 String값으로 저장한다.
			String all = num.getText() + ", " + kor.getText() + ", " + eng.getText() + ", " + String.valueOf(sum) + ", "
					+ String.valueOf(ave);
			// FileWriter를 통해 String값을 한줄 한줄씩 저장한다. 저장후에는 개행을 한다.
			fw.write(all + "\n");
			// fw를 닫아주며 플러쉬도 해준다.
			fw.close();
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}

//	**printwriter, fileoutputStream을 이용한 파일에 저장하기.**
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
