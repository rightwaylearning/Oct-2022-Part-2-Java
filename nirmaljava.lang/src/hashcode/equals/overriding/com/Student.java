package hashcode.equals.overriding.com;

public class Student {

	private String name;
	private Integer rollNumber;
	
	@Override
	public int hashCode() {
		return this.rollNumber.hashCode() + this.name.hashCode();
	}
	
	@Override
	public boolean equals(Object obj) {
		
		Student s = (Student)obj;
	 
		if(this.name.equals(s.name) && this.rollNumber.equals(s.rollNumber)) {
			return true;
		}
	
		return false;
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getRollNumber() {
		return rollNumber;
	}
	public void setRollNumber(Integer rollNumber) {
		this.rollNumber = rollNumber;
	}
	
	
}
