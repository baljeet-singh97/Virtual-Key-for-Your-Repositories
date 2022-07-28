package deleting;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class DeleteFile {
	public void Delete()  throws IOException
	{
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the name of the file (abc.txt)");
		String fileName = sc.nextLine();
		File Delfile = new File("D:\\simplilearn\\phase1project\\"+fileName);
		if(Delfile.delete()) 
		{
			System.out.println("File "+fileName+" deleted successfully. \n");
		}
		else 
		{
			System.out.println("Failed, File not available.");
		}
		
		
	}
}
