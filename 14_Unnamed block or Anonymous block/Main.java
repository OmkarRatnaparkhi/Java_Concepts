/********************************************************
*
*	1.This program demonstrate the concept of unnamed block
*	2.Unnamed block is also known as "Instance Initialization *		block".
*	3. This block is executed before the constructor
*	4. even if the unnamed block is written after
*		constructor,that blocked is always executed before
*		constuctor 
*		
*	5. but if we write unnamed block in the class before
*	  main then that block is not executed. 
*
********************************************************/

import java.lang.*;

class Demo
{
	public int iNo;										//characteristics
	public double interest;									//characteristics
	
	{													//Anonymous block - to wrie the common code from constructor.
		System.out.println("Inside unnamed block");
		interest = 10.5;
	}
	
	public Demo()											//Default Constructor
	{
		iNo = 0;											//initializing characteristics
		System.out.println("Inside Default Constructor");
	}
	
	public Demo(int x)										//Parameterized Constructor
	{
		iNo = x;											//initializing characteristics with parameter accepted from user
		System.out.println("Inside Parameterized Constructor");
	}
}

class Main
{
	public static void main(String arg[])
	{
		Demo obj1 = new Demo();
		Demo obj2 = new Demo(11);
		
		System.out.println();
		System.out.println(obj1.iNo);
		System.out.println(obj1.interest);
		
		System.out.println(obj2.iNo);
		System.out.println(obj2.interest);
	}	
}