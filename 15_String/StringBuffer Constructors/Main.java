////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//	This program demonstrate StringBuffer Class
//
//	1. StringBuffer class is in java.lang.StringBuffer
//	2.	it is used to manipulate a sequence of characters
//	3.	The StringBuffer class is "Mutable"
//	4. there are 3 types of constructor in a class StringBuffer
//		which are demonstrated below
//
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

import java.lang.*;

class Main
{
	public static void main(String arg[])
	{
		// there are 3 types of constructor in a StringBuffer Class
		
		StringBuffer sb1 = new StringBuffer();	// empty StringBuffer with default capacity of 16 bytes 
		StringBuffer sb2 = new StringBuffer(20);	// this constructor is used to create empty string with size of 20 bytes.
		StringBuffer sb3 = new StringBuffer("this is paratemerised constructor String");	// paratemeterized constructor.	

//	sb3 = "hello world";	// we cannot direclty assign a string to an object
// instead you have to use append() method.	
			
		sb1.append("this is 16 bytes");						//demonstration Default Constructor
		
		sb2.append("hello world is less than 20");			// demonstration of  constructor with user defined size			
		
		System.out.println(sb1);
		System.out.println(sb2);
		System.out.println(sb3);							// demonstration of parameterized constructor(depending on string length memory gets allocated)
	}	
}
