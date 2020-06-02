package JAVAProgram;

public class LinearSearchString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
String[] arr= {"deepak","amit","rahul","vironika","deepash"};
		
		
		String item="amit";
		int temp=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i].equals(item))
			{
				System.out.println("item is present at "+i+" index position");
				temp=temp+1;
			}
		}
		if(temp==0)
		{
			System.out.println("item not found");
		}

	}

}
