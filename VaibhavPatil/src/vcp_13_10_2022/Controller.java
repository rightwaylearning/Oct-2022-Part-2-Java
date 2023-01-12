package vcp_13_10_2022;

public class Controller {
public static void main(String[] args) {
	Test t=new Test();
	System.out.println(t.a);
	System.out.println(t.b);
	
	Test t1=new Test(43,23);
	System.out.println(t1.a);
	System.out.println(t1.b);

	//If once you declaired any one constructor in ur class , Then Compiler is not responsible
	//for creating default class
	

}
}
