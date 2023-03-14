package customer.service;

import java.util.List;
import java.util.Map;

import customer.models.Customer;
import customer.models.Product;

public interface ICutomerService {

	public Map<Customer, List<Product>> getAllCustomersale();
	public Integer insertCustomerDetails(Customer customer);
	public Customer getCustomerDeatils(Integer customerId);
	public Integer deleteCustomer(Integer customerId);
	public Integer deleteProduct(Integer customerId);
	public Integer updateProductRate(Integer customerId, Integer ProductId, Double discount);
	
}
