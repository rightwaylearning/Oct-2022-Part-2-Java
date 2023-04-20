package customer.servicescustomer.portal.data_access.layer;

public class DaoFactroy {
	public static CustomerDao getCustomerDaoInstance() {
		CustomerDao dao =new CustomerDaoImpl();
		return dao;
	}
}
