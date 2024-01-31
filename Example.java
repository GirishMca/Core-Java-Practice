package mypackage;

public class Example {

	public static void main(String[] args) {
		try
		{
			int a[]=new int[5];
			a[2] =50/5;
			System.out.println(a[2]);
		}
		catch(ArithmeticException e) 
		{
			System.out.println("warning : cant divide a number by zero");
			
		}
		finally
		{
			System.out.println("Finally block always excuted");
			
			
		}

	}

}


