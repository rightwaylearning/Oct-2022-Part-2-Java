package customer.servicescustomer.portal.buisness.layer;

import customer.servicescustomer.portal.data_access.layer.CustomerDao;
import customer.servicescustomer.portal.data_access.layer.DaoFactroy;
import customer.servicescustomer.portal.models.Customer;

public class CustomerServicesImpl implements CustomerServices {

	private CustomerDao customerDao = null;

	public CustomerServicesImpl() {
		this.customerDao = DaoFactroy.getCustomerDaoInstance();
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
	public boolean delete(String customerId) {

		if(customerId != null) {
			Customer cust = new Customer();
			cust.setCustomerId(customerId);
			customerDao.delete(cust);
		}
		return true;
	}

	@Override
	public Customer getCustomer(String customerId) {
		
		if(customerId != null) {
			return customerDao.getCustomer(customerId);
		}
		return null;
	}

}
