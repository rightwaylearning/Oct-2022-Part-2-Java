package vcp_16_10_2022;

public class RelationalOptExample {
public static void main(String[] args) {
	//int r=45<89;
	//Type mismatch: cannot convert from boolean to int
	
	//double d=34<89;
	//Type mismatch: cannot convert from boolean to double
	
	boolean r=45<90;
	System.out.println(r);
	
	int a=10;
	int b=9;
	boolean r1=a<=b;
	System.out.println(r1);
	
	int age=17;
	if(age>=18) {
		System.out.println("You are eligible for Voter");
	}
	else {
		System.out.println("Reject");
	}
	
	//boolean b1=true;
	//boolean b2=true;
	//boolean r2=b1<=b2;
	//The operator <= is undefined for the argument type(s) boolean, boolean
	
//	boolean i=true;
//	int m=10;
//	boolean k=i<=m;
//	The operator <= is undefined for the argument type(s) boolean, int
	
//	RelationalOptExample obj1=new RelationalOptExample();
//	RelationalOptExample obj2=new RelationalOptExample();
//	boolean j=obj1>=obj2;
//	The operator >= is undefined for the argument type(s) 
//	vcp_16_10_2022.RelationalOptExample, vcp_16_10_2022.RelationalOptExample
	
}
}






