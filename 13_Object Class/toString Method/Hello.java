import java.lang.*;
import java.io.*;

//toString() method returns the string representation of the object.

class Batch				//internally jvm performs:-  class Batch extends Object 
{
	public int Fees;		//Characteristic
	public String Name;
	public Batch(int no, String str)		//Constructor
	{
		Fees = no;						//Initialization of characteristics in Constructor.
		Name = str;
	}
	public String toString()	//Overiding toString method and writing our own logic
	{							//overriding the toString() method of the Object class, we can return values of the object.
		return Name+Fees;
	}
	
}
class Hello
{
	public static void main(String arg[])
	{
		Batch pobj = new Batch(13000,"PPA");
		System.out.println(pobj.toString());		//If we do not overide toString method then toString will give class name and hashcode example Batch@28a418c
													//After overiding toString method we get output : PPA13000
		
		Integer iobj = 12457;
		System.out.println(iobj.toString());		//12457 because it is interger
	}
}