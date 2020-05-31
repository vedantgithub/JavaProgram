package JAVAProgram;

public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] a= {36,19,29,12,5};
		int temp;
		
		for(int i=0;i<a.length;i++) //it is for no. of round
		{
			int flag=0;
			for(int j=0;j<a.length-1-i;j++)  //for two adjacent elements
			{
				if(a[j]>a[j+1])   //comparing two adjacent elements
				{
					temp=a[j];
					a[j]=a[j+1];           //swapping the elements
					a[j+1]=temp;
					flag=1;
				}
			}
			if(flag==0)     //if array sorted without completing all the round
			{
				break;
			}
			
		}
		for(int i=0;i<a.length;i++) //it is for no. of round
		{
			System.out.print(a[i]+"  ");
		}

	}

}
