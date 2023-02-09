package treemap.demo;

import java.util.List;
import java.util.Set;
import java.util.TreeMap;

public 
class Opt{
	private TreeMap<Customer, List<Iteam>> map;
	
	public Opt() {
		map = new TreeMap<>();
	}
	
	void addCustometDetails(Customer cust, List<Iteam> iteams) {
		this.map.put(cust, iteams);
	}
	
	void showCustomerDetails() {
		
		Set<Customer> set = map.keySet();
		
		for(Customer c:set) {
			
			List<Iteam> list = this.map.get(c);
			System.out.println(c);
			
			for(Iteam i:list) {
				System.out.println("     "+i);
			}
			
			System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>");
		}
		
	}
}
