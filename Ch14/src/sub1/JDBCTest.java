package sub1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/*
 * 날짜 : 2024/01/22
 * 이름 : 오아람
 * 내용 : JDBC 실습하기
 */

public class JDBCTest {
	public static void main(String[] args) {

		// DB정보
		String host = "jdbc:mysql://127.0.0.1:3306/studydb";// localhost(127.0.0.1)외우기!!
		String user = "oor92";// 최고관리자(root)는 쓰지 않는다 위험~
		String pass = "1234";

		try {
			// JDBC 드라이버 로드
			Class.forName("com.mysql.cj.jdbc.Driver");
			//com.mysql.cj.jdbc->Driver.class->우측버튼 copy ~name->class.forname(여기에 붙여넣기)

			// 데이터베이스 접속
			Connection conn =DriverManager.getConnection(host,user,pass);
			
			if(conn!=null) {
				System.out.println("데이터베이스 접속 성공!!");
			}else {
				System.out.println("데이터베이스 접속 실패!");
			}
			
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		System.out.println("프로그램 종료...");

	}

}
