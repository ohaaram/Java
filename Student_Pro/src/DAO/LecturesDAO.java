package DAO;

import DB.HelpDB;
import DB.SQL;
import DTO.LecturesDTO;

public class LecturesDAO extends HelpDB{
	private static LecturesDAO instance = new LecturesDAO();
	public static LecturesDAO getInstance() {
		return instance;
	}
	private LecturesDAO(){}
	
	public void insertDep(LecturesDTO dto) {
		try {
			conn=getConnection();
			conn.prepareStatement(SQL.INSERT_LEC);
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}		

}
