package collection_api.list;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class ArrayListDemo {

	public static void main(String[] args) {
		// here we are going to see ArrayList class example/demo
		
	//	Collection c= new ArrayList();
	//	List  list = new ArrayList(); //**
	
	  ArrayList al = new ArrayList();
	  al.add(100);  // 100 primitive >>> autoboxing >> Integer object
	  al.add("Hello");// sString class object
	  al.add(new Integer(100));
	  Student s = new Student();
	  al.add(s); 
	  al.add(null);
	  al.add(new Student());
	 boolean b =  al.add(null);
	 System.out.println(b);
	  System.out.println(al); // toString
	  
	     // ArrayList
		// insertion order is preserve
	    // duplicate allow
	    // diff type of object is allow
	    // null object insertion also allow
	   
	  
	}
}


class Student{
	@Override
	public String toString() {
		return "Hi";
	}
}