package db.connection.example;

public class Customer {

	private Integer custometId;
	private String customerName;
	private String custometMaildId;
	private String cellPhoneNumber;
	
	public Customer() {}

	public Customer(Integer custometId, String customerName, String custometMaildId, String cellPhoneNumber) {
		super();
		this.custometId = custometId;
		this.customerName = customerName;
		this.custometMaildId = custometMaildId;
		this.cellPhoneNumber = cellPhoneNumber;
	}

	public Integer getCustometId() {
		return custometId;
	}

	public void setCustometId(Integer custometId) {
		this.custometId = custometId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustometMaildId() {
		return custometMaildId;
	}

	public void setCustometMaildId(String custometMaildId) {
		this.custometMaildId = custometMaildId;
	}

	public String getCellPhoneNumber() {
		return cellPhoneNumber;
	}

	public void setCellPhoneNumber(String cellPhoneNumber) {
		this.cellPhoneNumber = cellPhoneNumber;
	}

	@Override
	public String toString() {
		return "Customer [custometId=" + custometId + ", customerName=" + customerName + ", custometMaildId="
				+ custometMaildId + ", cellPhoneNumber=" + cellPhoneNumber + "]";
	}
	
	
}
