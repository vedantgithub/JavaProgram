package JAVAProgram;

import java.util.Scanner;

public class ScannerInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s=new Scanner(System.in);
		System.out.println("Enter name");
		String name=s.next();
		
		System.out.println("Enter gender");
		char gender=s.next().charAt(0);
		
		System.out.println("Enter age");
		int age=s.nextInt();
		
		System.out.println("Enter phone no.");
		long phone=s.nextLong();
		
		
		System.out.println("Name\t" +name);
		System.out.println("Gender\t" +gender);
		System.out.println("Age\t" +age);
		System.out.println("PhoneNo.\t" +phone);
		
		
		
		
		
		
	}

}
