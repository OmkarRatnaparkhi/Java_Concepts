import java.lang.*;

class Base
{
	public int i = 11;
	
	public Base(int x)
	{
		System.out.println("Base Parameterized");
	}
	public void fun()
	{
		System.out.println("Base fun");
		System.out.println(this.i);
	}
}

class Derived extends Base
{
	public int x = 21;
	
	public Derived()
	{
		super(50);
		System.out.println("Derived Constructor");
	}
	
	public void gun()
	{
		System.out.println(super.i);
		System.out.println(this.x);
		super.fun();
	}
}

class Main
{
	public static void main(String arg[])
	{
		Derived dobj = new Derived();
		
		dobj.gun();
	}
}



/*
import java.lang.*;

class Base
{
	public int i = 11;
	
	public Base(int x)
	{
		System.out.println("Base Parameterized");
	}
	public void fun()
	{
		System.out.println("Base fun");
		System.out.println(this.i);
	}
}

class Derived extends Base
{
	public int x = 21;
	
	public Derived()
	{
		System.out.println("Derived Constructor");
	}
	
	public void gun()
	{
		System.out.println(super.i);
		System.out.println(this.x);
		super.fun();
	}
}

//Main.java:70: error: constructor Base in class Base cannot be applied to given types;
        {
        ^
//  required: int
//  found:    no arguments
//  reason: actual and formal argument lists differ in length
//1 error


class Main
{
	public static void main(String arg[])
	{
		Derived dobj = new Derived();
		
		dobj.gun();
	}
}
*/