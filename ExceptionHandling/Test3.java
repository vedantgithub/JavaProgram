package vectorstack;

import java.util.Scanner;

class YoungerAgeException extends RuntimeException
{
	YoungerAgeException(String msg)
	{
		super (msg);
	}
}


public class Test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("enter you age");
		
		int age = s.nextInt();
		
	try {
		if(age<18)
		{
			throw new YoungerAgeException("you are not eligible for voting");
		}
		else
		{
			System.out.println("you can vote");
		}
	}
	catch(Exception e) {
		e.printStackTrace();
	}
System.out.println("hello");
	}

}
