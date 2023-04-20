package customer.servicescustomer.portal.data_access.layer;

import org.hibernate.Session;
import org.hibernate.Transaction;

import create.session.factroy.GetSessionFactroy;
import customer.servicescustomer.portal.models.Customer;

public class CustomerDaoImpl implements CustomerDao {

	@Override
	public String insert(Customer cust) {
		String id = null;
		if (cust.getCustomerFirstName() != null && cust.getCustomerLastName() != null) {
			Session session = GetSessionFactroy.getSessionFactroty().openSession();
			Transaction tx = session.beginTransaction();
			id = (String) session.save(cust);
			tx.commit();
			session.close();
		}
		return id;
	}

	@Override
	public void update(Customer cust) {
		if (cust.getCustomerId() != null && cust.getCustomerFirstName() != null && cust.getCustomerLastName() != null) {
			Session session = GetSessionFactroy.getSessionFactroty().openSession();
			Transaction tx = session.beginTransaction();
			session.merge(cust);
			tx.commit();
			session.close();
		}
	}

	@Override
	public void delete(Customer cust) {
		if (cust.getCustomerId() != null) {
			Session session = GetSessionFactroy.getSessionFactroty().openSession();
			Transaction tx = session.beginTransaction();
			session.delete(cust);
			tx.commit();
			session.close();
		}
	}

	@Override
	public Customer getCustomer(String customerId) {
		Customer cust = null;
		if (customerId != null) {
			Session session = GetSessionFactroy.getSessionFactroty().openSession();
			cust = session.get(Customer.class, customerId);
			session.close();
		}
		return cust;
	}

}
