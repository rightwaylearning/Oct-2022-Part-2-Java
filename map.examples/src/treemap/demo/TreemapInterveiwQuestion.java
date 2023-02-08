package treemap.demo;

import java.util.List;
import java.util.TreeMap;

public class TreemapInterveiwQuestion {

	public static void main(String[] args) {
		
		TreeMap<Customer, List<Items>> map = new TreeMap<>();
		
	}
}

class Customer{
	private Integer custId;
	private String name;
}

class Items{
	Integer itemId;
    String itemName;
    double pricePerItem;
    Integer qnty;
}

