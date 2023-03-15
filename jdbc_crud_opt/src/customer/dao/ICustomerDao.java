package customer.dao;

import java.sql.ResultSet;

import customer.models.Customer;

public interface ICustomerDao {

	public ResultSet getAllCustomersale();
	public Integer insertCustomerDetails(Customer customer) throws Exception;
	public ResultSet getCustomerDeatils(Integer customerId);
	public Integer deleteCustomer(Integer customerId);
	public Integer deleteProduct(Integer customerId);
	public Integer updateProductRate(Integer customerId, Integer ProductId, Double discount);
}
