package JAVAProgram;

import java.util.Scanner;

public class ReverseNo {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String yn;
		do {
			
		
		Scanner s=new Scanner(System.in);
		System.out.println("enter the number");
		int n=s.nextInt();
		int rem,rev=0,r=0;
		while(n !=0)
		{
			/*
			 * rem=n%10; rev=rev*10+rem; 
			 * n=n/10;
			 */
			r=r*10;
			r=r+n%10;
			n=n/10;
			}
		System.out.println("reverse number is" +r);
		
			
		System.out.println("press y for yes  and  n for no ");
		yn=s.next(); 
	}while(yn.equals("y") || yn.equals("Y"));
	}

}
