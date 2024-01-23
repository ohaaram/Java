package sub3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

/*
 * 날짜 : 2024/01/23
 * 이름 : 오아람
 * 내용 : PreparedDeleteTest
 */

public class PreparedDeleteTest {
	public static void main(String[] args) {
		String host = "jdbc:mysql://127.0.0.1:3306/studydb";
		String user = "oor92";
		String pass = "1234";
		
		try {
			//1단계 - 드라이버 로드  
			Class.forName("com.mysql.cj.jdbc.Driver");
			//2단계 - 데이터 접속
			Connection conn = DriverManager.getConnection(host,user,pass);
			
			//3단계 - SQL실행 객체 생성
			String sql="delete from `user1` where `uid`=?";
			
			PreparedStatement pstmt = conn.prepareStatement(sql);
			
			pstmt.setString(1, "B101");
			
			
			//4단계 - SQL 실행
			pstmt.executeUpdate();
			
			//5단계 - 결과처리
			//6단계 - 실행 종료
			
			conn.close();
			pstmt.close();		
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("Delete가 완료되었습니다...");
	}

}
