package customer.servicescustomer.portal.presentation.layer;

import customer.servicescustomer.portal.buisness.layer.CustomerServices;
import customer.servicescustomer.portal.buisness.layer.CustomerServicesImpl;
import customer.servicescustomer.portal.models.Customer;

public class Controller {

	public static void main(String[] args) {

		CustomerServices service = new CustomerServicesImpl();

		// save
		// Customer cust = new Customer("Rohit", "sharma", "rohit.sharma@gmail.com",
		// "8976543456");
		// Customer cust = new Customer("Ajinkya", "Rahane", "ajinkya.rahane@gmail.com",
		// "9988543456");
//		Customer cust = new Customer("MS", "dhoni", "ms.dhoni@gmail.com", "7878543456");
//		service.insert(cust);

		// get //load

//		  Customer cust = service.getCustomer("C - ms.dhoni7878");
//		  System.out.println(cust);

		// update
//		 Customer cust = service.getCustomer("C - ajinkya.rahane9988");
//		 cust.setMailId("a.rahane123@gmail.com");
//		 service.update(cust);
		
		
		// delete

		Customer cust = service.getCustomer("C - ms.dhoni7878");
		if (cust != null) {
			service.delete(cust.getCustomerId());
		}

		//

	}
}
