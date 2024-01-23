package sub2;
/*
 * 날짜 : 2024/01/22
 * 이름 : 오아람
 * 내용 : Select 실습하기
 */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class SelectTest {
	public static void main(String[] args) {

		String host = "jdbc:mysql://127.0.0.1:3306/studydb";
		String user = "oor92";
		String pass = "1234";
		
		//결과처리용 리스트
		List<User1> users = new ArrayList<>();

		try {
			// 1단계 - 드라이버 로드
			Class.forName("com.mysql.cj.jdbc.Driver");

			// 2단계 - 데이터베이스 접속
			Connection conn = DriverManager.getConnection(host, user, pass);

			// 3단계 - SQL실행 객체 생성
			Statement stmt = conn.createStatement();

			// 4단계 - SQL 실행
			String sql = "Select * from `user1`";
			ResultSet rs = stmt.executeQuery(sql);// DBMS가 ResultSet(View)을 보내줌(결과를 보내줌)

			// 5단계 - 결과처리
			while (rs.next()) {// 커서를 이용한다.커서가 이동(첫번째줄 완료후->두번째줄)하면서 계속 반복

				String uid = rs.getString(1);
				String name = rs.getString(2);
				String birth = rs.getString(3);
				String hp = rs.getString(4);
				int age = rs.getInt(5);
				
				User1 u1= new User1();
				u1.setUid(uid);
				u1.setName(name);
				u1.setBirth(birth);
				u1.setHp(hp);
				u1.setAge(age);
				
				users.add(u1);
								
				//System.out.printf("%s,%s,%s,%s,%d\n",uid,name,birth,hp,age);

			}

			// 6단계
			rs.close();
			stmt.close();
			conn.close();
			

		} catch (Exception e) {
			e.printStackTrace();
		}
		
		//select 결과 출력(리스트 출력)
		for(User1 u1: users){
			System.out.printf("%s,%s,%s,%s,%d\n"
					,u1.getUid()
					,u1.getName()
					,u1.getBirth()
					,u1.getHp()
					,u1.getAge());
		}
		
		System.out.println("Select 완료....");
	}

}
