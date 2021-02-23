import java.lang.*;
import java.io.*;

class Hello
{
	public static void main(String arg[]) throws Exception
	{
		InputStreamReader iobj = new InputStreamReader(System.in);
		
		BufferedReader bobj = new BufferedReader(iobj);
		
		System.out.println("Enter your name");
		String name = bobj.readLine();
		
		System.out.println("Enter your age");
		int age = Integer.parseInt(bobj.readLine());
		
		System.out.println("Enter your percentage");
		float per = Float.parseFloat(bobj.readLine());
		
		System.out.println("Name is : "+name);
		System.out.println("Age is : "+age);
		System.out.println("Percentage is : "+per);
	}
}