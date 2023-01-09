package collection_api.list.array.list.opt;

public class Product {

	private Integer productId;
	private String productName;
	private String productType;
	
	public Product() {}
	
	
	public Product(Integer productId, String productName, String productType) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.productType = productType;
	}


	public Integer getProductId() {
		return productId;
	}
	public void setProductId(Integer productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getProductType() {
		return productType;
	}
	public void setProductType(String productType) {
		this.productType = productType;
	}
	
	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productName=" + productName + ", productType=" + productType
				+ "]";
	}
		
}
