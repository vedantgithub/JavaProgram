
package JAVAProgram;
/*
public class oppEx3 {
	  String color;
	  int age;
	  
	  void initObj(String c,int a)
	  {
		  color=c;
		  age=a;
	  }
	  
	  void display()
	  {
			System.out.println(color+" "+age);
	  }
	  

	public static void main(String[] args) {
		oppEx3 d=new oppEx3();
		d.initObj("blue",10);
		d.display();
		
	}

}*/


public class oppEx3 {
	 String name;
	 String city;
	 int age;
	 int phone ;
	 
	 void initobj(String n,String c,int a,int p)
	 {
		 name=n;
		 city=c;
		 age=a;
		 phone=p;
	 }
	 
	 void display()
	  
	 {
		 System.out.println("name   age     city     phone");
		 System.out.println(name+"  "+age+"  "+city+"  "+phone);
	 }

	public static void main(String[] args) {
		
		oppEx3 call=new oppEx3();
		call.initobj("amit","meerut",20,123456);
		call.display();
				
		
		
	}

}







































