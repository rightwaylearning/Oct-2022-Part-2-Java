package transection_mang_bank_example;

import java.sql.Connection;
import java.sql.PreparedStatement;

import utility.functionality.DBConnection;

public class Service {

	void balanceTransferService(Integer toAccountNumber, Integer fromAccount, Double balance) {
		Connection con = null;
		try {
		    con = DBConnection.getConnection();
		    con.setAutoCommit(false);
		    PreparedStatement stm = con.prepareStatement("update  SBI set balance = balance - ? where account_number = ?");
            stm.setDouble(1, balance);
            stm.setInt(2, fromAccount);
		    stm.executeUpdate();
		    
		    PreparedStatement stm1= con.prepareStatement("update ICICI set balance = balance + ? where account_number = ?");
		    stm1.setDouble(1, balance);
            stm1.setInt(2, toAccountNumber);
            int r = 10/0;
            stm1.executeUpdate();
            
            con.commit();

		} catch (Exception e) {
			try {
				con.rollback();
			} catch (Exception e2) {}
			System.out.println(e);
		}

	}
}
