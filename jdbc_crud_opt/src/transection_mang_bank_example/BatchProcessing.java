package transection_mang_bank_example;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import utility.functionality.DBConnection;

public class BatchProcessing {

	void openAccount(List<Account> list) throws SQLException {
		Connection con = DBConnection.getConnection();
		PreparedStatement stm = con.prepareStatement("insert into SBI values(?,?,?)");
		
		for (Account account : list) {
			try {
				stm.setInt(1, account.getAccounTnumber());
				stm.setString(2, account.getAccountHolderName());
				stm.setDouble(3, account.getBalance());
				stm.addBatch();
			}catch (Exception e) {
				System.out.println(e);
			}
		}
		
		int[] arr= stm.executeBatch();
		
	}
}
