package JAVAProgram;

import java.util.Scanner;

public class Armstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String yn;
		do {
		
		int c,r;
		int temp;
		int sum=0;
		Scanner s=new Scanner(System.in);
		System.out.println("enter the number");
		int n=s.nextInt();
		temp=n;
		while( n>0)
		{
			r=n%10;
			c=r*r*r;
			sum=sum+c;
			//sum=sum+r*r*r;
			n=n/10;
		}
		n=temp;
		if(n==sum)
		{
			System.out.println("it is armstrong number : "+n);
		}
		else
		{
			System.out.println("Not A armstrong number : "+n);
		}
		
		System.out.println("press y for yes  and  n for no ");
		yn=s.next(); 
	}while(yn.equals("y") || yn.equals("Y"));

		
	}

}
