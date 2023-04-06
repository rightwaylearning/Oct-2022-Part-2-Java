package utility.com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {

	public static Connection getconnection() {
		
		Connection con =null;
		
		try {
			 con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc","root","root");
		} catch (SQLException e) {
			System.out.println(e);
		}
		
		return con;
	}

}
