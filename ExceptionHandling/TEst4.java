package vectorstack;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

class ReadandWrite


{
	void readFile() throws FileNotFoundException
	{
		FileInputStream fis = new FileInputStream("d:/abc.txt");
	}
	
	void safeFile() throws FileNotFoundException
	{
		FileOutputStream fos = new 	FileOutputStream("d:/xyz.txt");
	}
}

public class Test4 {

	public static void main(String[] args) {
		ReadandWrite rw =new ReadandWrite();
		try
		{
			rw.readFile();
		}
		catch(FileNotFoundException e)
		{
			e.printStackTrace();
		}
		System.out.println("hello");
		
		try {
			rw.safeFile();
		}
		catch(FileNotFoundException e)
		{
			e.printStackTrace();
		}
		System.out.println("hello world");

	}

}
