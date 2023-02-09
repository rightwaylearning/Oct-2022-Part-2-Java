package treemap.demo;

public 
class Customer implements Comparable<Customer>{
	private Integer custId;
	private String customerName;
	
	public Customer() {}

	public Customer(Integer custId, String customerName) {
		super();
		this.custId = custId;
		this.customerName = customerName;
	}

	public Integer getCustId() {
		return custId;
	}

	public void setCustId(Integer custId) {
		this.custId = custId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	@Override
	public String toString() {
		return "Customer [custId=" + custId + ", customerName=" + customerName + "]";
	}

	@Override
	public int compareTo(Customer o) {
		return this.getCustId().compareTo(o.getCustId());
	}
		
}


    

