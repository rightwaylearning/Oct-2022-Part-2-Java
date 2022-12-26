package nirmal_equal_method;

public class infocontroller {
	
	public static void main(String[] args) {
		
		Info i = new Info();
		String s = i.getName();
		int a = i.getNumber();
		
		Info i1 = new Info();
		String d = i1.getName();
		int b = i1.getNumber();
		
		
		System.out.println(i.equals(i1));
		System.out.println(i.hashCode());
		System.out.println(i1.hashCode());
	}

}
