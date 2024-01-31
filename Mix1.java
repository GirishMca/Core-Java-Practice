package multithreading;

public class Mix1 {

	public static void main(String[] args)
	{
		System.out.println(Thread.currentThread().getName()+""+Thread.currentThread().getId());
		
		MyThread thread1=new MyThread();
		MyThread thread2=new MyThread();
		
		thread1.start();
		thread2.start();
		

	}

}
  