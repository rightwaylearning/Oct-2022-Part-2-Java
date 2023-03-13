package customer.contoller;

import customer.models.Customer;
import customer.service.CutomerServiceImpl;
import customer.service.ICutomerService;

public class EntryPoint {

	public static void main(String[] args) {
		
		ICutomerService cutomerService = new CutomerServiceImpl();
		
		Customer customer = new Customer(105, "Sundar", "mishra");
		Integer updatedRow = cutomerService.insertCustomerDetails(customer);
		System.out.println("Inserted rows " + updatedRow);
	}
}
