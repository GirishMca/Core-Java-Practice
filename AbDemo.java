public class AbDemo {

	public static void main(String[] args)
	{
	    GirishPhone obj = new GattuPhone();//can not instantiate the abstract class
	    obj.call();
	    obj.cook();
	    obj.dance();
	    obj.move();
	}
}

abstract class GirishPhone //Abstract Class
{
	public void call() 
	{
		System.out.println("calling....");
		
	}
	public abstract void move();//Abstract methods
	public abstract void dance();
	public abstract  void cook();
}

abstract class KashyapPhone extends GirishPhone
{
	public void move()
	{
		System.out.println("Moving...");
	}
}

class GattuPhone extends KashyapPhone     //Concrete class
{
	public void dance()
	{
		System.out.println("Dancing....");
	}
	public void cook()
	{
		System.out.println("Cooking...");
	}
}

