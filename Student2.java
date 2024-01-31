package pack;

public class Student2 implements OuterInterface.NestedInterface
{
	public void nestedDisplay()
	{
		System.out.println("NestedInterface method overridden");
	}
}

