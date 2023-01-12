package double_colon.opt;

@FunctionalInterface
interface MyLogic {
	public void show(Integer e);
}
// method or constructor reference opt  >>> ::
public class Test {

	public static void main(String[] args) {
		
		MyLogic m = new MyOwnLogic() :: m1;
		m.show(10);
		
		 Runnable r = MyOwnLogic :: myOwnRunMethod;
		 Thread t = new Thread(r);
		 t.start();
		
	}
}
