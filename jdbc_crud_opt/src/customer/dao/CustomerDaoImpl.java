package customer.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
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
	public List<Object[]> getAllCustomersale() {
		// TODO Auto-generated method stub
		return null;
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
	public Customer getCustomerDeatils(Integer customerId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int deleteCustomer(Integer customerId) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateProductRate(Integer customerId, Integer ProductId, Double discount) {
		// TODO Auto-generated method stub
		return 0;
	}

}
