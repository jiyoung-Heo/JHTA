package day11.share;

public class Member {
	private String id;
	private String pw;
	private String email;
	private String phone;

	public Member() {
	}

	public Member(String id, String pw, String email, String phone) {
		this.id = id;
		this.pw = pw;
		this.email = email;
		this.phone = phone;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPw() {
		return pw;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

}
