package jdbc04.test.vo;

import java.sql.Date;

/*
 * VO클래스 (value Object)
 *  - 데이터(값)을 담는 기능의 클래스
 *  - 하나의 row를 담는 역할(DTO: Data Transfer Object)
 *  - 테이블의 컬럼명과 동일한 이름으로 멤버변수를 만든다.
 *  - 멤버변수값을 저장하는 setter메소드를 갖는다.
 *  - 멤버변수값을 리턴하는 getter메소드를 갖는다.
 */
public class MembersVo {
	// 멤버변수이름을 테이블의 컬럼명과 동일하게 만들기
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
