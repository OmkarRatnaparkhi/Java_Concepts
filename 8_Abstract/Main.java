import java.lang.*;

abstract class RBI		// Parent Class
{
	public int IFSC = 51;	//characteristics
	
	public RBI()		//Constructor
	{
		System.out.println("Inside constructor of RBI");
	}
	
	public void Details()
	{
		System.out.println("Details of bank");
	}
	
	abstract public void Interest();	//Abstract method 		//In c++ -> virtual void Interest() = 0;
}

class PNB extends RBI		// child class
{
	public void Interest()		//Concrete Method
	{
		System.out.println("Interest rate is 5.5%");
	}
	
	public void FD()
	{
		System.out.println("FD of PNB");
	}
}

class Main
{
	public static void main(String arg[])
	{
		System.out.println("Inside main");
		
//		RBI robj = new RBI(); 	//  RBI is abstract; cannot be instantiated -> Not allowed due to abstract class
//		RBI robj;				//Allowed because robj is just reference and do not get physical memory

//		RBI robj = new PNB();	//upcastig 		
//		robj.Details();
//		robj.Interest();
//		robj.FD();		// Error due to concept of Method Overiding and upcasting because compliler goes to find FD method in Parent class(RBI) due to Parent class reference.
		
		PNB robj = new PNB();	//Oject of PNB class created 		
		robj.Details();
		robj.Interest();
		robj.FD();
	}
}