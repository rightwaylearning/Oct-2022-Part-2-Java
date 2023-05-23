package many_to_one;

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
@Table(name="doctor_new1")
public class DoctorNew {

	@Id
	@Column(name = "dr_no")
	private Integer drNo;
	
	@Column(name = "dr_name")
	private String name;
	
	@Column(name = "dr_qualification")
	private String qulification;
	
	public DoctorNew() {}

	public DoctorNew(Integer drNo, String name, String qulification) {
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


	@Override
	public String toString() {
		return "Doctor [drNo=" + drNo + ", name=" + name + ", qulification=" + qulification + "]";
	}
	
	
}
