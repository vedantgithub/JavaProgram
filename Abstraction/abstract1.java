package JAVAProgram;

 abstract  class vehical
 {
	
		abstract void start();
 }
	
	
	
class Car extends vehical
{
	void start()
	{
		System.out.println("start with key");
	}
}

class scooter extends vehical
{
	void start()
	{
		System.out.println("start with kick");
	}
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Car c=new Car();
		c.start();
		scooter s=new scooter();
		s.start();
}
		
}
