package JAVAProgram;

public class oppEx1 {
	
	
	public void eat()   //method
	{
		System.out.println("the dog eat a food a lot");	
	}
	
	public void barking()
	{
		System.out.println("the dog makes a lot of sound");
	}
	
	public void sleep()
	{
		System.out.println("DOGS SLEEP A LOT");
	}
	
	public static void main(String[] args) {
		System.out.println("we have a dog");
		
		oppEx1 eat=new oppEx1();
		eat.eat();
		eat.barking();
		eat.sleep();
		
		Bird f=new Bird();
		f.fly();
		
    /*oppEx1 barking=new oppEx1();
		barking.barking();
		
		oppEx1 sleep=new oppEx1();
		sleep.sleep();
		*/
	}
}
class Bird
{
	 void fly()
	{
		System.out.println("bird is flying");
	}
}
