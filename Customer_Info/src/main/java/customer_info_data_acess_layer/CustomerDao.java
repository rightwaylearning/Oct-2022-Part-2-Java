package customer_info_data_acess_layer;

import customer_info_modelclass.Customer;

public interface CustomerDao {

	public String insert(Customer cust);
	public void update(Customer cust);
	public void delete(Customer cust);
	public Customer getcustomer(String custid);
	
}
