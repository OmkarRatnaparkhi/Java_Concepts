import java.lang.*;
import java.io.*;
/*
When we allocate memory for anything in java programming JVM assign unique number to that memory that unique number is called as hashcode.
Java Object hashCode() is a native method and returns the integer hash code value/number of the object.
*/

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
		Batch pobj = new Batch(13000,"PPA");		//Object creation of Batch class with passing some parameters to it
		
		Batch lobj = new Batch(11000,"LSP");		//Object creation of Batch class with passing some parameters to it
		
		System.out.println("Hashcode of PPA object "+pobj.hashCode());		//hashCode() method is used to give hashcode which is unique number of object for identification purpose.
		System.out.println("Hashcode of LSP object "+lobj.hashCode());
	}
}