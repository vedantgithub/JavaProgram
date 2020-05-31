package JAVAProgram;

import java.util.Scanner;

public class FactorialRecursion {
	
static int f=1;
	public static void main(String[] args) {
		String yn;
		do {
			
		
		
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("enter the number");
		int n=s.nextInt();
		
		int res;
		FactorialRecursion f=new FactorialRecursion();
		res=f.calFact(n);
		System.out.println("res"+res);
		
		System.out.println("factorial of "+n+" is " +res	);
		
		System.out.println("press y for yes  and  n for no ");
		yn=s.next();
	}while(yn.equals("y") || yn.equals("Y"));
	}
	
	int  calFact(int n) {
		if(n>=1)
		{
			//f=f*n;
			//calFact(n-1);
			return(n*calFact(n-1));
			  	
		}
		return f;
		
	}

}
