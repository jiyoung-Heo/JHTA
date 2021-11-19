package day08.test01;

import day08.test02.Admin;

public class TestMain {
	public static void main(String[] args) {
//		Member객체를 생성하고 값 저장후 출력되도록 해보세요.
		Member mb = new Member();
		mb.setMember("hello", "2134", "지영");
		mb.printInfo();

		Admin ad = new Admin();
		ad.setAdminInfo("test", "5678", "master");
		ad.printAdminInfo();
	}
}
