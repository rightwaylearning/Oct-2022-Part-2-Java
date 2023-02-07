package map.examples.hashmap;

import java.util.WeakHashMap;

public class WeakHashMapDemo {

	public static void main(String[] args) throws Exception{
		// here HashMap is dominates GC
		//HashMap<Temp, Integer> map = new HashMap<>();
		
		WeakHashMap<Temp, Integer> map = new WeakHashMap<>();
		
		Temp t1 =new Temp(1,"vishal");
		map.put(t1,1);
		
		Temp t2 = new Temp(2,"pushpa");
		map.put(t2, 2);
		
		t1=null;
		System.gc();
		Thread.sleep(10000);
		
		System.out.println(map);

	}

}

class Temp {
	Integer id;
	String name;

	public Temp() {
	}

	public Temp(Integer id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Temp [id=" + id + ", name=" + name + "]";
	}
	
	

}
