package assignment;

import java.util.LinkedList;

public class CrudOpt {

	LinkedList<Integer> list;

	public CrudOpt() {
		list = new LinkedList<>();
		list.add(100);
		list.add(200);
		list.add(300);
		list.add(100);
		list.add(700);
		list.add(800);
	}

	// here we are chceking the input object is exit or not inside linked list
	Boolean isObjectExit(Integer obj) {
		boolean isExist = this.list.contains(obj);
		return isExist;
	}

	// here we are storing new object inside Linked list
	Boolean saveObject(Integer obj) {
		boolean b = this.list.add(obj);
		return b;
	}

	Integer countOfGivenObject(Integer obj) {
		Integer cnt = 0;
		for (Integer item : list) {
			if (item.equals(obj)) {
				cnt++;
			}
		}

		return cnt;
	}

	Boolean removeObject(Integer obj) {
		return this.list.remove(obj);
	}

	void replaceObject(Integer oldObject, Integer newObject) {
		System.out.println("old list " + this.list);
		
		int index = list.indexOf(oldObject);
		this.list.remove(index);
		this.list.add(index, newObject);
		
		System.out.println("new list " + this.list);
	}

	public static void main(String[] args) {
		CrudOpt c = new CrudOpt();
		c.replaceObject(700, 70);
	}

}
