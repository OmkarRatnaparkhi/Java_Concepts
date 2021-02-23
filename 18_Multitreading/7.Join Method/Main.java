//This program demonstrate the concept of join method.
/****************************************************************************************************************************************************************************
*	
*	join method :- 
*	java.lang.Thread class provides the join() method which allows one thread to wait until another thread completes its execution. If t is a 
*	Thread object whose thread is currently executing, then t.join() will make sure that t is terminated before the next instructionis executed 
*	by the program.
*
*	If there are multiple threads calling the join() methods that means overloading on join allows the programmer to specify a waiting period. 
*	However, as with sleep, join is dependent on the OSfor timing, so you should not assume that join will wait exactly as long as you specify.
*
*1)	join(): It will put the current thread on wait until the thread on which it is called is dead. If thread is interrupted then it will throw InterruptedException.
*	Syntax : public final void join()
*
*2)	join(long millis) :It will put the current thread on wait until the thread on which it is called is dead or wait for specified time (milliseconds).
*	Syntax : public final synchronized void join(long millis)
*
*3)	join(long millis, int nanos): It will put the current thread on wait until the thread on which it is called is dead or wait for specified time (milliseconds + nanos).
*	Syntax : public final synchronized void join(long millis, int nanos)
*
*****************************************************************************************************************************************************************************/
import java.lang.*;

class Demo extends Thread
{
	// This method is considered as thread code
	public void run()
	{
		Thread ref = Thread.currentThread();
		System.out.println(ref.getName());
	}
}

class Main
{
	public static void main(String args[])
	{
		Demo dobj = new Demo();
		Thread t1 = new Thread(dobj,"First");
		Thread t2 = new Thread(dobj,"Second");
		Thread t3 = new Thread(dobj,"Third");
		Thread t4 = new Thread(dobj,"Fourth");
		Thread t5 = new Thread(dobj,"Fifth");
		Thread t6 = new Thread(dobj,"Sixth");
		
		t1.start();
		try
		{
			t1.join();
		}
		catch(Exception ref)
		{}
		t2.start();
		t3.start();
		t4.start();
		t5.start();
		t6.start();		
	}
}