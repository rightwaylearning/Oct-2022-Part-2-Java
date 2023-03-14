package customer.models;

public class Customer {
	
	private Integer custometId;
	private String customerName;
	private String contactNumber;

	public Customer() {
	}

	public Customer(Integer custometId, String customerName, String contactNumber) {
		super();
		this.custometId = custometId;
		this.customerName = customerName;
		this.contactNumber = contactNumber;
	}
	
	@Override
	public boolean equals(Object obj) {
		Customer obj1 = (Customer)obj;
		if(this.getCustomerName().equals(obj1.getCustomerName()) && this.getContactNumber().equals(obj1.getContactNumber())) {
			return true;
		}
		return false;
	}
	
	@Override
	public int hashCode() {
		return this.getCustomerName().hashCode()  + this.getContactNumber().hashCode();
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

	public String getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}

	@Override
	public String toString() {
		return "Customer [custometId=" + custometId + ", customerName=" + customerName + ", contactNumber="
				+ contactNumber + "]";
	}

}
