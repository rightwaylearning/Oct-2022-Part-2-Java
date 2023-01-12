package collection_api.list.array.list.opt;

import java.util.ArrayList;
import java.util.Iterator;

public class SerchGivenProdutDeatisl {
	
	


	public static void main(String[] args) {
		
		ArrayList<Product> al=new ArrayList<Product>();
		// size 4  >> valid index range  0 - 3
		al.add(new Product(1, "TV", "electronic"));
		al.add(new Product(2, "pen", "study material"));
		al.add(new Product(3, "mobile", "electronic"));
		al.add(new Product(4, "notebook", "study matrial"));
		
		
		
		//  name  = mobile  >>> need full object
		
		Product p = getproduct("TV", al);
		System.out.println(p);
		
	}
	
	
	public static Product getproduct(String productName, ArrayList<Product> list) {
		
//		for (Product product : list) {
//			if(productName.equals(product.getProductName())) {
//				return product;
//			}
//		}
		
		Iterator<Product> itr = list.iterator();
		while(itr.hasNext()) {
			Product p = itr.next();
			if(p.getProductName().equals(productName)) {
				return p;
			}
		}
		
		
		return null;
	}
	
}
