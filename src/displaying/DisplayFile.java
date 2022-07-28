package displaying;

import java.io.File; 
import java.io.IOException;
import java.util.Arrays;

public class DisplayFile {
	public void Display() throws IOException
	{
		File path = new File("D:\\simplilearn\\phase1project\\");
	      //List of all files and directories
	      File contentsArr[] = path.listFiles();
	      Arrays.sort(contentsArr);
	      System.out.println("----------- List of all the Files -----------\n");
	      System.out.println("Location -- "+path+"\n");

	      for(int i=0; i<contentsArr.length; i++) 
	      { 
	          System.out.println(i+1+". "+contentsArr[i].getName());
	          System.out.println();
	      }
	}

}
