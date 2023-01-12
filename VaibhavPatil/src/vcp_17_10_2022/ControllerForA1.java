package vcp_17_10_2022;

public class ControllerForA1 {
public static void main(String[] args) {
	//A1 a=new A1();
//	A1 a=new A1(10,20);
//	System.out.println(a.a);
//	System.out.println(a.b);	
	//jevha apan instance variable private karto 
	//tevha tyanchi property direcetly access karu shakat nahi
	//mg tysathi tyach class madhe property access karnasathi set ani get method ghyaychya
	
	A1 a=new A1(10,20);
	int data1=a.getA();
	System.out.println(data1);
	
	int data2=a.getB();
	System.out.println(data2);
	
	A1 a1=new A1();
	a1.setA(100);
	a1.setB(200);
	
	int data3=a1.getA();
	int data4=a1.getB();
	
	System.out.println(data3);
	System.out.println(data4);
	
}
}
