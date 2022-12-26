package aarayprogram;

public class Student {
	
	private String StudentName;
	private int rollNumber;
	private String adr;
	
	public String getStudentName() {
		return StudentName;
	}

	public void setStudentName(String studentName) {
		StudentName = studentName;
	}

	public int getRollNumber() {
		return rollNumber;
	}

	public void setRollNumber(int rollNumber) {
		this.rollNumber = rollNumber;
	}

	public String getAdr() {
		return adr;
	}

	public void setAdr(String adr) {
		this.adr = adr;
	}

	public Student(String studentName, int rollNumber, String adr) {
		
		StudentName = studentName;
		this.rollNumber = rollNumber;
		this.adr = adr;
	}
	
	
}
