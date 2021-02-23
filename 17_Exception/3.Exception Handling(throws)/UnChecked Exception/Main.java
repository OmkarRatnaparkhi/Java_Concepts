//	 This program demonstrates Exception using throws keyword (example of unchecked exception)
//		> Use of try and catch block,
//		> try {}	is used to check whether the part of the program 
//		  has any exception
//		> And if there is Exception catch block is used to handle 
//		  that Exception

/*****************************************************************************************************************************************************************************
*
*	Checked exception - Checked are the exceptions that are checked at compile time. If some code within a method throws a checked exception, then the method must 
					    either handle the exception or it must specify the exception using throws keyword.
*
*	Unchecked exception - Unchecked are the exceptions that are not checked at compiled time. In C++, all exceptions are unchecked, so it is not forced by the compiler
*						  to either handle or specify the exception.It is up to the programmers to be civilized, and specify or catch the exceptions.
*
*****************************************************************************************************************************************************************************/

/*****************************************************************************************************************************************************************************
*
*	throw:  - throw keyword is used tp explicitly throw the exception class object. 
*
*	throws:  -  throws keyword is used after the function prototype which indicates our function may throw an exception. 
*			 -	The Java throws keyword is used to declare an exception. It gives an information to the programmer that there may occur an exception so it is 
*			    better for the programmer to provide the exception handling code so that normal flow can be maintained.
* 
******************************************************************************************************************************************************************************/	
import java.lang.*;
import java.util.*;

class Demo
{
	public void fun(int index) throws ArrayIndexOutOfBoundsException 		//This function may throw exception  //unchecked exception
	{
		int arr[] = {10,20,30,40};						// there are 4 elements in array.
		System.out.println("Element of array is " +arr[index]);
		
	}
}

class Main
{
	public static void main(String arg[])
	{	
		Scanner sobj = new Scanner(System.in); 
		System.out.println("Inside main");
		System.out.println("Enter index of array");
		int index = sobj.nextInt();
		
		Demo obj = new Demo();		//Object creation of user defined demo class.
		try
		{
			obj.fun(index);					//Function call inside try block because that funtion may throw exception
		}
		catch(ArrayIndexOutOfBoundsException ref) //Object of exception is catched in this block for handling exception. When there is exception this block will get execute.
		{
			System.out.println("Inside catch");	
		}
	}
}

/************************************************************************************************************************************************
|No.|  	throw																|		 throws														|
|	|  1)Java throw keyword is used to explicitly throw an exception.		|		1)Java throws keyword is used to declare an exception.		|
|	|  2)Checked exception cannot be propagated using throw only.			|		2)Checked exception can be propagated with throws.			|
|   |  3)Throw is followed by an instance.									|		3)Throws is followed by class.								|
|	|  4)Throw is used within the method.									|		4)Throws is used with the method signature.					|
|	|  5)You cannot throw multiple exceptions.								|		5)You can declare multiple exceptions e.g.					|
|	|	    																|		  public void method()throws IOException,SQLException.		|
|	|																		|																	|
************************************************************************************************************************************************/
