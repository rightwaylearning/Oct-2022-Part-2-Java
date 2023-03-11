package db.connection.example;

import java.util.List;

public class DBConnection {
	
	public static void main(String[] args) throws Exception{
	
		ReadCustomersDetails obj= new ReadCustomersDetails();
		List<Customer> customers = obj.readAllCustomersDewatils();
		
		for (Customer customer : customers) {
			System.out.println(customer);
		}
		
	}

}
