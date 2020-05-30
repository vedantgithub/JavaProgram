package JAVAProgram;

public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int year=2016;
		if(year%4==0)
		{
			if(year%100==0)
			{
				if(year%400==0)
				{
					System.out.println("Is a LeapYear");
				}
				else
				{
					System.out.println("Not a LeapYear");
				}
			}
			else
			{
				System.out.println("Is a LeapYear");
			}
			
			
		}
		else
		{
			System.out.println("Not a LeapYear");
		}
		
		

	}

}
