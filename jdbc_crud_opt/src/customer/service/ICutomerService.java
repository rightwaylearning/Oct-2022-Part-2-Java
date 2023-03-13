package customer.service;

import java.util.List;
import java.util.Map;

import customer.models.Customer;
import customer.models.Product;

public interface ICutomerService {

	public Map<Customer, List<Product>> getAllCustomersale();
	public Integer insertCustomerDetails(Customer customer);
	public Customer getCustomerDeatils(Integer customerId);
	public int deleteCustomer(Integer customerId);
	public int updateProductRate(Integer customerId, Integer ProductId, Double discount);
	
}
