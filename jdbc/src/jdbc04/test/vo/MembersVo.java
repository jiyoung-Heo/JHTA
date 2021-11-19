package jdbc04.test.vo;

import java.sql.Date;

/*
 * VOŬ���� (value Object)
 *  - ������(��)�� ��� ����� Ŭ����
 *  - �ϳ��� row�� ��� ����(DTO: Data Transfer Object)
 *  - ���̺��� �÷���� ������ �̸����� ��������� �����.
 *  - ����������� �����ϴ� setter�޼ҵ带 ���´�.
 *  - ����������� �����ϴ� getter�޼ҵ带 ���´�.
 */
public class MembersVo {
	// ��������̸��� ���̺��� �÷���� �����ϰ� �����
	private int num;
	private String name;
	private String phone;
	private String addr;
	private Date regdate;

	public MembersVo() {
	}

	public MembersVo(int num, String name, String phone, String addr, Date regdate) {
		super();
		this.num = num;
		this.name = name;
		this.phone = phone;
		this.addr = addr;
		this.regdate = regdate;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}

	public void setRegdate(Date regdate) {
		this.regdate = regdate;
	}

	public int getNum() {
		return num;
	}

	public String getName() {
		return name;
	}

	public String getPhone() {
		return phone;
	}

	public String getAddr() {
		return addr;
	}

	public Date getRegdate() {
		return regdate;
	}

}
