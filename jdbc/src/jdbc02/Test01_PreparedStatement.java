package jdbc02;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/*
 * [ PreparedStatement ]
 * - Statement를 상속받은 인터페이스로 SQL구문을 실행하는 기능의 객체
 * - 사용방법
 *  SQL문장에 변수가 들어갈 부분을 ? 로 넣고 실행시에 ? 에 대응되는 값을 setXXX 메소드로 실행한다.
 * - 특징
 *  1) Statement 는 실행시에 sql명령어를 지정해서 sql구문을 실행한다.-->여러개의 sql구문을 하나의 Statement객체로 실행할 수 있다.
 *     런타임시?.?
 *  2) PreparedStatement는 객체생성시에 지정된 sql구문만을 실행할 수 있다. -->컴파일시에 실행할 sql구문이 지정되므로 실행시에 sql구문이 변경될 수 없다.
 *     이는 보안상 유리하다. 컴파일시 sql구문이 지정된다.
 */
public class Test01_PreparedStatement {
	public static void main(String[] args) {
		new MyJDBC01();
	}
}

class MyJDBC01 {
	public MyJDBC01() {
		try {
			Class.forName("oracle.jdbc.OracleDriver");
		} catch (ClassNotFoundException e) {
			System.out.println(e.getMessage());
		}
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		try (Connection con = DriverManager.getConnection(url, "scott", "tiger");) {
			System.out.println("db접속 성공!");
			String sql = "insert into members values(?,?,?,?,sysdate)";
			// sql 구문을 실행하기 위한 PreparedStatement 객체 얻어오기
			try (PreparedStatement pstmt = con.prepareStatement(sql);) {
				pstmt.setInt(1, 10);// 1번째 ? 위치에 10 넣기
				pstmt.setString(2, "김순자");// 2번째 ? 위치에 '김순자'넣기
				pstmt.setString(3, "0101111111");// 3번째 ? 위치에 '010...'넣기
				pstmt.setString(4, "서울 송파");
//			int n = pstmt.executeUpdate();
//			System.out.println(n + "명의 회원 등록완료!");

			}
			String sql1 = "delete from members where num = ?";
			try (PreparedStatement pstmt1 = con.prepareStatement(sql1);) {
//			pstmt1 = con.prepareStatement(sql1);// sql 구문 넣어주기
				pstmt1.setInt(1, 10);
//			int n1 = pstmt1.executeUpdate();// ()안에 공백
//			System.out.println(n1 + "명의 회원 삭제 완료!");
			}

			// 수정하기(임의의 회원번호로 회원이름,전화번호,주소를 변경해 보세요.)
			String sql2 = "update members set name=?,phone=?,addr=? where num = ?";
			try (PreparedStatement pstmt2 = con.prepareStatement(sql2);) {
				pstmt2.setString(1, "안녕");
				pstmt2.setString(2, "021111111");
				pstmt2.setString(3, "부산");
				pstmt2.setInt(4, 2);
				int n3 = pstmt2.executeUpdate();
				System.out.println(n3 + "명의 회원 수정완료!");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}