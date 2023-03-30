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
	public List<Product> getAllProducts() throws Exception{
		
		PreparedStatement stm = con.prepareStatement("select distinct product_id,product_name,price from product");
		ResultSet result = stm.executeQuery();
		
		List<Product>  products = new ArrayList<>();
		
		while(result.next()){
			Product p = new Product();
			p.setProductId(result.getInt(1));
			p.setProductName(result.getString(2));
			p.setPrice(result.getDouble(3));
			
			products.add(p);
			
		}
		
		
		return products;
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
	public Product getProduct(Integer productId) throws Exception {

		PreparedStatement stm = con.prepareStatement("select distinct product_id,product_name,price from product where product_id = ?");
		stm.setInt(1, productId);
		ResultSet result = stm.executeQuery();
		
		Product  product = new Product();
		
		if(result.next()){
			product.setProductId(result.getInt(1));
			product.setProductName(result.getString(2));
			product.setPrice(result.getDouble(3));
		}
		
		return product;
	}

	@Override
	public List<Object[]> getCustomerPurchedDeatails(Integer custometId) throws Exception{

		PreparedStatement stm  = con.prepareStatement("select c.customer_id,c.customer_name,p.product_name,p.price,p.quntity from customer c inner join product p ON c.customer_id = p.fk_customer_id where c.customer_id = ?");
		stm.setInt(1, custometId);
		ResultSet result = stm.executeQuery();
		List<Object[]> list = new ArrayList<>();
		
		while(result.next()) {
			Object[] obj = new Object[6];
			obj[0] = result.getInt(1);
			obj[1] = result.getString(2);
			obj[2] = result.getString(3);
			obj[3] = result.getDouble(4);
			obj[4] = result.getInt(5);
			obj[5] = result.getDouble(4) * result.getInt(5);
			
			list.add(obj);
		}
			
		
		return list;
	}

}
