package rwl.org_jdbc_employee_crud_operation.utility;

import java.sql.Connection;
import java.sql.DriverManager;

public class DbConnection {

	public static Connection getDBConnection() throws Exception {
		Connection con=	DriverManager.getConnection("jdbc:mysql://localhost:3306/mine?useSSL=false", "root", "root");
        return con;
	}
}
