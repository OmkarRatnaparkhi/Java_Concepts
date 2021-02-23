import java.lang.*;
import java.util.*;			//also we can write import java.util.Scanner;

class Hello
{
	public static void main(String arg[])
	{
		Scanner sobj = new Scanner(System.in); 		//sobj is reference of Scanner class
		
		System.out.println("Enter your name");
		String name = sobj.nextLine();
		
		System.out.println("Enter your age");
		int age = sobj.nextInt();
		
		System.out.println("Enter your percentage");
		float per = sobj.nextFloat();	
		
		System.out.println("Name is :"+name);
		System.out.println("Age is :"+age);
		System.out.println("Percentage is :"+per);
	}
}