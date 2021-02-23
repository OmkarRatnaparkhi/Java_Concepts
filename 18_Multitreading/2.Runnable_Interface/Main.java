// This program demonstrate concept of runnable interface and multithreading.
import java.lang.*;

class Demo implements Runnable
{
	// This method is considered as thread code
	public void run()
	{
		System.out.println("Thread started...");
	}
}

class Main
{
	public static void main(String args[])
	{
		// Creating object of demo class which extends thread class
		Demo d1 = new Demo();
		Demo d2 = new Demo();
		
		// Create Thread class object and attach to above object		
		Thread t1  = new Thread(d1);
		Thread t2  = new Thread(d2);

		System.out.println("Inside main");

		// Start the execution of thread
		t1.start();
		t2.start();
	}
}