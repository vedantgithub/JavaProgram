/*method over riding*/    /*no of argument*/
package JAVAProgram;/*

class test
{
	void show()
	{
		System.out.println("1");
	}
}

 class Poly1  extends test{
	 void show()
	 {
		 System.out.println("2");
	 }

	public static void main(String[] args) {
		
		test t=new test();
		t.show();
		
		Poly1 p=new Poly1();
		p.show();
		
		

	}

}*/

/*TYPE OF ARGUMENT*/

 class Test
 {
 	void show(String a,int b)
 	{
 		System.out.println("1");
 	}
 }


 class Poly1  extends Test
 {
public 	 void show(String a,int b)
	 {
		 System.out.println("2");
	 }

	 public static void main(String[] args) 
	 {
		
		Test t=new Test();
		t.show("aaa",1);
		
		Poly1 p=new Poly1();
		p.show("aaba",10);
		
		}

}
