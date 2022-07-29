package reading;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;


public class ReadFile 
{
	
	public void read() throws IOException
	{
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the name of the file you want to Read (abc.txt)");
		String fileName = sc.nextLine();
		//getting location of file user want to read
		FileInputStream stream= new FileInputStream("D:\\simplilearn\\phase1project\\"+fileName);
		int data;
		//reading the whole text file and output the text.
		while((data=stream.read())!=-1)
		{
			
			System.out.print((char)data);
		}
		System.out.println("\n--- End of file ---\n");
	}

}
