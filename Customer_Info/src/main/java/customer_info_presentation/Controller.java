package customer_info_presentation;

import customer_info_businesslayer.CustomerService;
import customer_info_businesslayer.CustomerServiceimpl;
import customer_info_modelclass.Customer;

public class Controller {

	public static void main(String[] args) {
		CustomerService service = new CustomerServiceimpl();
		
//		//save operation
//		Customer cust = new Customer("ms", "dhoni", "ms.dhoni@gmail.com", "2587413690");
//		service.insert(cust);
		
		// update
		 Customer cust = service.getcustomer("C - ms.dhoni2587");
		 cust.setMail("m.dhoni123@gmail.com");
		 service.update(cust);
		
		
//		Customer cust = service.getcustomer("C - virat.kohli7894");
//		if (cust != null) {
//			service.delete(cust.getCustomerId());
//		}

	}

}
