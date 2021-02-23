// This program is used to demonstrate ArrayList
import java.lang.*;
import java.io.*;
import java.util.*;

class Main
{
	public static void main(String arg[])
	{
		// Create ArrayList of strings
		// This similar as template in C++
		ArrayList <String> al = new ArrayList<String>();
		
		// Insert the contents in ArrayList
		al.add("First");
		al.add("Second");
		al.add("Third");
		al.add("Fourth");
		al.add("Fifth");
		System.out.println("\nContents of Array List \n" + al);
		
		al.add(3,"new");
		System.out.println("\nContents of Array List \n" + al);
		
		// We can insert the data at last
		al.add("Two");
		System.out.println("\nContents of Array list \n" + al);

		al.add("Third");
		System.out.println("\nContents of Array list \n" + al);		

		// We can remove element from any specified position
		al.remove(3);
		System.out.println("\nContents of Array list \n" + al);

		// We can replace the element from specified position
		al.set(3,"New_Data");
		System.out.println("\nContents of Array list \n" + al);		
		
		//size() method gives count of elements present in arrayList.
		System.out.println("\nNumber of elements in Array list are : " + al.size());
		
		System.out.println("First occurance of Third is : "+ al.indexOf("Third"));
		System.out.println("First occurance of Third is : "+ al.lastIndexOf("Third"));
		
		// We can use iterator to iterate the Array list
		System.out.println("\nIterating the Array list");
		Iterator it = al.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next() + " ");
		}
		
		// We can remove all elements from arraylist
		al.clear();		

	}
}