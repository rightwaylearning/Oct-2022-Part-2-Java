package db.connection.example;

import java.sql.Connection;
import java.sql.DriverManager;

public class CreateConnectionObject {

	public static Connection getConnection() throws Exception {
		
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/college","root","root");
		return con;
	}
}
