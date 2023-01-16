package example.generic;

public class Account<T> {

	T t ;
	
	Account(T t){
		this.t =t;
	}
	
	void showDataType() {
		System.out.println(t.getClass().getName());
	}
}
