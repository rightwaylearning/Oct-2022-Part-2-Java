package string.info.pack;

public class StringImmutable {

	public static void main(String[] args) {
		
		String str = new String("vijaybhaskar");
		System.out.println(str.hashCode());
		str = str.concat(" reddy");
		System.out.println(str.hashCode());
		
		System.out.println("String = "+str);
		
		System.out.println("-----------------------------------");
		
		StringBuffer str1 = new StringBuffer("vijaybhaskar");
		str1.append(" reddy");
		System.out.println("stringBuffer = "+str1);
	}
}
