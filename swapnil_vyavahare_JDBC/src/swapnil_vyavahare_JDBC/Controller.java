package swapnil_vyavahare_JDBC;

import java.sql.SQLException;
import java.util.Scanner;

public class Controller {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Student Id");
		
		int id = sc.nextInt();
		System.out.println("Enter firstname");
		String fname = sc.next();
		System.out.println("Enter lastname");
		String lname = sc.next();
		System.out.println("Enter Rollnum");
		int roll = sc.nextInt();
		
		
		
		Insert_Record insert = new Insert_Record();
		int inser = insert.insertRecord(id,fname,lname,roll);
		System.out.println(inser);

	}

}
