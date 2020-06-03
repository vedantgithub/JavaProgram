

package JAVAProgram;

public class oppEx2 {
	String color;
	int age;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	
		oppEx2 buso=new oppEx2();
		buso.color="white";
		buso.age=9;
		System.out.println(buso.color+" "+buso.age);
		
		
		Birds f=new Birds();
		f.fly();
				

	}

}

class Birds
{
	String color;
	int age;
void fly()
{
	System.out.println("the bird fly");
	Birds f=new Birds();
	f.color="white";
	f.age=9;
	
	System.out.println(f.color+" "+f.age);
}
}
