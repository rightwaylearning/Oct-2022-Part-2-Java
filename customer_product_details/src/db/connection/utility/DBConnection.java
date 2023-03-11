package db.connection.utility;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {

	public static Connection getConnection() {
		Connection con = null;
		try {
		 con = DriverManager.getConnection("jdbc:mysql://localhost:3306/college","root","root");
		}
		catch (Exception e) {
			System.out.println(e);
		}
		return con;
	}
}
