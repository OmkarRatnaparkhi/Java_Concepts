////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//	There are two ways in which we can create the string:-
//	1) Without using new keyword(String literal)
//	2) By using new keyword
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
import java.lang.*;

class Main
{
	public static void main(String arg[])
	{
		String s1 = "Hello World";				// when we do not use new string gets stored in String Constant Pool and for s1 and s2 that memory is shared
		String s2 = "Hello World";
		
		System.out.println(s1.hashCode());		//we get same hashCode i.e that string is loacated at same memory
		System.out.println(s2.hashCode());
		
		String s3 = new String("Hello World Demo");		//When we use new then that string is stored on heap here memory is not shared
		String s4 = new String("Hello World Demo");
		
		System.out.println(s3.hashCode());
		System.out.println(s4.hashCode());

	}	
}