package vectorstack;

public class Test1 {

	public static void main(String[] args) {
		System.out.println("0");
		try
		{
			System.out.println("1");
			int a =100 , b=0, c;
			System.out.println("2");
			c=a/b;
			System.out.println("3");
			System.out.println(c);
			System.out.println("4");
			System.exit(0);
			
		}
		catch(ArithmeticException e)
		{
		//	System.out.println(e);
			System.out.println("5");
			e.printStackTrace(); 
			System.out.println("6");
			//System.out.println(e);
		}

		
		finally
		{
			//System.out.println("if we doens,t use catdh block program is terminated abnormally after finLLY BLOCK");
			System.out.println("i am in finally block");
		}
		System.out.println("hello");
	}

}
