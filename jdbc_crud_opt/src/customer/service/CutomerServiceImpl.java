package customer.service;

import java.util.List;
import java.util.Map;

import customer.dao.CustomerDaoImpl;
import customer.dao.ICustomerDao;
import customer.models.Customer;
import customer.models.Product;

public class CutomerServiceImpl implements ICutomerService{

	private ICustomerDao customerDao;
	
	public CutomerServiceImpl() {
		this.customerDao = new CustomerDaoImpl();
	}
	
	@Override
	public Map<Customer, List<Product>> getAllCustomersale() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Integer insertCustomerDetails(Customer customer) {
		Integer updatedRow = null;
		if(customer.getCustometId() != null && customer.getCustomerName() != null && customer.getContactNumber() != null) {
		  updatedRow  = customerDao.insertCustomerDetails(customer);
		}
		return updatedRow;
	}

	@Override
	public Customer getCustomerDeatils(Integer customerId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int deleteCustomer(Integer customerId) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateProductRate(Integer customerId, Integer ProductId, Double discount) {
		// TODO Auto-generated method stub
		return 0;
	}

}
