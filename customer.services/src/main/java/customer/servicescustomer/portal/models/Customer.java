package customer.servicescustomer.portal.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;



@NamedQueries({
	
	@NamedQuery(
       name = "customer_name",
       query = "select customerFirstName, customerLastName from Customer c where  c.customerId =:id" 
    )
})
@Entity
@Table(name = "customer")
public class Customer {

	@Id
	@Column(name = "custometId")
	@GenericGenerator(name = "myown_pk", strategy = "customer.servicescustomer.portal.models.MyOwnPkInIdea")
	@GeneratedValue(generator = "myown_pk")
	private String customerId;
	
	@Column(name = "customerFirstName")
	private String customerFirstName;
	
	@Column(name = "customerLastName")
	private String customerLastName;
	
	@Column(name = "mailId")
	private String mailId;
	
	@Column(name = "cellNumber")
	private String cellNumber;
	
	public Customer(){}

	public Customer(String customerFirstName, String customerLastName, String mailId, String cellNumber) {
		super();
		this.customerFirstName = customerFirstName;
		this.customerLastName = customerLastName;
		this.mailId = mailId;
		this.cellNumber = cellNumber;
	}

	
	public String getCustomerId() {
		return customerId;
	}

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	public String getCustomerFirstName() {
		return customerFirstName;
	}

	public void setCustomerFirstName(String customerFirstName) {
		this.customerFirstName = customerFirstName;
	}

	public String getCustomerLastName() {
		return customerLastName;
	}

	public void setCustomerLastName(String customerLastName) {
		this.customerLastName = customerLastName;
	}

	public String getMailId() {
		return mailId;
	}

	public void setMailId(String mailId) {
		this.mailId = mailId;
	}

	public String getCellNumber() {
		return cellNumber;
	}

	public void setCellNumber(String cellNumber) {
		this.cellNumber = cellNumber;
	}

	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", customerFirstName=" + customerFirstName + ", customerLastName="
				+ customerLastName + ", mailId=" + mailId + ", cellNumber=" + cellNumber + "]";
	}
	
}
