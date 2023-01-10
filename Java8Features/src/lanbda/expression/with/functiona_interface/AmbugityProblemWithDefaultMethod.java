package lanbda.expression.with.functiona_interface;

interface AA{
	void m1();
	default void foo() {
		
	}
}

interface BB{
	void m2();
    default void foo() {
		
	}
}


public class AmbugityProblemWithDefaultMethod implements AA,BB {

	
	@Override
	public void foo() {
		// 
	}
	
	@Override
	public void m2() {
		
	}

	@Override
	public void m1() {
		
	}

}
