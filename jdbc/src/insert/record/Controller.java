package insert.record;

import java.util.Scanner;

public class Controller {

	public static void main(String[] args) throws Exception {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter customer id");
		int id = sc.nextInt();
		
		System.out.println("please enter customer name");
		String name = sc.next();
		
		System.out.println("please enter mailid");
		String mail = sc.next();
		
		System.out.println("please enter cell no");
		String cell = sc.next();
		
		
		InsertRecord insert = new InsertRecord();
		
		System.out.println(insert.insertRecord(id, name, mail, cell));
	}
}
