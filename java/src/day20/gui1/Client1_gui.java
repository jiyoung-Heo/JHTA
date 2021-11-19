package day20.gui1;

import java.awt.BorderLayout;
import java.awt.List;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Client1_gui {
	public static void main(String[] args) {
		new ChatFrame();
	}
}

class ChatFrame extends JFrame {
	JPanel panel = new JPanel();
	JTextField txtMsg = new JTextField(30);
	JButton btnSend = new JButton("보내기");
	JButton btnEnd = new JButton("종료");
	List list = new List();
	Socket socket = null;
	String nickName = null;
	PrintWriter pw = null;
	BufferedReader br = null;

	public ChatFrame() {
		setLayout(new BorderLayout());
		panel.add(txtMsg);
		panel.add(btnSend);
		panel.add(btnEnd);
		add(list, BorderLayout.CENTER);
		add(panel, BorderLayout.SOUTH);
		setDefaultCloseOperation(EXIT_ON_CLOSE);// 시스템 메뉴중에 종료버튼 누르면 프로그램 종료하기
		setSize(500, 500);
		setVisible(true);

		try {
			// 생성자에서 소켓을 통해 서버에 접속하기
			socket = new Socket("localhost", 4000);
			list.add("서버에 접속성공!");
			// 서버에 메세지를 보낼 출력스트림
			pw = new PrintWriter(socket.getOutputStream());
			// 서버가 보내온 메세지를 읽어올 입력스트림
			br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			// 사용할닉네임 입력받기
			nickName = JOptionPane.showInputDialog(ChatFrame.this, "사용할 닉네임 입력");
			// 제일먼저 서버에 닉네임 보내기
			pw.println(nickName);
			pw.flush();

			// 메세지 수신 쓰레드 실행
			new getMsg().start();

			btnSend.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					pw.println(txtMsg.getText());
					pw.flush();
					list.add("나>>" + txtMsg.getText());
					txtMsg.setText("");
					txtMsg.requestFocus();
				}
			});

			btnEnd.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					try {
						pw.close();
						br.close();
						socket.close();
						list.add("서버와 연결이 종료되었습니다...");
					} catch (IOException e1) {
						e1.printStackTrace();
					}
				}
			});

			// keyListener: 키보드의 키를 눌렀을때 이벤트를 감지하는 리스너(어댑터클래스-> KeyAdapter)
			// 엔터키를 입력하면 입력한 메시지 서버로 보내기
			txtMsg.addKeyListener(new KeyAdapter() {
				@Override
				public void keyPressed(KeyEvent e) {// 키보드의 키를 누르면 자동 호출됨
					if (e.getKeyCode() == KeyEvent.VK_ENTER) {
						pw.println(txtMsg.getText());
						if (txtMsg.getText().equals(""))
							return;
						// trim 공백 제거해주는거.
//						if (txtMsg.getText().trim().equals("")){
//						pw.flush();
//						txtMsg.setText("");
//						txtMsg.requestFocus();
//						}

						pw.flush();
						list.add("나>>" + txtMsg.getText());
						txtMsg.setText("");
						txtMsg.requestFocus();
					}
				}
			});

		} catch (IOException e) {
			e.getStackTrace();
		}
	}

	// 서버가 보내온 문자열을 수신하는 스레드
	class getMsg extends Thread {
		@Override
		public void run() {
			try {
				while (true) {
					String msg = br.readLine();
					if (msg == null) {
						list.add("서버와 접속이 끊겼습니다..");
						break;
					}
					// 메세지를 화면에 출력하기
					list.add(msg);
				}
			} catch (IOException e) {
				System.out.println(e.getMessage());
			}

		}
	}
}