package DAO;

import DB.HelpDB;
import DB.SQL;
import DTO.DepartmentsDTO;

public class ProfessorsDAO extends HelpDB{
	
	private static ProfessorsDAO instance = new ProfessorsDAO();
	public static ProfessorsDAO getInstance() {
		return instance;
	}
	private ProfessorsDAO(){}
	
	public void insertPro(ProfessorsDAO dto) {
		try {
			conn=getConnection();
			conn.prepareStatement(SQL.INSERT_PRO);
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}		

}
