package JAVAProgram;

import java.util.Scanner;

public class SwitchCalculator1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String yn;
		do
		{
			
			Scanner s=new Scanner(System.in);
			System.out.println("enter the first number");
			int n1=s.nextInt();
			System.out.println("enter the second  number");
			int n2=s.nextInt();
			System.out.println("select symbol(*,-,/,+)");
			int res;
			String symbol=s.next();
			
			
			switch(symbol)
			{
			
			case "+":res= n1+n2;
			System.out.println("addition is : "+res);
			break;
			
			case "-":res=n1-n2;
			System.out.println("subtraction is : "+res);
			break;
			
			
			case "*":res=n1*n2;
			System.out.println("multiplication is : "+res);
			break;
			
			
			case "/":res=n1/n2;
			System.out.println("division is :"+res);
			break;
			
			default :
				System.out.println("invalid option");
			break;
				
			}
			
			System.out.println("press y for yes  and  n for no ");
			yn=s.next(); 
		}while(yn.equals("y") || yn.equals("Y"));

	}

}
