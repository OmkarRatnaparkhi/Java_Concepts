import java.lang.*;					//Load the package into the memory
import Marvellous.Hello;			//Load the package into the memory
import Marvellous.ABC;				//Load the package into the memory
import Marvellous.Batches.PPA;		//Load the package into the memory

class Demo										//class name
{
	public static void main(String arg[])		// Entry point function
	{
		System.out.println("Inside main");
		Hello hobj = new Hello();				//Object creation of Hello class which has reference hobj
		hobj.fun();								//Method called of Hello class
		
		ABC aobj = new ABC();					//Object creation of ABC class which has reference aobj
		aobj.gun();								//Method called of ABC class
		
		PPA pobj = new PPA();					//Object creation of PPA class which has reference pobj
		pobj.sun();								//Method called of PPA class
	}
}