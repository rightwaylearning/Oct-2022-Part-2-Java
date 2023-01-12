package lanbda.expression.with.functiona_interface;

interface A{
	int doSum(int a, int b);
}

//--------------------------------------------------
class RequiredSumFun{
	void doCal(A a) {  
		int sum = a.doSum(10, 20);
		System.out.println(sum);
	}
}

public class LambdaAsArgToMethod {

	public static void main(String[] args) {
		RequiredSumFun r= new RequiredSumFun();
		r.doCal((x,y)->x+y);
	}
}
