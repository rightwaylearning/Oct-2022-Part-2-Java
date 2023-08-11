package one_to_many_rel;

import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;



@Entity
@Table(name="doctor")
public class Doctor {

	@Id
	@Column(name = "dr_no")
	private Integer drNo;
	
	@Column(name = "dr_name")
	private String name;
	
	@Column(name = "dr_qualification")
	private String qulification;
	
	@OneToMany(targetEntity = Patient.class, 
			   fetch = FetchType.EAGER,
			   cascade = CascadeType.ALL
			 )
	@JoinColumn(name = "fk_drNo", referencedColumnName = "dr_no")
	@Fetch(FetchMode.SUBSELECT)
	private List<Patient> set;
	
	public Doctor() {}
	

	public Doctor(Integer drNo, String name, String qulification,List<Patient> set) {
		super();
		this.drNo = drNo;
		this.name = name;
		this.qulification = qulification;
		this.set = set;
	}



	public Integer getDrNo() {
		return drNo;
	}

	public void setDrNo(Integer drNo) {
		this.drNo = drNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getQulification() {
		return qulification;
	}

	public void setQulification(String qulification) {
		this.qulification = qulification;
	}


	public List<Patient> getSet() {
		return set;
	}


	public void setSet(List<Patient> set) {
		this.set = set;
	}


	@Override
	public String toString() {
		return "Doctor [drNo=" + drNo + ", name=" + name + ", qulification=" + qulification + ", set=" + set + "]";
	}
	
	
}
