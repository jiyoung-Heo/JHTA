package day11.homework;

public class Home01_per {
	private String id;
	private String pwd;
	private String email;
	private String phone;

	public Home01_per(String id) {
		this(id, null, null, null);
	}

	public Home01_per(String id, String pwd, String email, String phone) {
		this.id = id;
		this.pwd = pwd;
		this.email = email;
		this.phone = phone;
	}

	public String getId() {
		return id;
	}

	public String getPwd() {
		return pwd;
	}

	public String getEmail() {
		return email;
	}

	public String getPhone() {
		return phone;
	}

	@Override
	public String toString() {
		return "아이디: " + getId() + "\n비밀번호: " + getPwd() + "\n이메일: " + getEmail() + "\n전화번호: " + getPhone() + "\n";
	}

//	@Override
//	public int hashCode() {
//		return id.hashCode();
//	}
//
//	@Override
//	public boolean equals(Object obj) {
//		boolean result = false;
//		if (obj != null && obj instanceof Home01_per) {
//			Home01_per person = (Home01_per) obj;
//			if (this.id.equals(person.getId())) {
//				result = true;
//			}
//		}
//		return result;
//	}
}
