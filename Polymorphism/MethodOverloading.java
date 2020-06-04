package JAVAProgram;

public class Poly {

	void show()
	{
		System.out.println("1");
	}
	
	void show(int a)
	{
		System.out.println("2");
	}
	
	void show(int a,int b)
	{
		System.out.println("3");
	}
	
	void show(int a,String b)
	{
		System.out.println("4");
	}
	
	void show(String a,int b)
	{
		System.out.println("5");
	}
	public static void main(String[] args) {
		Poly p=new Poly();
		p.show();       //show first method
		
		p.show(10);      // show second method
		
		p.show(10,20);    //show third      No. of argument
		
		p.show(10,"s");  //show 4 method       Sequence of argument
		
		p.show("s",1);   //show 5 method

	}

}
