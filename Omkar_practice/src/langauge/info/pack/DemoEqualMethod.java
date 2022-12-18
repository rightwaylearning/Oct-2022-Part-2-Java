package langauge.info.pack;

class HH{}
class DD{}
public class DemoEqualMethod {
	
public static void main(String[] args) {
	HH h = new HH();
	HH h1 = new HH();
	DD d1 = new DD();
	
	System.out.println(h==h1);  // false
	System.out.println(h.equals(h1));  // this == h1
	Object o1 = d1;
	System.out.println(h1);  // no 
  }
}
