package vectorstack;

public class Test2 {

	public static void main(String[] args) {
		Test2 t= new Test2();
		try {
			t.divide();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		t.divide();
			
	}
	
	void divide()
	{
		try {
			int a=100, b=0,c;
			c=a/b;
			System.out.println(c);
		}
		catch(ArithmeticException e)
		{
			//System.out.println(e);
			e.printStackTrace();
		}
	System.out.println("hello");
	}


}
