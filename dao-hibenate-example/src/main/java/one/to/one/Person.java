package one.to.one;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "person")
public class Person {
	
	@Id
	@Column(name="person_id")
	private Integer personId;
	
	@Column(name = "person_name")
	private String personName;
	
	@Column(name = "person_address")
	private String address;
	
	public Person() {}

	public Person(Integer personId, String personName, String address) {
		super();
		this.personId = personId;
		this.personName = personName;
		this.address = address;
	}
	
	public Integer getPersonId() {
		return personId;
	}
	
	public String getPersonName() {
		return personName;
	}
	
	public String getAddress() {
		return address;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	
	public void setPersonId(Integer personId) {
		this.personId = personId;
	}
	
	public void setPersonName(String personName) {
		this.personName = personName;
	}

	@Override
	public String toString() {
		return "Person [personId=" + personId + ", personName=" + personName + ", address=" + address + "]";
	}
	
	
}
