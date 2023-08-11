package one_to_many_rel;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "patient")
public class Patient {

	@Id
	@Column(name = "p_id")
	private Integer pid;
	
	@Column(name = "p_name")
	private String name;
	
	@Column(name = "p_age")
	private Integer age;
	
	public Patient() {}

	public Patient(Integer pid, String name, Integer age) {
		super();
		this.pid = pid;
		this.name = name;
		this.age = age;
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

	public void setAge(Integer age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Patient [pid=" + pid + ", name=" + name + ", age=" + age + "]";
	}
		
}
