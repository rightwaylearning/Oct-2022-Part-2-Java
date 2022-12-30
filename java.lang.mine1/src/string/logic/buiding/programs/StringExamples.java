package string.logic.buiding.programs;

class Examples{
	
	public Integer countStringLength(String str) {
		
		char[] arr =  str.toCharArray();
		int cnt = 0;
		
		for(int i =0 ; i <arr.length ;i ++) {
			cnt++;
		}
		
		return cnt;
		
	}
	
	
}


public class StringExamples {

	public static void main(String[] args) {
		
		Examples e = new Examples();
		
		System.out.println(e.countStringLength("rightwaylearning"));
	}
}
