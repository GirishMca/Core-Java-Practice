package pack;

public class Student3 implements OuterInterface,OuterInterface.NestedInterface
{
	public void nestedDisplay()
	{
		System.out.println("OuterInterface method overridden");
	}
	public void nestedDisplay()
	{
		System.out.println("NestedInterface method overridden");
		
	}
}


