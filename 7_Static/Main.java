/*
import java.lang.*;

class Hello
{
	public int i;
	public static int j;				//static characteristics
	
	public void fun()					// non staic method
	{
		System.out.println("Inside fun"+j); //-> non staic method can access static as well as non static member 
	}
	
	public static void gun()			//static method
	{
		System.out.println("Inside gun");
		// i++; -> (error: non-static variable i cannot be referenced from a static context) because inside staic method we can acess only the static members of a class
		//j++; -> allowed because staic method we can acess only the static members of a class
	}
}

class Main
{
	public static void main(String arg[])
	{
		Hello.gun(); 	//static method
		System.out.println("Value of j : "+Hello.j);
		
		Hello hobj = new Hello(); 		//object creation of hello class and refernce of object is hobj
		hobj.fun();
		System.out.println("Value pf i : "+hobj.i);
	}
}


import java.lang.*;

class Hello
{
	public int i = 11;
	public static int j = 21;				//static characteristics
	
	public void fun()					// non staic method
	{
		System.out.println("Inside fun"+j); //-> non staic method can access static as well as non static member 
	}
	
	public static void gun()			//static method
	{
		System.out.println("Inside gun");
	}
}

class Main
{
	public static void main(String arg[])
	{
		Hello.gun(); 	//static method
		System.out.println("Value of j : "+Hello.j);
		
		Hello hobj = new Hello(); 		//object creation of hello class and refernce of object is hobj
		hobj.fun();
		System.out.println("Value pf i : "+hobj.i);
	}
}


import java.lang.*;

class Hello
{
	public int i;
	public static int j;				//static characteristics
	
	public Hello()					//Constuctor
	{
		i = 11;
		j = 21; 	// we can intialize static variable in constructor but it is impractical. Note never intialize static variable in constructor 
	}
	
	public void fun()					// non staic method
	{
		System.out.println("Inside fun"+j); //-> non staic method can access static as well as non static member 
	}
	
	public static void gun()			//static method
	{
		System.out.println("Inside gun");
	}
}

class Main
{
	public static void main(String arg[])
	{
		Hello.gun(); 	//static method
		System.out.println("Value of j : "+Hello.j);
		
		Hello hobj = new Hello(); 		//object creation of hello class and refernce of object is hobj
		hobj.fun();
		System.out.println("Value pf i : "+hobj.i);
	}
}

*/




import java.lang.*;

class Hello
{
	public int i;
	public static int j;				//static characteristics

	static
	{
		System.out.println("Inside first static block");
	}
	
	static
	{
		System.out.println("Inside static block");
		j = 21;
	}

	public Hello()					//Constuctor
	{
		System.out.println("Inside constructor");
		i = 11;
	}
	
	public void fun()					// non staic method
	{
		// static int x;  it will give error because in java we cannot create static local variable inside function
		System.out.println("Inside fun"+j); //-> non staic method can access static as well as non static member 
	}
	
	public static void gun()			//static method
	{
		System.out.println("Inside gun");
	}
}

class Main
{
	static
	{
		System.out.println("Inside static of Main");
	}
	
	public static void main(String arg[])
	{
		System.out.println("Inside Main");
		
	//	Hello.gun(); 	//static method
	//	System.out.println("Value of j : "+Hello.j);
		
	//	Hello hobj = new Hello(); 		//object creation of hello class and refernce of object is hobj
	//	hobj.fun();
	//	System.out.println("Value pf i : "+hobj.i);
	}
}