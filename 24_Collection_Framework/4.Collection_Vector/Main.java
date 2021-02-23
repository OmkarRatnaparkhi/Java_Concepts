// This program is used to demonstrate Vector

import java.lang.*;
import java.io.*;
import java.util.*;

class Main
{
	public static void main(String args[]) throws Exception
	{
		// Create Vector of integers
		// In this case vector if size 10 gets created
		Vector <Integer> v1 = new Vector<Integer>();

		// We can create vector as in which size of vector is 50
		Vector <Integer> v2 = new Vector<Integer>(50);
		
		// We can create vector as in which size of vector is 50 and when vector become full its size gets incremented by 10	
		Vector <Integer> v3 = new Vector<Integer>(50,10);

		// Insert the contents in Vector
		v1.add(10);			
		v1.add(20);
		v1.add(30);
		v1.add(40);
		v1.add(50);
		System.out.println("Contents of Vector \n" + v1);
		
		// We can insert data at specified position
		v1.add(3,11);
		System.out.println("\nContents of Vector \n "+ v1);

		// We can remove element from any specified position
		v1.remove(3);
		System.out.println("\nContents of Vector \n" + v1);

		// We can replace the element from specified position
		v1.set(3,21);
		System.out.println("\nContents of Vector \n" + v1);

		System.out.println("\nNumber of elements in Vector are : " + v1.size());

		System.out.println("\nFirst occurance of Third is : "+ v1.indexOf(21));

		System.out.println("Last occurance of Third is : "+ v1.lastIndexOf(21));

		// We can use iterator to iterate the Vector
		System.out.println("\nIterating the Vector");
		Iterator it = v1.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next() + " ");
		}
		
		// We can remove all elements from Vector
		v1.clear();
	}
}


/***********************************************************************************************************************************************************************
ArrayList	vs	Vector
- ArrayList is not synchronized.	
- Vector is synchronized.

- ArrayList increments 50% of current array size if the number of elements exceeds from its capacity.	
- Vector increments 100% means doubles the array size if the total number of elements exceeds than its capacity.

- ArrayList is not a legacy class. It is introduced in JDK 1.2.	
- Vector is a legacy class.

- ArrayList is fast because it is non-synchronized.	
- Vector is slow because it is synchronized, i.e., in a multithreading environment, it holds the other threads in runnable or non-runnable state until 
  current thread releases the lock of the object.

- ArrayList uses the Iterator interface to traverse the elements.	
- A Vector can use the Iterator interface or Enumeration interface to traverse the elements.
***********************************************************************************************************************************************************************/