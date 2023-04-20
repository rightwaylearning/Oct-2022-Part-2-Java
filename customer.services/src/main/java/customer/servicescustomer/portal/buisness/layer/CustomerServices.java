package customer.servicescustomer.portal.buisness.layer;

import customer.servicescustomer.portal.models.Customer;

public interface CustomerServices {

	public String insert(Customer cust);
	public boolean update(Customer cust);
	public boolean delete(String customerId);
	public Customer getCustomer(String customerId);
}
