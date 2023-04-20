package customer_info_modelclass;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "customer")
public class Customer {
	
	@Id
	@Column(name="customerid")
	@GenericGenerator(name = "my_own_Id", strategy = "customer_info_modelclass.My_Own_Id_Logic")
	@GeneratedValue(generator = "my_own_Id")
	private String customerId;
	
	@Column(name="custfirstname")
	private String custfirstname;
	
	@Column(name="custlastname")
	private String custlastname;
	
	@Column(name="mail")
	private String mail;
	
	@Column(name="cellno")
	private String cellno;
	
	public Customer() {}

	public Customer( String custfirstname, String custlastname, String mail, String cellno) {
		super();
		
		this.custfirstname = custfirstname;
		this.custlastname = custlastname;
		this.mail = mail;
		this.cellno = cellno;
	}

	public String getCustomerId() {
		return customerId;
	}

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	public String getCustfirstname() {
		return custfirstname;
	}

	public void setCustfirstname(String custfirstname) {
		this.custfirstname = custfirstname;
	}

	public String getCustlastname() {
		return custlastname;
	}

	public void setCustlastname(String custlastname) {
		this.custlastname = custlastname;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public String getCellno() {
		return cellno;
	}

	public void setCellno(String cellno) {
		this.cellno = cellno;
	}

	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", custfirstname=" + custfirstname + ", custlastname="
				+ custlastname + ", mail=" + mail + ", cellno=" + cellno + "]";
	}
	
	
	
	
	
	

}
