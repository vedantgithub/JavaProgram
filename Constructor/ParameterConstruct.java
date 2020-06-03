package JAVAProgram;

public class Const {
	String name;
	int emp_id;

	
	Const(String na,int emp_id)
	{
		this.name=na;
		this.emp_id=emp_id;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Const e1=new Const("deepak",1);
		Const e2=new Const("deep",2);
		System.out.println("emp1 :"+e1.name+" "+e1.emp_id );
		System.out.println("emp2 :"+e2.name+" "+e2.emp_id );
		}

}
