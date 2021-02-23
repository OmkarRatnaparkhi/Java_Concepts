package Marvellous.Batches;  // Creation of nested package	
import java.lang.*;		//Load the package into the memory

public class PPA		//Public class PPA is public not written default access specifier  is considerd
{
	public void sun()		//Method
	{
		System.out.println("Inside sun");
	}
}

/*
When we don't use any keyword explicitly, Java will set a default access to a given class, method or property. 
The default access modifier is also called package-private, which means that all members are visible within the 
same package but aren't accessible from other packages
*/