package customer_info_businesslayer;

import customer_info_modelclass.Customer;

public interface CustomerService {
	
	public String insert(Customer cust);
	public boolean update(Customer cust);
	public boolean delete(String custid);
	public Customer getcustomer(String custid);

}
