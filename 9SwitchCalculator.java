package JAVAProgram;

public class SwitchCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n1=10,n2=20,res;
		String symbol="+";
		switch(symbol)
		{
		case "+":res= n1+n2;
		System.out.println(res);
		break;
		
		case "-":res=n1-n2;
		System.out.println(res);
		break;
		
		
		case "*":res=n1*n2;
		System.out.println(res);
		break;
		
		
		case "/":res=n1/n2;
		System.out.println(res);
		break;
		
		default :
			System.out.println("invalid option");
			
		}
	}

}
