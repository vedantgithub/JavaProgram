package JAVAProgram;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int t1=0;
		int t2=1;
		int next;
		
		Scanner s=new Scanner(System.in);
		System.out.println("enter the number");
		int n=s.nextInt();
		
		for(int i=1;i<=n;i++)
		{
			
			next=t1+t2;
			System.out.println(next);
			t1=t2;
			t2=next;
			
		}

	}

}
