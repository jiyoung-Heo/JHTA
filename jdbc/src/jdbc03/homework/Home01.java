package jdbc03.homework;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;
//<< 구매테이블 >>
//
//구매번호(PK),구매자아이디,상품명,가격,수량,구매일
//
//<< 결제테이블 >>
//
//결제번호(PK) 구매번호(FK) 결제금액 결제수단
//
//
//위의 정보를 갖는 테이블을 만들고 구매기능을 구현해 보세요.(PreparedStatement를 사용합니다.)
//
//[실행결과]
//1. 제품구매  2.구매정보수정 3.구매정보조회  4.구매취소 
//..
//
//제품구매:구매자아이디,상품명,가격,수량,결제수단 입력 받아서 저장
//구매정보조회:전체구매정보 조회
//구매정보수정:상품명,가격,수량,결제금액,결제수단을 변경합니다.
//구매취소:구매정보와 결제정보가 모두 삭제됩니다.
//
//트랜잭션 처리가 가능하도록 만들어 보세요

public class Home01 {
	public static void main(String[] args) {
		MyJDBC01 db = new MyJDBC01();
		Scanner sc = new Scanner(System.in);
		try {
			while (true) {
				System.out.println("1.제품구매 2.구매정보수정 3.구매정보조회 4.구매취소");
				int choice = sc.nextInt();
				switch (choice) {
				case 1:
					db.buy();
					break;
				case 2:
					db.update();
					break;
				case 3:
					db.find();
					break;
				case 4:
					db.cancel();
					break;
				default:
					System.out.println("잘못입력하셨습니다.");
					break;
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}

class MyJDBC01 {
	Scanner sc = new Scanner(System.in);
	Connection con = null;

	public MyJDBC01() {
		try {
			Class.forName("oracle.jdbc.OracleDriver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		try {
			con = DriverManager.getConnection(url, "scott", "tiger");
			System.out.println("db접속 성공!");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void buy() {
		System.out.println("구매자아이디");
		String id = sc.next();
		System.out.println("상품명");
		String product = sc.next();
		System.out.println("가격");
		int price = sc.nextInt();
		System.out.println("수량");
		int count = sc.nextInt();
		System.out.println("결제수단");
		String payMethod = sc.next();
		String sql = "insert into buy(id,product,price,count,sysdate) values(?,?,?,?,?)";
	}

	public void find() {
		String sql = "select num,id,product,price,count,buyday from buy";
		ResultSet rs = null;
		try (PreparedStatement pstmt = con.prepareStatement(sql);) {
			rs = pstmt.executeQuery();
			while (rs.next()) {
				int num = rs.getInt("num");
				String id = rs.getString("id");
				String product = rs.getString("product");
				int price = rs.getInt("price");
				int count = rs.getInt("count");
				Date buyday = rs.getDate("buyday");
				System.out.println(num);
				System.out.println(id);
				System.out.println(product);
				System.out.println(price);
				System.out.println(count);
				System.out.println(buyday);
				System.out.println();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if (rs != null) {
				try {
					rs.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
	}

//	구매정보수정:상품명,가격,수량,결제금액,결제수단을 변경합니다.
	public void update() throws SQLException {
		String sql = "update buy set product=?,price=?,count=? where num = ?";
		String sql2 = "update pay set price = ?, payMethod=? where num=?";
		try (PreparedStatement pstmt = con.prepareStatement(sql);
				PreparedStatement pstmt2 = con.prepareStatement(sql2);) {
			System.out.println("구매번호입력");
			int num = sc.nextInt();
			System.out.println("상품명변경");
			pstmt.setString(1, sc.next());
			System.out.println("가격");
			pstmt.setInt(2, sc.nextInt());
			System.out.println("수량");
			pstmt.setInt(3, sc.nextInt());
			pstmt.setInt(4, num);
			System.out.println("결제금액");
			pstmt2.setInt(1, sc.nextInt());
			System.out.println("결제수단");
			pstmt2.setString(2, sc.next());
			pstmt2.setInt(3, num);
			pstmt.execute();
			pstmt2.execute();
			System.out.println("수정완료");
		}
	}

//	구매취소:구매정보와 결제정보가 모두 삭제됩니다.
	public void cancel() throws SQLException {
		String sql = "delete from buy where num = ?";
		String sql2 = "delete from pay where num=?";
		try (PreparedStatement pstmt = con.prepareStatement(sql);
				PreparedStatement pstmt2 = con.prepareStatement(sql2);) {
			System.out.println("구매번호입력");
			int num = sc.nextInt();
			pstmt2.setInt(1, num);
			pstmt.setInt(1, num);
			pstmt2.execute();
			pstmt.execute();
			System.out.println("삭제완료");
		}
	}
}