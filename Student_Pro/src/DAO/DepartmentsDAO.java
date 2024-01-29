package DAO;

import DB.HelpDB;
import DB.SQL;
import DTO.DepartmentsDTO;

public class DepartmentsDAO extends HelpDB{
	
	private static DepartmentsDAO instance = new DepartmentsDAO();
	public static DepartmentsDAO getInstance() {
		return instance;
	}
	private DepartmentsDAO(){}
	
	public void insertDep(DepartmentsDTO dto) {
		try {
			conn=getConnection();
			conn.prepareStatement(SQL.INSERT_DEP);
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}			


}
