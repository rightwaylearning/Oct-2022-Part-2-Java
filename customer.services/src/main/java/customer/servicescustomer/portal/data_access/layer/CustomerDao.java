package customer.servicescustomer.portal.data_access.layer;

import customer.servicescustomer.portal.models.Customer;

public interface CustomerDao {
	public String insert(Customer cust);
	public void update(Customer cust);
	public void delete(Customer cust);
	public Customer getCustomer(String customerId);
}
