import java.lang.*;

class Base
{
	public void fun()
	{
		System.out.println("Inside base fun");
	}
}

class Derived extends Base
{
	public void fun()
	{
		System.out.println("Inside Derived fun");
	}
}

class Main
{
	public static void main(String arg[])
	{
		Base bref = new Derived();
		bref.fun();
	}
}