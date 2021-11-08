import java.io.*;
import java.util.Scanner;

class StreamDemo
{
	public static void main(String[] args)throws IOException
	{
		String yourFile = "input.txt";
    
		// Scanner sc = new Scanner(System.in);
		// String yourContent=sc.nextLine();      
		String yourContent="Genius Ganesh";
		File tmpDir = new File(yourFile);
    
	  	
		if(tmpDir.exists()){  
			FileOutputStream fos = new FileOutputStream(yourFile);
    	
			fos.write(yourContent.getBytes());
    	
			fos.flush();
    	
			fos.close();
  			FileInputStream fis = new FileInputStream(yourFile);
			int data;
			 int count =0;
			while((data=fis.read()) != -1)
			{
				System.out.print((char)data);count++;
			}
			System.out.println(count);
		}
		// float s = 1.2356f;
		// System.out.printf("%.2f\n",s);
		// float res =Float.parseFloat(String.format("%.2f",s));
		// System.out.println(res);
	}
}