package serialization.example;

import java.io.Serializable;

public class Address implements Serializable{
	
	private String line1;
	private String line2;
	private String city;
	private int pin;
	
	public Address() {}

	public Address(String line1, String line2, String city, int pin) {
		super();
		this.line1 = line1;
		this.line2 = line2;
		this.city = city;
		this.pin = pin;
	}

	public String getLine1() {
		return line1;
	}

	public void setLine1(String line1) {
		this.line1 = line1;
	}

	public String getLine2() {
		return line2;
	}

	public void setLine2(String line2) {
		this.line2 = line2;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public int getPin() {
		return pin;
	}

	public void setPin(int pin) {
		this.pin = pin;
	}

	@Override
	public String toString() {
		return "Address [line1=" + line1 + ", line2=" + line2 + ", city=" + city + ", pin=" + pin + "]";
	}
	
	

}
