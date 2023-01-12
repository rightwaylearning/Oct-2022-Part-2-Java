package vcp_19_10_2022;

public class Controller {
	public static void main(String[] args) {

	ArraydefaultValue a=new ArraydefaultValue();
	a.arr1=new int[5];
	System.out.println(a.arr1[0]);
	a.arr2=new String [5];
	System.out.println(a.arr2[1]);
	a.arr3=new double[5];
	System.out.println(a.arr3[4]);
	
	
	ArraydefaultValue.arr4=new char[5];
	System.out.println(ArraydefaultValue.arr4);
	ArraydefaultValue.arr5=new Student[5];
	System.out.println(ArraydefaultValue.arr5[3]);
	
	 a.m1();
	
}
}
