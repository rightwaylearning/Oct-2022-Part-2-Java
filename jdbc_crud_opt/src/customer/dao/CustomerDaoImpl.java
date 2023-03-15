package customer.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import customer.models.Customer;
import utility.functionality.DBConnection;
import utility.functionality.DBQueries;

public class CustomerDaoImpl implements ICustomerDao {

	private Connection con = null;

	public CustomerDaoImpl() {
		con = DBConnection.getConnection();
	}

	@Override
	public ResultSet getAllCustomersale() {
		ResultSet result = null;
		try {
			PreparedStatement stm = con.prepareStatement("select c.customer_name,c.contact_no,p.product_name,p.price,p.quntity from customer c inner join product p on c.customer_id = p.fk_customer_id");
		    result=  stm.executeQuery();
		} catch (Exception e) {
			System.out.println(e);
		}
		return result;
	}

	@Override
	public Integer insertCustomerDetails(Customer customer) {

		Integer insertRow  = null;
		try {
			if (con != null) {
				PreparedStatement stm = con.prepareStatement(DBQueries.INSERT_CUSTOMER);
			    stm.setInt(1, customer.getCustometId());
			    stm.setString(2, customer.getCustomerName());
			    stm.setString(3, customer.getContactNumber());
			    insertRow = stm.executeUpdate();
			}
		} catch (Exception e) {
			System.out.println(e);
		}

		return insertRow;
	}

	@Override
	public ResultSet getCustomerDeatils(Integer customerId) {
		ResultSet cust = null;
		try {
			PreparedStatement stm =con.prepareStatement("select customer_id, customer_name, contact_no from customer where customer_id = ?");
		    stm.setInt(1, customerId);	
			cust = stm.executeQuery();	
		} catch (Exception e) {
			System.out.println(e);
		}
		
		return cust;
	}

	@Override
	public Integer deleteCustomer(Integer customerId) {
		Integer deletedRows = null;
		try {
           PreparedStatement stm = con.prepareStatement("delete from customer c where c.customer_id = ?");			
	       stm.setInt(1, customerId);	
	       deletedRows = stm.executeUpdate();	
		}catch (Exception e) {
			System.out.println(e);
		}
		
		return deletedRows;
	}
	
	@Override
	public Integer deleteProduct(Integer customerId) {
		Integer deletedRows = null;
		try {
           PreparedStatement stm = con.prepareStatement("delete from product p where p.fk_customer_id = ?");			
	       stm.setInt(1, customerId);	
	       deletedRows = stm.executeUpdate();	
		}catch (Exception e) {
			System.out.println(e);
		}
		
		return deletedRows;
	}

	@Override
	public Integer updateProductRate(Integer customerId, Integer ProductId, Double discount) {
		 Integer updatedRows = null; 
			System.out.println(customerId +", " + ProductId +", "+discount);
		    try {
				 PreparedStatement stm = con.prepareStatement("update product p set p.price = p.price - ? where p.fk_customer_id = ? and p.product_id = ?");
			
				 stm.setDouble(1, discount);
				 stm.setInt(2, customerId);
				 stm.setInt(3, ProductId);
				 updatedRows =  stm.executeUpdate(); 
		    } catch (Exception e) {
				System.out.println(e);
			}
		    
			return updatedRows;
	}

}
