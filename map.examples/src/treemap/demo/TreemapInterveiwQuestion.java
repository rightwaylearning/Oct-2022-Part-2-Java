package treemap.demo;

import java.util.ArrayList;
import java.util.List;

public class TreemapInterveiwQuestion {

	public static void main(String[] args) {
		
		Opt opt=new Opt();
		
		Customer c1= new Customer(1, "Mayur");
		
		List<Iteam> list = new ArrayList<>();
		list.add(new Iteam(1, "Sugar", 38.50, 12));
		list.add(new Iteam(2, "Washing Powder", 98.50, 2));
		list.add(new Iteam(3, "oil", 185.0, 5));
		
        Customer c2= new Customer(11, "Mahidra");
		List<Iteam> list1 = new ArrayList<>();
		list1.add(new Iteam(67, "Mobile", 15000, 1));
		list1.add(new Iteam(31, "oil", 185.0, 15));
		
		
		opt.addCustometDetails(c2, list1);
		opt.addCustometDetails(c1, list);
		opt.showCustomerDetails();
		
		
	}
}
