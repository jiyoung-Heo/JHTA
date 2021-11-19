package jdbc04;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.List;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;

import jdbc04.test.dao.MembersDao;
import jdbc04.test.vo.MembersVo;

class MyFrame01 extends JFrame {
	JTabbedPane tab = new JTabbedPane();
	JPanel panBack1 = new JPanel();
	JPanel panBack2 = new JPanel();

	JPanel pan1 = new JPanel();
	JPanel pan2 = new JPanel();
	JTextField txtNum = new JTextField(5);
	JTextField txtName = new JTextField(10);
	JTextField txtPhone = new JTextField(13);
	JTextField txtAddr = new JTextField(20);
	JButton btnAdd = new JButton("회원가입");
	JButton btnEdit = new JButton("회원수정");
	MembersDao dao = new MembersDao();
	List list = new List();// 리스트 만들기

	public MyFrame01() {
		add(tab);
		panBack1.setLayout(null);
		panBack1.add(pan1);
		pan1.setLayout(new GridLayout(4, 2));
		pan1.add(new JLabel("회원번호"));
		pan1.add(txtNum);
		pan1.add(new JLabel("이름"));
		pan1.add(txtName);
		pan1.add(new JLabel("전화번호"));
		pan1.add(txtPhone);
		pan1.add(new JLabel("주소"));
		pan1.add(txtAddr);
		pan1.setBounds(10, 10, 550, 150);
		btnAdd.setBounds(460, 180, 100, 30);
		btnEdit.setBounds(350, 180, 100, 30);
		panBack1.add(btnAdd);
		panBack1.add(btnEdit);

		panBack2.setLayout(new BorderLayout());
//		panBack2.add(new List(), BorderLayout.CENTER);
		panBack2.add(list, BorderLayout.CENTER);
		tab.addTab("회원가입", panBack1);
		tab.addTab("회원목록", panBack2);

		ArrayList<MembersVo> mlist = dao.findAll();
		for (MembersVo vo : mlist) {
			list.add(vo.getName());
		}

		setSize(600, 600);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		// 가입버튼 누르면 입력된 회원정보를 DB에 저장하기
		btnAdd.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				int num = Integer.parseInt(txtNum.getText());
				String name = txtName.getText();
				String phone = txtPhone.getText();
				String addr = txtAddr.getText();
				MembersVo vo = new MembersVo(num, name, phone, addr, null);
				int n = dao.insert(vo);
				if (n > 0) {
					JOptionPane.showMessageDialog(MyFrame01.this, "회원등록성공!");
				} else {

					JOptionPane.showMessageDialog(MyFrame01.this, "회원등록실패!");
				}
				list.removeAll();
				ArrayList<MembersVo> mlist = dao.findAll();
				for (MembersVo v : mlist) {
					list.add(v.getName());
				}
			}
		});
		// 회원수정
		btnEdit.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				int num = Integer.parseInt(txtNum.getText());
				String name = txtName.getText();
				String phone = txtPhone.getText();
				String addr = txtAddr.getText();
				MembersVo vo = new MembersVo(num, name, phone, addr, null);
				int n = dao.update(vo);
				if (n > 0) {
					JOptionPane.showMessageDialog(MyFrame01.this, "회원수정성공!");
				} else {

					JOptionPane.showMessageDialog(MyFrame01.this, "회원수정실패!");
				}
				list.removeAll();
				ArrayList<MembersVo> mlist = dao.findAll();
				for (MembersVo v : mlist) {
					list.add(v.getName());
				}
			}
		});
	}

}

public class Test04_gui {
	public static void main(String[] args) {
		new MyFrame01();
	}
}
