package many_to_one;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "patient_new1")
public class PatientNew {

	@Id
	@Column(name = "p_id")
	private Integer pid;
	
	@Column(name = "p_name")
	private String name;
	
	@Column(name = "p_age")
	private Integer age;
	
	@ManyToOne(
			targetEntity = DoctorNew.class,
			cascade = CascadeType.PERSIST,
			fetch = FetchType.EAGER
			)
	@JoinColumn(name = "fk_drno")
	private DoctorNew doctor;
	
	public PatientNew() {}

	public PatientNew(Integer pid, String name, Integer age,DoctorNew doctor) {
		super();
		this.pid = pid;
		this.name = name;
		this.age = age;
		this.doctor = doctor;
	}

	public Integer getPid() {
		return pid;
	}

	public void setPid(Integer pid) {
		this.pid = pid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	
	public DoctorNew getDoctor() {
		return doctor;
	}

	public void setDoctor(DoctorNew doctor) {
		this.doctor = doctor;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "PatientNew [pid=" + pid + ", name=" + name + ", age=" + age + ", doctor=" + doctor + "]";
	}

	
}
