package lanbda.expression.with.functiona_interface;

interface Graph {
	void findCircleArea(int radius);
	
	default Double PIValue() {
		return 3.14;
	}
}

class GraphImpl1 implements Graph {

	@Override
	public void findCircleArea(int r) {
		System.out.println(PIValue() * r * r);
	}

}

class GraphImpl2 implements Graph {

	@Override
	public void findCircleArea(int r) {
		System.out.println(PIValue() * r * r);
	}

}

public class DefaultMethodDemo {
	public static void main(String[] args) {
         new GraphImpl1().findCircleArea(7);
         new GraphImpl2().findCircleArea(7);
	}

}
