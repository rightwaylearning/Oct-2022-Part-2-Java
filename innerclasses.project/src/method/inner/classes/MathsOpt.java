package method.inner.classes;

import java.util.HashMap;
import java.util.Map;

public class MathsOpt {
	
	
	static Map<Integer, Integer> getSqureList(Integer from , Integer to){
		
		class Logic{
			Integer getSqure(Integer num) {
				return num*num;
			}
		}
		
		
		Map<Integer, Integer> map = new HashMap<>();
		Logic logic = new Logic();
		 for(Integer i = from; i<=to;i++) {
			 map.put(i, logic.getSqure(i));
		 }
			
		
		return map;
	}
}
