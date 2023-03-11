package my.service;

import java.util.List;

import customer.product.opt.ICustomerAndProductDetailsImpl;
import models.Customer;

public class EntryPoint {

	public static void main(String[] args) throws Exception{
		
		ICustomerAndProductDetailsImpl service = new ICustomerAndProductDetailsImpl();
		
		List<Customer> list = service.getAllCutomerDetails();
		
		for (Customer customer : list) {
			System.out.println( customer.getCustometId()+"]"+customer.getCustomerName());
		}
		
	}
}
