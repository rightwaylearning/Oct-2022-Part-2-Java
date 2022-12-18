package langauge.info.pack;

class QAEngg{
	
	int a;
	int b;
	
	QAEngg(int a,int b){
		this.a = a;
		this.b = b;
	}
	@Override
	public int hashCode() {
		return a + b;
	}
	@Override
	public String toString() {
		return "hii hello";
	}
}
public class SoftwareDevloper {

	public static void main(String[] args) {
		
		QAEngg q = new QAEngg(1,2);
		
		System.out.println(q);  // q.toString() >>> Object
		System.out.println(q.toString());
		
		System.out.println("----------------------");
		
		System.out.println(q.getClass().getName());
		System.out.println(Integer.toHexString(q.hashCode()));
	}
}
