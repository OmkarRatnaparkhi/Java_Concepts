import java.lang.*;

//class Hello implements Runnable   -> we can also write this.
class Hello extends Thread
{
	public void run()  //Abstract method from thread class that has to be defined here and this method contains logic which has to be executed by thread. 
	{
		try
		{
			System.out.println("Inside run method for thread with id "+Thread.currentThread().getId());
			for(int i = 1; i <= 5; i++)
			{
				System.out.println("Inside thread " + "Name of thread : " + Thread.currentThread().getName()+" "+ " Id of thread : " + Thread.currentThread().getId() + " "+ i);
				Thread.sleep(1000);  //May create exception so wrote in try block
			}
		}
		catch(Exception e)			//Checked Exception
		{
			System.out.println("Exception occured in threading");
		}
	}	
}

class Example2
{
	public static void main(String args[])
	{
		System.out.println("Inside main thread");
		System.out.println(Thread.currentThread().getName());		//Thread class and currentThread is method  // Output - main 
 		System.out.println(Thread.currentThread().getId());

		Hello hobj1 = new Hello();				//First Object created of hello class which has refernce hobj1.
		Thread t1 = new Thread(hobj1,"First");

		Hello hobj2 = new Hello();				//Second Object created of hello class which has refernce hobj2.
		Thread t2 = new Thread(hobj2,"Second");          

		Hello hobj3 = new Hello();				//Third Object created of hello class which has refernce hobj3.
		Thread t3 = new Thread(hobj3,"Third");   
	
		t1.start();
		t2.start();
		t3.start();
	}
}