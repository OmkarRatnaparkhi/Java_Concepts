import java.lang.*;

interface RBI		//Interface
{
	int Amt = 100000;			//by default public static final chracteristic
	double LoanInterest();		//every method in interface id by default abstract and there is no need to use abstract keyword
	double FDInterest();
	
	//we cannot write constructor in inteface.
}

class SBI implements RBI		//class -> is clss SBI is going to implement interface RBI then SBI class has to provide the defination of all methods from the interface RBI
{
	public double LoanInterest()
	{
		return 5.2;
	}
	
	public double FDInterest()
	{
		return 4.2;
	}
}

class BOI implements RBI		//class -> is clss SBI is going to implement interface RBI then SBI class has to provide the defination of all methods from the interface RBI
{
	public double LoanInterest()
	{
		return 6.2;	
	}
	
	public double FDInterest()
	{
		return 5.2;	
	}
}

class Main
{
	public static void main(String arg[])
	{
		//RBI robj = new RBI();		//Error : We cannot create object of interface
		RBI robj;					// robj just reference
		
		SBI sobj = new SBI();		// object creation of class SBI
		BOI bobj = new BOI();		// object creation of class BOI
		
		System.out.println(sobj.FDInterest());
		System.out.println(bobj.FDInterest());
		
		System.out.println(sobj.Amt);
//		sobj.Amt++;			// error: cannot assign a value to final variable Amt i.e in interface we can write chracteristics but they are by default public static final i.e due to final value cannot change 	
	
		System.out.println(RBI.Amt); // Amt characteristic is accessed without creation of object of RBI becuase it is default public static final i.e due to static can be accessed without creating object 
	}
}