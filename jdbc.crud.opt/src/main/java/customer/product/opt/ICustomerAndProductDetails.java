package customer.product.opt;

import java.util.List;

import models.Customer;
import models.Product;

public interface ICustomerAndProductDetails {
	
	List<Customer> getAllCutomerDetails() throws Exception;
	
	List<Product> getAllProducts() throws Exception;
	
	Customer getCustomerDetails(Integer custometrId) throws Exception;
	
	Product getProduct(Integer productId) throws Exception;
	
	List<Object[]> getCustomerPurchedDeatails(Integer custometId) throws Exception;
}
