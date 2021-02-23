// This program is used to demonstrate concept of generic interface.

//Class which implements the generic interface becomes generic class and by defaut method in that class are genric methods.

import java.lang.*;

interface Hello<T>						//generic interface
{
	T fun(T no1, T no2);				//Method from interface which is by defaut abstract due to the concept of interface.
}

class Demo<T> implements Hello<T>		//generic class 
{
	public T fun(T no1, T no2)			//generic method
	{
		return no1;
	}
}// class end.

class Main
{
	public static void main(String args[])
	{
		Demo<Integer> obj = new Demo<Integer>();		//creation of object of Demo class
		Integer iNo = obj.fun(10,20);					//function call.
		System.out.println(iNo);	
	}
}


