package insert.record;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class InsertRecord {

	public int insertRecord(Integer id, String name, String mailId, String cellNo) throws Exception{
		
		Connection con = GetCoonectionObject.getConnection();
		PreparedStatement stm = con.prepareStatement("insert into customers values(?,?,?,?)");
		stm.setInt(1, id);
		stm.setString(2, name);
		stm.setString(3, mailId);
		stm.setString(4, cellNo);
		return stm.executeUpdate();
	}
}
