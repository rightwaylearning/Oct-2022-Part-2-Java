package customer.dao;

import java.util.List;

import customer.models.Customer;

public interface ICustomerDao {

	public List<Object[]> getAllCustomersale();
	public Integer insertCustomerDetails(Customer customer);
	public Customer getCustomerDeatils(Integer customerId);
	public int deleteCustomer(Integer customerId);
	public int updateProductRate(Integer customerId, Integer ProductId, Double discount);
}
