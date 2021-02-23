import java.lang.*;

//	finalize() is called by the garbage collector on an object when garbage collection determines that there are no more references to the object. 
//	A subclass overrides the finalize method to dispose of system resources or to perform other cleanup.

class Demo
{
	public int iNo,iNo2;	//characteristics
	
	public Demo()				//Constructor
	{
		System.out.println("Inside Constructor");
	}
	
	protected void finalize()		//finalize method overide
	{
		System.out.println("Inside finalize");
	}
}//end of class

class Hello
{
	public static void main(String arg[])
	{
		Demo obj = new Demo() ;		//Object creation of class Demo
		obj = null;					//Dereferring the object
		System.gc();				//Explicit call to garbage collector. 		//gc = garbage collector 
	}	
}