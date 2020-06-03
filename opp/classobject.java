package JAVAProgram;

public class oppEx {
	public void eat()
	{
		System.out.println("i am eating");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("1");
		
		oppEx  buzo=new oppEx ();
		buzo.eat();
		
		for(int i=0;i<10;i++)
		{
			buzo.eat();
		}
	}

}
