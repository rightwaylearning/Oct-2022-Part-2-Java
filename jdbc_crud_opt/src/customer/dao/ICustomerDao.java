package customer.dao;

import java.sql.ResultSet;

import customer.models.Customer;

public interface ICustomerDao {

	public ResultSet getAllCustomersale();
	public Integer insertCustomerDetails(Customer customer);
	public Customer getCustomerDeatils(Integer customerId);
	public Integer deleteCustomer(Integer customerId);
	public Integer deleteProduct(Integer customerId);
	public Integer updateProductRate(Integer customerId, Integer ProductId, Double discount);
}
