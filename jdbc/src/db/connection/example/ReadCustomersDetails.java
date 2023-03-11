package db.connection.example;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class ReadCustomersDetails {

	public List<Customer> readAllCustomersDewatils() throws Exception {
		
		Connection con = CreateConnectionObject.getConnection();
		
		PreparedStatement stm = con.prepareStatement("select cust_id,name,mail_id,cell_no from customers");
		
		ResultSet  result = stm.executeQuery();
		
		List<Customer> data = new ArrayList<>();
		
		while(result.next()) {
			Customer cust = new Customer(result.getInt(1),result.getString(2),result.getString(3),result.getString(4));
			data.add(cust);
		}
		
		return data;
		
	}
}
