package JAVAProgram;

public class SecMaxMinArray1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {6,8,2,5,4,7,1,9};
		int largest=Integer.MIN_VALUE;    //-2147483648
		int sec_largest=Integer.MIN_VALUE;
		
		int min=Integer.MIN_VALUE;
		int sec_min=Integer.MIN_VALUE;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>largest)
			{
				sec_largest=largest;
				largest=a[i];
			}
			else if(a[i]>sec_largest && a[i]!=largest)
			{
				sec_largest=a[i];
			}
		}
		if(sec_largest==Integer.MIN_VALUE)
		{
			System.out.println("no element found" );
		}
		else
		{
			System.out.println("second max is"+sec_largest );
		}
			
	}

}
