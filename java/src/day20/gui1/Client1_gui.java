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
	JButton btnSend = new JButton("������");
	JButton btnEnd = new JButton("����");
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
		setDefaultCloseOperation(EXIT_ON_CLOSE);// �ý��� �޴��߿� �����ư ������ ���α׷� �����ϱ�
		setSize(500, 500);
		setVisible(true);

		try {
			// �����ڿ��� ������ ���� ������ �����ϱ�
			socket = new Socket("localhost", 4000);
			list.add("������ ���Ӽ���!");
			// ������ �޼����� ���� ��½�Ʈ��
			pw = new PrintWriter(socket.getOutputStream());
			// ������ ������ �޼����� �о�� �Է½�Ʈ��
			br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			// ����Ҵг��� �Է¹ޱ�
			nickName = JOptionPane.showInputDialog(ChatFrame.this, "����� �г��� �Է�");
			// ���ϸ��� ������ �г��� ������
			pw.println(nickName);
			pw.flush();

			// �޼��� ���� ������ ����
			new getMsg().start();

			btnSend.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					pw.println(txtMsg.getText());
					pw.flush();
					list.add("��>>" + txtMsg.getText());
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
						list.add("������ ������ ����Ǿ����ϴ�...");
					} catch (IOException e1) {
						e1.printStackTrace();
					}
				}
			});

			// keyListener: Ű������ Ű�� �������� �̺�Ʈ�� �����ϴ� ������(�����Ŭ����-> KeyAdapter)
			// ����Ű�� �Է��ϸ� �Է��� �޽��� ������ ������
			txtMsg.addKeyListener(new KeyAdapter() {
				@Override
				public void keyPressed(KeyEvent e) {// Ű������ Ű�� ������ �ڵ� ȣ���
					if (e.getKeyCode() == KeyEvent.VK_ENTER) {
						pw.println(txtMsg.getText());
						if (txtMsg.getText().equals(""))
							return;
						// trim ���� �������ִ°�.
//						if (txtMsg.getText().trim().equals("")){
//						pw.flush();
//						txtMsg.setText("");
//						txtMsg.requestFocus();
//						}

						pw.flush();
						list.add("��>>" + txtMsg.getText());
						txtMsg.setText("");
						txtMsg.requestFocus();
					}
				}
			});

		} catch (IOException e) {
			e.getStackTrace();
		}
	}

	// ������ ������ ���ڿ��� �����ϴ� ������
	class getMsg extends Thread {
		@Override
		public void run() {
			try {
				while (true) {
					String msg = br.readLine();
					if (msg == null) {
						list.add("������ ������ ������ϴ�..");
						break;
					}
					// �޼����� ȭ�鿡 ����ϱ�
					list.add(msg);
				}
			} catch (IOException e) {
				System.out.println(e.getMessage());
			}

		}
	}
}