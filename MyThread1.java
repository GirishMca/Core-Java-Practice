package multithreading;

public class MyThread1
{

	public void run()
	{
		for(int i=0;i<=5;i++)
		System.out.println(Thread.currentThread().getName());
		
		

	}

}
