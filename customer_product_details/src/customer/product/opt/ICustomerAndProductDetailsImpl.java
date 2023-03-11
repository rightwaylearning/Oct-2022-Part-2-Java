package customer.product.opt;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import db.connection.utility.DBConnection;
import models.Customer;
import models.Product;

public class ICustomerAndProductDetailsImpl  implements ICustomerAndProductDetails{

	private Connection con =null;
	
	public ICustomerAndProductDetailsImpl() {
		con = DBConnection.getConnection();
	}
	
	@Override
	public List<Customer> getAllCutomerDetails() throws Exception{
		
		PreparedStatement stm = con.prepareStatement("select customer_id, customer_name, contact_no from customer");
		ResultSet result =  stm.executeQuery();
		
		List<Customer>  list = new ArrayList<>();
		
		while(result.next()) {
		  Customer cust = new Customer(result.getInt(1),result.getString(2),result.getString(3));	
		  list.add(cust);
		}
		
		return list;
	}

	@Override
	public List<Product> getAllProducts() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Customer getCustomerDetails(Integer custometrId) throws Exception{
		
		PreparedStatement stm = con.prepareStatement("select customer_id, customer_name, contact_no from customer where customer_id = ?");
		stm.setInt(1, custometrId);
		ResultSet result =  stm.executeQuery();
		
		Customer cust = null;
		if(result.next()) {
			cust = new Customer(result.getInt(1),result.getString(2),result.getString(3));	
		}

		return cust;
	}

	@Override
	public Product getProductDetaisl(Integer productId) {
		// TODO Auto-generated method stub
		return null;
	}

}
