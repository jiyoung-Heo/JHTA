package day08.test01;

public class User {
	protected String id;
	protected String pwd;

	public void setInfo(String id, String pwd) {
		this.id = id;
		this.pwd = pwd;
	}

	public String getId() {
		return id;
	}

	public String getPwd() {
		return pwd;
	}

}
