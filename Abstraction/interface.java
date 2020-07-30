package vectorstack;

interface i1
{
	public abstract void show();
	
}

interface i2
{
	void shows();
	
}
 class interfaceEx implements i1{
	 
	 public void show()              
	 {
		 System.out.println("multiple");
	 }
	 
	 public void shows()
	 {
		 System.out.println("inheritance example");
	 }
                         
	              
	public static void main(String[] args) {
		//interface i = new interface ();
		interfaceEx i =new interfaceEx();
		i.show();
		i.shows();
		

	}

}
