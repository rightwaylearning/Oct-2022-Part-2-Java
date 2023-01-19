package externalizable.example;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

public class Student implements Externalizable{

	private Integer rollNumber;
	private String name;
	private String adress;
	
	public Student() {
		System.out.println("I am de-serialization process");
	}

	public Student(Integer rollNumber, String name, String adress) {
		super();
		this.rollNumber = rollNumber;
		this.name = name;
		this.adress = adress;
	}

	public Integer getRollNumber() {
		return rollNumber;
	}

	public void setRollNumber(Integer rollNumber) {
		this.rollNumber = rollNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAdress() {
		return adress;
	}

	public void setAdress(String adress) {
		this.adress = adress;
	}

	@Override
	public String toString() {
		return "Student [rollNumber=" + rollNumber + ", name=" + name + ", adress=" + adress + "]";
	}

	@Override
	public void writeExternal(ObjectOutput out) throws IOException {
		System.out.println("I am write External method");
	    out.writeObject(rollNumber);
	    out.writeObject(name);
	}

	@Override
	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
		System.out.println("I am read External method");
		this.rollNumber = (Integer)in.readObject();
		this.name = (String)in.readObject();
    }
	
	
}
