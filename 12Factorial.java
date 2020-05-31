package JAVAProgram;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("enter the number");
		int n=s.nextInt();
		int f=1;
		 for(int i=1;i<=n;i++)
		//for(int i=n;i>=1;i--)
		 {
			 f=f*i;
		 }
		 System.out.println("factorial is : "+f);

	}

}
