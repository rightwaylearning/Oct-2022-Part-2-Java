package vcp_14_10_2022;

public class EntryPointOfB {
public static void main(String[] args) {
	B b=new B(10,20);
	//System.out.println(b.x); //Valuew of X is not visible 
								//because we use private datatype
	//System.out.println(b.y);

	int v=b.getXValue();
	int v1=b.getYValue();
	
	System.out.println(v);
	System.out.println(v1);

}
}
