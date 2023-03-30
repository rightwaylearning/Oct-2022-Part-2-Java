package my.service;

import java.util.List;

import customer.product.opt.ICustomerAndProductDetails;
import customer.product.opt.ICustomerAndProductDetailsImpl;
import models.Customer;
import models.Product;

public class EntryPoint {

	public static void main(String[] args) throws Exception{
		// P p= new C();
		ICustomerAndProductDetails service = new ICustomerAndProductDetailsImpl();
		
		List<Customer> list = service.getAllCutomerDetails();
		
		for (Customer customer : list) {
			System.out.println( customer.getCustometId()+"]"+customer.getCustomerName());
		}
		
		System.out.println("========================================");
		
//		Customer object = service.getCustomerDetails(104);
//		System.out.println(object);
		
		System.out.println("===============================================");
//		
//		 List<Product> products =  service.getAllProducts();
//		 
//		 for (Product product : products) {
//			System.out.println(product);
//		}
//		 
		System.out.println("====================================");
//		
//		Product product =  service.getProduct(12);
//		System.out.println(product);
//
//		System.out.println("=================================");
//		
//		List<Object[]> data = service.getCustomerPurchedDeatails(103) ;
//		Object[] fisrtObj = data.get(0);
//		System.out.println("Cust Id:"+fisrtObj[0]+"                Name:"+fisrtObj[1]);
//		System.out.println("----------------------------------------");
//		for(Object[] obj : data) {
//			System.out.print(obj[2]+"    ");
//			System.out.print(obj[3]+"    ");
//			System.out.print(obj[5]+"    ");
//			System.out.println();
//		}
	}
}
