package langauge.info.pack;

class BB{
	private Integer a;
	private Integer b;
	
	public BB() {}
	
	public BB(Integer a, Integer b) {
		this.a = a;
		this.b = b;
	}
	public Integer getA() {
		return a;
	}
	public void setA(Integer a) {
		this.a = a;
	}
	public Integer getB() {
		return b;
	}
	public void setB(Integer b) {
		this.b = b;
	}
	
	@Override
	public String toString() {
		return"BB [a="+ a +", b= "+ b +" ]";
	}
	@Override
	public int hashCode() {
		return this.a + this.b;
	}
}
// Hash table data structure OR hashing algo

public class HashCodeDemo {

	public static void main(String[] args) {
		BB b = new BB(5,2);
		System.out.println(b);  // b. toString()
		System.out.println(b.hashCode());  // 7
	}
}
