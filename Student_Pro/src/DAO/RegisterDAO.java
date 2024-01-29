package DAO;

import DB.HelpDB;

public class RegisterDAO extends HelpDB{
	

		private static RegisterDAO instance = new RegisterDAO();
		
		public static RegisterDAO getInstance() {
			return instance;
		}
		
		private RegisterDAO(){}


}
