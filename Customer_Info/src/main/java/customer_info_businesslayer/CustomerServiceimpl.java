package customer_info_businesslayer;

import customer_info_data_acess_layer.CustomerDao;
import customer_info_data_acess_layer.Dao_Factory;
import customer_info_modelclass.Customer;

public class CustomerServiceimpl implements CustomerService {
	
	private CustomerDao customerDao = null;
	
	public CustomerServiceimpl() {
		this.customerDao=Dao_Factory.getcustomerDaoInstace();
	}

	@Override
	public String insert(Customer cust) {
		String custId =null;
		if (cust != null) {
			custId=	customerDao.insert(cust);
		}
		return custId;
	}

	@Override
	public boolean update(Customer cust) {
		if(cust != null) {
			customerDao.update(cust);
		}
		return true;
	}

	@Override
	public boolean delete(String custid) {
		if(custid != null) {
			Customer cust = new Customer();
			cust.setCustomerId(custid);
			customerDao.delete(cust);
		}
		return true;
	}

	@Override
	public Customer getcustomer(String custid) {
		if(custid != null) {
			return customerDao.getcustomer(custid);
		}
		return null;
	}

}
