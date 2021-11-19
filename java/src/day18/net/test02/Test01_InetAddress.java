package day18.net.test02;

import java.net.InetAddress;
import java.net.UnknownHostException;

//InetAddress: ip주소와 관련된 정보를 갖는 클래스
public class Test01_InetAddress {
	public static void main(String[] args) {
		try {
			InetAddress ia = InetAddress.getByName("www.naver.com");
			String hostIp = ia.getHostAddress();
			System.out.println(hostIp);
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
	}
}
