package JAVAProgram;

import java.util.Scanner;

public class PerfectNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String yn;
		do {
		
		int sum=0;
		Scanner s=new Scanner(System.in);
		System.out.println("enter the number");
		int n=s.nextInt();
		for(int i=1;i<n;i++)
		{
			if(n%i ==0)
			{
				sum= sum + i ;
			}
		}
		if(n==sum)
		{
			System.out.println("perfect  number");
		}
		else
		{
			System.out.println("Not a perfect number");
		}
		
		System.out.println("press y for yes  and  n for no ");
		yn=s.next(); 
	}while(yn.equals("y") || yn.equals("Y"));


	}

}
