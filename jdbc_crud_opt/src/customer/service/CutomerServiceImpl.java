package customer.service;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.mysql.cj.protocol.ResultListener;

import customer.dao.CustomerDaoImpl;
import customer.dao.ICustomerDao;
import customer.models.Customer;
import customer.models.Product;

public class CutomerServiceImpl implements ICutomerService {

	private ICustomerDao customerDao;

	public CutomerServiceImpl() {
		this.customerDao = new CustomerDaoImpl();
	}

	@Override
	public Map<Customer, List<Product>> getAllCustomersale() {

		Map<Customer, List<Product>> map = new HashMap<>();

		ResultSet result = customerDao.getAllCustomersale();
		try {
			while (result.next()) {

				Customer cust = new Customer(null, result.getString(1), result.getString(2));
				Product product = new Product(null, null, result.getString(3), result.getDouble(4), result.getInt(5));

				if (map.containsKey(cust)) {
					List<Product> list = map.get(cust);
					list.add(product);
					map.put(cust, list);

				} else {
					List<Product> list = new ArrayList<>();
					list.add(product);
					map.put(cust, list);
				}

			}
		} catch (Exception e) {
			System.out.println(e);
		}

		return map;
	}

	@Override
	public Integer insertCustomerDetails(Customer customer) {
		Integer updatedRow = null;
		try {
			if (customer.getCustometId() != null && customer.getCustomerName() != null
					&& customer.getContactNumber() != null) {
				updatedRow = customerDao.insertCustomerDetails(customer);
			}
		} catch (Exception e) {
		}
		return updatedRow;
	}

	@Override
	public Customer getCustomerDeatils(Integer customerId) {
		Customer cust = null;
		if (customerId != null) {
			try {
				ResultSet set = customerDao.getCustomerDeatils(customerId);
				if (set.next()) {
					cust = new Customer(set.getInt(1), set.getString(2), set.getString(3));
				}

			} catch (Exception e) {
				System.out.println(e);
			}

		}

		return cust;
	}

	@Override
	public Integer deleteCustomer(Integer customerId) {
		Integer deletedRow = null;
		if (customerId != null) {
			Integer productDeleted = deleteProduct(customerId);
			System.out.println("productDeleted  " + productDeleted);
			deletedRow = customerDao.deleteCustomer(customerId);
		}
		return deletedRow;
	}

	@Override
	public Integer updateProductRate(Integer customerId, Integer ProductId, Double discount) {
		Integer updatedRows = null;
		if (customerId != null && ProductId != null && discount != null) {
			updatedRows = customerDao.updateProductRate(customerId, ProductId, discount);
		}

		return updatedRows;
	}

	@Override
	public Integer deleteProduct(Integer customerId) {
		Integer deletedRow = null;
		if (customerId != null) {
			deletedRow = customerDao.deleteProduct(customerId);
		}
		return deletedRow;
	}

}
