package JAVAProgram;

public class SwapTwoNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10,b=20;

		System.out.println("before swapping a" +a);
		System.out.println("before swapping b" +b);
		System.out.println("\n");
		
		
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("after swapping a" +a);
		System.out.println("after swapping b" +b);
		

	}

}
