package customer_info_data_acess_layer;

import org.hibernate.Session;
import org.hibernate.Transaction;

import create.session.factory.GetSession_Factory;
import customer_info_modelclass.Customer;

public class Customer_Daoimpl implements CustomerDao {

	@Override
	public String insert(Customer cust) {
		String id=null;
		
		if (cust.getCustfirstname()!=null && cust.getCustlastname()!=null) {
			Session session = GetSession_Factory.getsessionfactory().openSession();
			Transaction tx = session.beginTransaction();
			id= (String) session.save(cust);
			tx.commit();
			session.close();
		}
		return id;
	}

	@Override
	public void update(Customer cust) {
		if (cust.getCustomerId() != null && cust.getCustfirstname() != null && cust.getCustlastname() != null) {
			Session session = GetSession_Factory.getsessionfactory().openSession();
			Transaction tx = session.beginTransaction();
			session.merge(cust);
			tx.commit();
			session.close();
		}
		
		
	}

	@Override
	public void delete(Customer cust) {
		if (cust.getCustomerId() != null ) {
			Session session = GetSession_Factory.getsessionfactory().openSession();
			Transaction tx = session.beginTransaction();
			session.delete(cust);
			tx.commit();
			session.close();
		}		
	}

	@Override
	public Customer getcustomer(String custid) {
		Customer cust=null;
		if (custid !=null) {
			Session session = GetSession_Factory.getsessionfactory().openSession();
			cust=session.get(Customer.class, custid);
			session.close();
		}
		return cust;
	}

}
