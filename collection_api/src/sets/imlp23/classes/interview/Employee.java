package sets.imlp23.classes.interview;

public class Employee {
	private Integer id;
	private String name;

	public Employee() {

	}

	public Employee(Integer id, String name) {
		this.id = id;
		this.name = name;
	}
	
	
	@Override
	public boolean equals(Object obj) {
		Employee e = (Employee)obj;
		if(this.getId().equals(e.getId()) && this.getName().equals(e.getName())) {
			return true;
		}
		return false;
	}
	
	@Override
	public int hashCode() {
		return this.getId().hashCode() + this.getName().hashCode();
	}
	

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + "]";
	}

}
