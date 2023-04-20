package transaction.management.com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import utility.com.DBConnection;



public class Service {
	
	
	void balancetransferservice(Integer toaccountnumber, Integer fromaccount, Double balance) {
		Connection con = null;
		
		
		
		try {
			con = DBConnection.getconnection();
			PreparedStatement stm = con.prepareStatement("update  sbi set balance = balance-?  where accountnumber = ?");
			stm.setDouble(1, balance);
			stm.setInt(2, fromaccount);
			stm.executeUpdate();
			
			
			PreparedStatement stm1 = con.prepareStatement("update  unionbank set balance = balance + ? where accountnumber = ?");
		    stm1.setDouble(1, balance);
		    stm1.setInt(2, toaccountnumber);
		    int i = stm1.executeUpdate();
		    System.out.println(i);
		    
		    
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
