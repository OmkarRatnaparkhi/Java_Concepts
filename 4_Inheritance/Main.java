import java.lang.*;

class Base
{
	public int i = 11;		// characteristics
	public int j = 21;		// characteristics
	
	public Base()			//Constructor
	{
		System.out.println("Base Constructor");
	}
	
	public void fun()		//Behaviour
	{
		System.out.println("Base fun");
	}

}

class Derived extends Base
{
	public int x = 51;	// characteristics
	
	public Derived()
	{
		System.out.println("Inside Constructor");
	}
	
	public void fun()
	{
		System.out.println("Derived fun");
		super.fun();
		System.out.println("Value of base i : " +super.i);
		System.out.println("Value of derived x : " +this.x);
	}
	
	public void gun()
	{
		System.out.println("Derived gun");
	}
}

class Main
{
	public static void main(String arg[])
	{
		Base bobj = new Base();
		Derived dobj = new Derived();
	
		System.out.println();
		
		bobj.fun();
		dobj.fun();
		dobj.gun();
		
		System.out.println();
		
		Base bref = new Derived(); 		//Upcasting
		bref.fun();
	}	
}