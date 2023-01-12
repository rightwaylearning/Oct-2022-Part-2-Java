package rutujanimbhore;

public class Stringclass {
	public static void main(String[] args) {
		String str=new String("data");
		String str1=new String("data");
		System.out.println(str==str1);//false
		System.out.println(str.hashCode()==str1.hashCode());//true
		
		String str2="data";
		System.out.println(str==str2);//false
		
		String str3="data";
		System.out.println(str2==str3);//true
		System.out.println(">>>>>>>>>>>>>>>>>>>>");
		System.out.println(">>>>>>>>>>>");
		
		final String s ="data"; //new String("data");
		String s1=s.concat("clg");//false>>object created on heap
				//s+"clg";//dataclg
				 
				
		String s2="dataclg";
//		System.out.println(s1.equals(s2));//true
//		System.out.println(s1.hashCode()==s2.hashCode());//true
		System.out.println("============================");
		System.out.println(s1==s2);
	}
}
