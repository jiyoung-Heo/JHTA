package day08.test01;

import day08.test02.Admin;

public class TestMain {
	public static void main(String[] args) {
//		Member��ü�� �����ϰ� �� ������ ��µǵ��� �غ�����.
		Member mb = new Member();
		mb.setMember("hello", "2134", "����");
		mb.printInfo();

		Admin ad = new Admin();
		ad.setAdminInfo("test", "5678", "master");
		ad.printAdminInfo();
	}
}
