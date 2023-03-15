package transection.mang.example;

import java.util.ArrayList;
import java.util.List;

import customer.models.Customer;
import customer.models.Product;

public class Client {

	public static void main(String[] args) throws Exception {
		TransectionMang tx = new TransectionMang();
		
		Customer cust = new Customer(1022, "Suresh", "9067543456");
		
		Product p1= new Product(7,12,"pen",50.00,30);
		Product p2= new Product(8,13,"notebook",50.00,10);
		
		List<Product> list = new ArrayList<>();
		list.add(p1); list.add(p2);
		
		tx.sale(cust, list);
		
		
	}
}
