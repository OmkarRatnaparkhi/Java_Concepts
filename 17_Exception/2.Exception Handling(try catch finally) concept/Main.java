//This program Demonstrates Exception handling Explicitly by the Programmer

/*****************************************************************************************************************************************************************************
*
*	try block :  - try block is a block which contains exception prone code, this bloc contains such a code which may generate an exception.	 
*				 - the code which is written inside try block gets executed under the strict observation of jvm
*
*	catch block:  - catch block is a block which is written to handle the exception.
*
*	finally block:  - The code which written inside the finally block gets executed irrespective of the exception.
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

class Main
{
	public static void main(String arg[])
	{	
		int arr[] = {10,20,30,40};						// there are 4 elements in array.
		Scanner sobj = new Scanner(System.in);
		System.out.println("Inside main");
		System.out.println("Enter index of array");
		int index = sobj.nextInt();
		
		//In this program Exception is dependent on what user is giving index. 
		
		try//Exception prone code
		{
			System.out.println("Inside try");
			System.out.println("Element of array is " + arr[index]);		//Here exception may occur if it is accessing other than its memory i.e from 4th index. And when 
			System.out.println("After Display");							//exception occurs it will go in catch block where it is handled.
		}
		
		catch(ArrayIndexOutOfBoundsException obj)//Exception handler
		{
			System.out.println("Inside catch");								//this block is written to handle exception, when there is exception.
			System.out.println("You are accessing other memory space");
		}	

		finally//Resource deallocater
		{
			System.out.println("Inside finally");							//this block will run always.
		}
		System.out.println("End of main");
	}
}

/*****************************************************************************************
*
*	finally :-
*	
*	1. finally is such a block which is always executed
*	2. If a try block has some Exception
* 		and we have multiple catch block
*	 	if those multiple catch blocks are unable to handle 
*		those Execution then we use finally block.
*	3. Even if the Exception is handled in any of the catch 
*		block the finally block gets Executed ,because finally 
*		is always Executed.
*
*****************************************************************************************/
