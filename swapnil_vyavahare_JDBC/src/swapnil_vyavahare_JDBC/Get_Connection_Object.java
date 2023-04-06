package swapnil_vyavahare_JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Get_Connection_Object {

	
	public static Connection getConnection() throws SQLException {
		
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/studen","root","root");		
		return con;
	}
}
