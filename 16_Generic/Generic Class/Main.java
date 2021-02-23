//In this program we have used the concept of generic class.

import java.lang.*;

class Generic_Demo<T>
{
	private T no;
	
	public void set(T x)
	{
		this.no  = x;
	}
	
	public T get()
	{
		return no;
	}
}

public class Main
{	
	public static void main(String arg[])
	{
		// Create object by specifying integer
		Generic_Demo<Integer> iobj = new Generic_Demo<Integer>();
		
		// Create object by specifying String
		Generic_Demo<String> sobj = new Generic_Demo<String>();

		iobj.set(new Integer(10));

		sobj.set(new String("Hello World"));
		
		System.out.printf("Integer Value :%d\n\n", iobj.get());
		System.out.printf("String Value :%s\n", sobj.get());
	}
}
/***************************************************************************************************************************
*	1)	Whenever we create object of generic class java compiler creates nongeneric version oc that class 
*		which is called as "erasure".
*	2)	To implement generic behaviour, java compiler apply type erasure. Type erasure is a process in which 
*		compiler replaces a generic parameter with actual class or bridge method. In type erasure, compiler 
*		ensures that no extra classes are created and there is no runtime overhead.
***************************************************************************************************************************/