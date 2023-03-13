package customer.models;

public class Product {
 
	private Integer recordId;
	private Integer productId;
	private String productName;
	private Double price;
	private Integer quantity;
	
	public Product() {}

	public Product(Integer recordId, Integer productId, String productName, Double price, Integer quantity) {
		super();
		this.recordId = recordId;
		this.productId = productId;
		this.productName = productName;
		this.price = price;
		this.quantity = quantity;
	}

	public Integer getRecordId() {
		return recordId;
	}

	public void setRecordId(Integer recordId) {
		this.recordId = recordId;
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

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	@Override
	public String toString() {
		return "Product [recordId=" + recordId + ", productId=" + productId + ", productName=" + productName
				+ ", price=" + price + ", quantity=" + quantity + "]";
	}
	
	
}
