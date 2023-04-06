package swapnil_vyavahare_JDBC;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Insert_Record {

	public int insertRecord(int studentid, String firstName, String lastname, int rollNum) throws SQLException {

		Connection con = Get_Connection_Object.getConnection();
		PreparedStatement stm = con.prepareStatement("insert into studentinfo values(?,?,?,?)");
		stm.setInt(1, studentid);
		stm.setString(2, firstName);
		stm.setString(3, lastname);
		stm.setInt(4, rollNum);

		

		return stm.executeUpdate();

	}

}
