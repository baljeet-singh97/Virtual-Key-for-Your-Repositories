package main;
import java.io.IOException; 
import java.util.Scanner;
import adding.AddFile;
import deleting.DeleteFile;
import reading.ReadFile;
import displaying.DisplayFile;
public class MainMenu {
	public static void main(String[] args )
	{
		@SuppressWarnings("resource")
		Scanner sc=new Scanner (System.in);
		System.out.println("------------------------------------------------------");
		System.out.println("**** Welcome to the Virtual key ****");
		System.out.println("------------------------------------------------------");
		System.out.println(" ");
		System.out.println("Choose the Below option Number: ");
		System.out.println("1. Display all the Files");
		System.out.println("2. Business-level operations: (File Manipulation)");
		System.out.println("3. Exit");
		System.out.println(" ");
		
		int operation = sc.nextInt();
		
		switch(operation)
		{
		case 1:
		{
			try 
			{
				DisplayFile obj = new DisplayFile();
				obj.Display();
				main(null);

			}
			catch (IOException e) 
			{
				e.printStackTrace();
			}
			break;
		}
		case 2:
		{
			System.out.println(" ");
			System.out.println("------------------------------------------------------");
			System.out.println("Choose the Below option Number: \n");
			System.out.println("1. Add Files");
			System.out.println("2. Delete a File");
			System.out.println("3. Search a File");
			System.out.println("4. Return to Main Menu");
			int choice=sc.nextInt();
			
			switch(choice)
			{
			case 1:
			{
				try 
				{
					AddFile obj = new AddFile();
					obj.Add();
				}
				catch (IOException e) 
				{
					e.printStackTrace();
				}
				main(null);
				System.out.println();
				break;
			}
			case 2:
			{
				try 
				{
					DeleteFile obj = new DeleteFile();
					obj.Delete();
					
				}
				catch (IOException e) 
				{
					e.printStackTrace();
				}
				main(null);
				System.out.println();
				break;
			}
			case 3:
			{
				try 
				{
					ReadFile obj = new ReadFile();
					obj.read();
				}
				catch (IOException e) 
				{
					System.out.println("file not found ");
					//e.printStackTrace();
				}
				main(null);
				System.out.println();
				break;
			}
			case 4:
			{
				main(null);
			}
			}
		}
		case 3:
		{
			System.out.println("Thank you for using this app. Have a NICE DAY.");
		}
		}
	}

}
