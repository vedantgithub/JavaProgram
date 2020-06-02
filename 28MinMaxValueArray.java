package JAVAProgram;

public class MaxMinValueArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
  
		
		int[] a= {4,3,5,2,1,6};
		int max=a[0];   //assume a[0] have the max element value
		int min=a[0];   //assume a[0] have the max element value
		for(int i=1;i<a.length;i++)
		{
			if(a[i]>max)
			{
				max=a[i]; 
			}
			
		}
		System.out.println("max is"+max );
		
		for(int i=1;i<a.length;i++)
		{
			if(a[i]<min)
			{
				min=a[i]; 
			}
			
		}
		System.out.println("min is"+min);

	}

}
