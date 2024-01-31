package multithreading;

public class Mix {

	public static void main(String[] args)
	{
		MyThread thread1=new MyThread();
		MyThread thread2=new MyThread();
		MyThread thread3=new MyThread();
		
		thread1.start();
		try
		{
			thread1.join();
		}
		catch(InterruptedException e)
		{
			System.out.println(e);
		}
		thread2.start();
		try {
			thread2.join(3000);
		}
		catch(InterruptedException e)
		{
		System.out.println(e);
		}
		thread3.start();  
		
		

	}

}
