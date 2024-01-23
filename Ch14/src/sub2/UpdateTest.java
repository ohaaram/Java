package sub2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/*
 * 날짜 : 2024/01/22
 * 이름 : 오아람
 * 내용 : Update 실습하기
 */


public class UpdateTest {
	public static void main(String[] args) {
		// DB정보
		String host = "jdbc:mysql://127.0.0.1:3306/studydb";
		// localhost(127.0.0.1)외우기!!
		String user = "oor92";// 최고관리자(root)는 쓰지 않는다 위험~
		String pass = "1234";

		try {
			// 1단계 - JDBC 드라이버 로드
			Class.forName("com.mysql.cj.jdbc.Driver");

			// 2단계 - 데이버베이스 접속
			Connection conn = DriverManager.getConnection(host, user, pass);

			// 3단계 - SQL 실행 객체 생성
			Statement stmt =conn.createStatement();		
			
			// 4단계 - SQL 실행
			String sql = "UPDATE `User1`SET `HP`='010-1234-0002',`AGE`=27 WHERE `UID`='P101'";
			stmt.executeUpdate(sql);
			
			// 5단계 - 결과 처리(SELECT 경우)-insert문이라 결과처리(결과 받아오는것이 없음) 할 것이 없음(건너뜀)
			// 6단계 - 접속 종료
			stmt.close();
			conn.close();
			

		} catch (Exception e) {
			e.printStackTrace();
		}

		System.out.println("Update 완료...");
	}

}
