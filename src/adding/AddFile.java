package adding;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;


public class AddFile {
		public void Add()  throws IOException
		{
			//Created a directory to store all the txt files at one place
			String path= "D:\\simplilearn\\phase1project\\";
			File theDir = new File(path);
			
			//if directory dosent exist it will create directory else move forward
			if (!theDir.exists())
			{
			    theDir.mkdirs();
			}
			@SuppressWarnings("resource")
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter number of files you want to add");
			int num = sc.nextInt();
			
			//calling the creating method x number of time.
			for(int i=0; i<num; i++)
			{
				creating();
			}
		}
		
		static void creating() throws IOException
		{
			//the default path to save txt files
			String path= "D:\\simplilearn\\phase1project\\";
			@SuppressWarnings("resource")
			Scanner sc = new Scanner(System.in);
			System.out.println("enter file name(abc.txt).");
			String filename = sc.nextLine();
			//adding path and file name
			String FinalPath = path+filename;
			//opening file with specified location
			FileOutputStream out= new FileOutputStream(FinalPath);
			//calling userData method to get data of the user.
			System.out.println("Write something.");
			
			String str = sc.nextLine();
			String input = str;
			byte array[]=  input.getBytes();
			//writing data to txt file
			out.write(array);
			System.out.println("Data Written Successfully");
			//closing the file
			out.close();
		}

}
