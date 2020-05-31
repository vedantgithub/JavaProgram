package JAVAProgram;

import java.util.Scanner;

public class Palindrom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String yn;
		do {
		int r=0;
		Scanner s=new Scanner(System.in);
		System.out.println("enter the number");
		int n=s.nextInt();
		int t=n;
		while(t!=0)
		{
			r=r*10;
			r=r+t%10;
			t=t/10;
		}
		if(n==r)
		{
			System.out.println("it is palindrom  number : " +n);
		}
		else
		{
			System.out.println("it is not a palindrom number : "+n);
		}
		

		System.out.println("press y for yes  and  n for no ");
		yn=s.next(); 
	}while(yn.equals("y") || yn.equals("Y"));


	}

}
