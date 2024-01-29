package DB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class HelpDB {

	//DB자원
	private final String HOST="jdbc:mysql://127.0.0.1:3306/University";
	private final String USER="root";
	private final String PASS="1234";
	
	protected Connection conn=null;
	protected Statement stmt=null;
	protected PreparedStatement pstmt=null;
	protected ResultSet rs = null;
		
		
	public Connection getConnection() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		return DriverManager.getConnection(HOST,USER,PASS);
	}
	
	public void close() throws SQLException {
		if(conn!=null)
			conn.close();
		if(stmt!=null)
			stmt.close();
		if(pstmt!=null)
			pstmt.close();
		if(rs!=null)
			rs.close();
	}		
}
