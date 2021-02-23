/***************************************************************************************************************************************************************
*
*	Synchronized in Java :
*	Multi-threaded programs may often come to a situation where multiple threads try to access the same resources and finally produce 
*	erroneous and unforeseen results.
*
*	So it needs to be made sure by some synchronization method that only one thread can access the resource at a given point of time.
*
*	Java provides a way of creating threads and synchronizing their task by using synchronized blocks. Synchronized blocks in Java are 
*	marked with the synchronized keyword. A synchronized block in Java is synchronized on some object. All synchronized blocks synchronized 
*	on the same object can only have one thread executing inside them at a time. All other threads attempting to enter the synchronized block
*	are blocked until the thread inside the synchronized block exits the block.
*
*	This synchronization is implemented in Java with a concept called monitors. Only one thread can own a monitor at a given time. When a thread 
*	acquires a lock, it is said to have entered the monitor. All other threads attempting to enter the locked monitor will be suspended until the 
*	first thread exits the monitor.
*
*
*	Synchronized Method:
*	If you declare any method as synchronized, it is known as synchronized method.
*
*	Synchronized method is used to lock an object for any shared resource.
*
*	When a thread invokes a synchronized method, it automatically acquires the lock for that object and releases it when the thread completes its task.
*
***************************************************************************************************************************************************************/

import java.lang.*;

class Hello extends Thread
{
	synchronized public void Display()					////Thread Synchronized Method
	{
		for(int i = 1; i <= 500; i++)
		{
			System.out.println(Thread.currentThread().getName() +" " +i);
			//Thread ref = Thread.currentThread();				//Just created ref reference to current Thread which is running at that time.
			//System.out.println(ref.getName()+" : "+i);		//This comment section gives same output as line 36 i.e above line.
		}
	}

	public void run()
	{
		Display();
	}
}

class Main
{
	public static void main(String args[])
	{
		
		Hello hobj = new Hello();					// Creating object of Hello class which extends thread class
		Thread t1 = new Thread(hobj,"First");		// Create Thread class object and attach to above object
		Thread t2 = new Thread(hobj,"Second");
		
		t1.start();									// Start the execution of thread
		t2.start();
	}
}