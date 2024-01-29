package DAO;

import java.sql.SQLException;

import DB.HelpDB;
import DB.SQL;
import DTO.StudentsDTO;

public class StudentsDAO extends HelpDB{

		private static StudentsDAO instance = new StudentsDAO();
		
		public static StudentsDAO getInstance() {
			return instance;
		}
		private StudentsDAO(){}
		
		public void insertStd(StudentsDTO dto) {
			try {
				conn=getConnection();//디비접속
				pstmt=conn.prepareStatement(SQL.INSERT_STD);//디비에 sql문 입력
				
				pstmt.setString(1,dto.getStdno());
				pstmt.setInt(2, dto.getDepno());
				pstmt.setString(3,dto.getProno());
				pstmt.setString(4, dto.getStdname());
				pstmt.setString(5,dto.getStdjumin());
				pstmt.setString(6, dto.getStdhp());
				pstmt.setString(7, dto.getStdemail());
				pstmt.setString(8, dto.getStdaddr());
				pstmt.setString(9, dto.getStdpass());
				
				pstmt.executeUpdate();
				
				close();				
				
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			
		}
		public StudentsDTO selectStd(String id,String pass) {
			StudentsDTO user = null;
			try {
			conn=getConnection();//디비접속
			pstmt=conn.prepareStatement(SQL.SELECT_STD);//디비에 sql문 입력
			pstmt.setString(1, id);
			pstmt.setString(2, pass);
			
			rs = pstmt.executeQuery();
			
			// 5단계
			if(rs.next()) {
				user = new StudentsDTO();
				user.setStdno(rs.getString(1));
				user.setDepno(rs.getInt(2));
				user.setProno(rs.getString(3));
				user.setStdname(rs.getString(4));
				user.setStdjumin(rs.getString(5));
				user.setStdhp(rs.getString(6));
				user.setStdemail(rs.getString(7));
				user.setStdaddr(rs.getString(8));
				user.setStdpass(rs.getString(9));
			}			
			
			close();
			
			
			}catch(Exception e) {
				e.printStackTrace();
			}
			return user;
			
		}
		public void selectStds() {}
		public void updateStd() {}
		public void deleteStd() {}

}
