package JAVAProgram;

public class SecMaxMinArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] a= {6,8,2,4,3,1,5,7};
		int temp;
		int temp1;
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]<a[j])
				{
						temp=a[i];
						a[i]=a[j];
						a[j]=temp;
				}
			}
		}
		System.out.println("second max is"+a[1] );
		
		
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]>a[j])
				{
						temp=a[i];
						a[i]=a[j];
						a[j]=temp;
				}
			}
		}
		System.out.println("second min is"+a[1] );



	}

}
