package method.inner.classes;

import java.util.Map;

public class Controller {
	
	public static void main(String[] args) {
		
		MathsOpt m = new MathsOpt();
		
		Map<Integer, Integer> result = m.getSqureList(1, 10);
		
		System.out.println(result);
	}

}
