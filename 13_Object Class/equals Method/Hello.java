import java.lang.*;
import java.io.*;

class Batch				//internally jvm performs:-  class Batch extends Object 
{
	public int Fees;		//Characteristic
	public String Name;
	public Batch(int no, String str)		//Constructor
	{
		Fees = no;						//Initialization of characteristics in Constructor.
		Name = str;
	}
	public String toString()
	{					
		return Name+Fees;
	}
	
}
class Hello
{
	public static void main(String arg[])
	{
		
		Batch pobj = new Batch(13000,"PPA");		
		Batch lobj = new Batch(13000,"PPA");		
		
		if(pobj == lobj)		// by comparing with == operator it returns true or false value by comparing its hashCode but not data.
		{
			System.out.println("Same objects");
		}
		else
		{
			System.out.println("Different objects"); 	//Different objects
		}
		
		//by using equals method content of object is compared. 
		//to achieve accurate result of equals method we have to overide that method in our class for user defined object.
		
		Integer iobj1 = 11;
		Integer iobj2 = 11;
		Integer iobj3 = 21;
		System.out.println(iobj1.equals(iobj2)); 		// we get accepted output as equals method is used for primitive object i.e inbuilt object.  
		System.out.println(iobj1.equals(iobj3));		// we get accepted output as equals method is used for primitive object i.e inbuilt object.
		
//		Integer iobj1 = 11;
//		Integer iobj2 = 11;
//		Integer iobj3 = iobj1;	 //here new object iobj3 does not get created, here iobj3 is just reference which referring to iobj1 i.e both iobj1 & iobj3 are referring to same object this is called as shallow copy.  
//		System.out.println(iobj1.hashCode());	//11	//when we want to display hashCode of non user defined i.e primitive the there is possibility that it may display data of that object
//		System.out.println(iobj3.hashCode());	//11	//when we want to display hashCode of non user defined i.e primitive the there is possibility that it may display data of that object
//		System.out.println(iobj1.equals(iobj2)); 	 
//		System.out.println(iobj1.equals(iobj3));			
	}
}