package JAVAProgram;

import java.util.Scanner;

public class PrimeNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String yn;
		do {
		
		int temp=0;
		Scanner s=new Scanner(System.in);
		System.out.println("enter the number");
		int n=s.nextInt();
		for(int i=2;i<=n-1;i++)
		{
			if(n%i==0)
			{
				temp=temp+1;
			}
		}
		if(temp>0)
		{
			System.out.println("Not a prime number");
		}
		else
		{
			System.out.println(" number is prime ");
		}
		
		System.out.println("press y for yes  and  n for no ");
		yn=s.next(); 
	}while(yn.equals("y") || yn.equals("Y"));

	}

}
