package demo;

import java.io.FileInputStream;

public class PropertiesClassDemo {

	public static void main(String[] args)  throws IOException
	{
		Properties p = new Properties();
		
		FileInputStream fis = new FileInputStream("CourseDetails.properties");
		
		//p.read(fis);
		
		System.out.println("display the data from the file --> "+p);
		System.out.println("================================== "+p);
		
		
		

	}

}
