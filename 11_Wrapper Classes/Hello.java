import java.lang.*;

class Hello
{
	public static void main(String arg[])
	{
		int i = 11;			//Primitive datatype
		Integer iobj = i;	//Wrapper class  // Auto boxing
		
		System.out.println(iobj);
		System.out.println(i);
		
		int j = iobj;						// Auto unboxing
		System.out.println(j);
	}
}