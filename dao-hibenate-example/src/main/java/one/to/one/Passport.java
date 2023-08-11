package one.to.one;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "passport")
public class Passport {

	@Id
	@Column(name = "passport_no")
	private Integer passportNumber;
	
	@Column(name = "from_date")
	private String fromDate;
	
	@Column(name = "to_date")
	private String toDate;
	
	@OneToOne(
			targetEntity = Person.class,
			fetch = FetchType.EAGER,
			cascade = CascadeType.ALL
			)
	@JoinColumn(
			name="fk_person_id",
			referencedColumnName = "person_id",
			unique = true,
			nullable = false
			)
	private Person person;

	public Integer getPassportNumber() {
		return passportNumber;
	}

	public void setPassportNumber(Integer passportNumber) {
		this.passportNumber = passportNumber;
	}

	public String getFromDate() {
		return fromDate;
	}

	public void setFromDate(String fromDate) {
		this.fromDate = fromDate;
	}

	public String getToDate() {
		return toDate;
	}

	public void setToDate(String toDate) {
		this.toDate = toDate;
	}

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}

	@Override
	public String toString() {
		return "Passport [passportNumber=" + passportNumber + ", fromDate=" + fromDate + ", toDate=" + toDate
				+ ", person=" + person + "]";
	}
	
	
}
