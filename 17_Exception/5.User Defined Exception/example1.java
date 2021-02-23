//User Defined Exception
//In this program we creating such exception in which age below 18 is underage is invalid. 


//Standard level program. You can also refer below program.
import java.lang.*;
import java.util.*;
import java.io.*;

class AgeInvalid extends Exception 			//User Defined Exception
{
	public AgeInvalid(String str)
	{
		super(str);
	}	
}

class Main
{
	public static void main(String arg[])
	{
			Scanner sobj = new Scanner(System.in);
			System.out.println("Enter your age");
			int age = sobj.nextInt();
			
			try
			{
				if(age < 18)
				{
					throw new AgeInvalid("Age below 18 is underage so you are invalid");
				}
			}
			catch(AgeInvalid ref)
			{
				System.out.println(ref);
			}
	}
}

/*
import java.lang.*;
import java.util.*;
import java.io.*;

class AgeInvalid extends Exception 			//User Defined Exception
{
	//public 
}

class Main
{
	public static void main(String arg[])
	{
			Scanner sobj = new Scanner(System.in);
			System.out.println("Enter your age");
			int age = sobj.nextInt();
			
			try
			{
				if(age < 18)
				{
					throw new AgeInvalid();
				}
			}
			catch(AgeInvalid ref)
			{
				System.out.println("Age below 18 is underage so you are invalid");
			}
	}
}
*/