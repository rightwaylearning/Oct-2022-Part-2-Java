package one_to_many_bi_directional;

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

@Entity
@Table
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
			   cascade = CascadeType.ALL,
			   orphanRemoval = false
			 )
	@JoinColumn(name = "fk_drNo", referencedColumnName = "dr_no")
	private Set<Patient> set;
	
	public Doctor() {}
	

	public Doctor(Integer drNo, String name, String qulification) {
		super();
		this.drNo = drNo;
		this.name = name;
		this.qulification = qulification;
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


	public Set<Patient> getSet() {
		return set;
	}


	public void setSet(Set<Patient> set) {
		this.set = set;
	}


	@Override
	public String toString() {
		return "Doctor [drNo=" + drNo + ", name=" + name + ", qulification=" + qulification + ", set=" + set + "]";
	}
	
	
}
