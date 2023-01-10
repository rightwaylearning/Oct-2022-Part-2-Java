package lanbda.expression.with.functiona_interface;

interface Square{
	Integer square(Integer a);
}

class FindOutSquare implements Square{
	@Override
	public Integer square(Integer a) {
		int s= a * a;
		return s;
	}
}

public class SqureOfGivenNumber {
	public static void main(String[] args) {
		Square s = new FindOutSquare();
		Integer sq = s.square(10);
		System.out.println(sq);
		
		// lambda expression
		
		//Square s1 = (Integer a) -> {return a*a;};
		
		Square s1 = a -> a*a;
		System.out.println(s1.square(25));
	}
}
