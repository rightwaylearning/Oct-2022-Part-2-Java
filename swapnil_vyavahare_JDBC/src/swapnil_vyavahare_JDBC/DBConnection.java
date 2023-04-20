package swapnil_vyavahare_JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DBConnection {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/studen","root","root");
        PreparedStatement stm = con.prepareStatement("insert into studentinfo values(?,?,?,?)");
        stm.setInt(1, 2);
        stm.setString(2, "Rohan");
        stm.setString(3, "Vyavahare");
        stm.setInt(4, 20);
        
        int i = stm.executeUpdate();
        System.out.println(i);
	}

}
