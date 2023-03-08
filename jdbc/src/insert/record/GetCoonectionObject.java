package insert.record;

import java.sql.Connection;
import java.sql.DriverManager;

public class GetCoonectionObject {

	public static Connection getConnection() throws Exception{
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/college","root","root");
		return con;
	}
}
