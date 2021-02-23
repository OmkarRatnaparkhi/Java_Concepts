//	 This program demonstrates Exception using throws keyword (Checked Exception)
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
*	throws:  -  throws keyword is used after the function prototype which indicates our function may throw an exception. 
*			 -	The Java throws keyword is used to declare an exception. It gives an information to the programmer that there may occur an exception so it is 
*			    better for the programmer to provide the exception handling code so that normal flow can be maintained.
* 
******************************************************************************************************************************************************************************/	
import java.lang.*;
import java.util.*;
import java.io.*;

class Demo
{
	public void fun() throws IOException			//Checked Exception
	{
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		System.out.println("Enter your name");
		String str = br.readLine();
		
	}
}

class Hello
{
	public static void main(String arg[])
	{	
		Demo obj = new Demo();		//Object creation of user defined demo class.
		try
		{
			obj.fun();				//Function call inside try block because that funtion may throw exception
		}
		catch(Exception ref) //Generic Exception
		{
			
		}
		//we can also write catch(IOException ref) but this will only catch object of IOException class.
	}
}
