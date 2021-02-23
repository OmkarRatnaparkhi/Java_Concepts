
//In this program we have used the concept of generic method.

import java.lang.*;

public class Main
{
	public static void SpecificMethodDisplay(int arr[])	//Specific Method		//non-static method Specific Method(int[]) cannot be referenced from a static context hence kept static
	{
		for (int Data : arr)
		{
			System.out.print(Data+"\t");
		}
		System.out.println();
	}
	
	public static <T> void GenericMethodDisplay(T arr[])	//Generic method.
	{
		for (T element : arr)
		{
			System.out.print(element+"\t");
		}
		System.out.println();
	}	
	
	public static void main(String arg[])
	{
		int iarr[] = {1,2,3,4,5};
		SpecificMethodDisplay(iarr);							//pass an int array to Specific method
		
		Integer intarray[] = {1,2,3,4,5};						// pass an Integer array to Generic method
		GenericMethodDisplay(intarray);
	
		Character chararray[] = {'a','b','c','d','e'};
		GenericMethodDisplay(chararray);						// pass a Character array to Generic method
		
		Double doubleArray[] = { 1.1, 2.2, 3.3, 4.4 ,5.5};
		GenericMethodDisplay(doubleArray);						// pass a Double array to Generic method
	}
}