package transection.mang.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.List;

import customer.models.Customer;
import customer.models.Product;
import utility.functionality.DBConnection;
import utility.functionality.DBQueries;

public class TransectionMang {

	
	public void sale(Customer customer, List<Product> products) throws Exception{
		Connection con = DBConnection.getConnection();
		try {
			con.setAutoCommit(false);
			PreparedStatement stm = con.prepareStatement("insert into customer values (?,?,?)");
		    stm.setInt(1, customer.getCustometId());
		    stm.setString(2, customer.getCustomerName());
		    stm.setString(3, customer.getContactNumber());
		    stm.executeUpdate();
		    for (Product product : products) {
				PreparedStatement stm1 = con.prepareStatement("insert into product values(?,?,?,?,?,?)");
				stm1.setInt(1, product.getRecordId());
		    	stm1.setInt(2, product.getProductId());
		    	stm1.setString(3, product.getProductName());
		    	stm1.setDouble(4, product.getPrice());
		    	stm1.setInt(5, product.getQuantity());
		    	stm1.setInt(6, customer.getCustometId());
		    	stm1.executeUpdate();
			}
		    con.commit();
		    
		}catch (Exception e) {
			con.rollback();
			System.out.println(e);
		}
	}
	
}
