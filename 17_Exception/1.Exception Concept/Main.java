//This program demonstrates the concept of Exception

/*****************************************************************************************************************************************************************************
*
*	Exception : An exception is an event, which occurs during the execution of a program, that disrupts the normal flow of the program's instructions.
*				The Exception Handling is one of the powerful mechanism to handle the runtime errors so that normal flow of the application can be maintained.
*
******************************************************************************************************************************************************************************/	
import java.lang.*;

class Hello
{
	public static void main(String arg[])
	{
		int arr[] = {10,20,30,40};						// there are 4 elements in array.
			
		System.out.println(arr[4]);
	// we are trying to print the fourth element of array. This is abnormal condition which is occurring at run time.
	// therefore Exception is occurred.	
	
	// Whole Program will get compile but at run time program will run upto line 17 but at line 17 there is exception hence at this point program will get terminatted abnormally 
	//	and further instructions(lines) will not get executed. 
	// Hence we have to handle this exception and avoid abnormal termination.
		System.out.println("Inside main");
	}
}