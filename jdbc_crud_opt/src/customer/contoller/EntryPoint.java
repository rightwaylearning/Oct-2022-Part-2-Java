package customer.contoller;

import customer.service.CutomerServiceImpl;
import customer.service.ICutomerService;

public class EntryPoint {

	public static void main(String[] args) {
		
		ICutomerService cutomerService = new CutomerServiceImpl();
		
//		Customer customer = new Customer(105, "Sundar", "mishra");
//		Integer updatedRow = cutomerService.insertCustomerDetails(customer);
//		System.out.println("Inserted rows " + updatedRow);
		
//		Integer deletedRecord = cutomerService.deleteCustomer(103);
//		System.out.println("deleted customer "+ deletedRecord);
		
//		Integer updatedRecord  = cutomerService.updateProductRate(101,12,20.00);
//		System.out.println("updatedRecord = "+ updatedRecord);
		
		System.out.println(cutomerService.getAllCustomersale());
	}
}
